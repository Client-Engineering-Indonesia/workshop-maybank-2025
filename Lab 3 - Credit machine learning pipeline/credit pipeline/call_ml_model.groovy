import groovy.json.JsonOutput
import groovy.json.JsonSlurper
import java.net.HttpURLConnection
import java.net.URL
import java.io.OutputStreamWriter
import java.io.BufferedReader
import java.io.InputStreamReader

// Replace with actual IAM Token
def iamToken = "your_iam_token_here"
def arrayOfInputFields = [
    "ORDER_COUNT_Sum_L6M",
    "ORDER_COUNT_Sum_L1M",
    "PAYMENT_TYPE_boleto_PAYMENT_VALUE_Sum_L1M",
    "PAYMENT_TYPE_credit_card_ORDER_COUNT_Sum_L1M",
    "PAYMENT_TYPE_voucher_ORDER_COUNT_Sum_L1M",
    // Add the rest of the fields here...
]

def recordsToBeScored = []

// Prepare data to be scored
for (record in records) {
    def valuesToBeScored = []

    for (col in arrayOfInputFields) {
        def value = record.value[col] ?: 0  // Handle missing values by using 0 or a default value
        valuesToBeScored.add(value)
    }

    recordsToBeScored.add(valuesToBeScored)
}

// Define JSON request body
def requestBody = [
    input_data: [
        [
            fields: arrayOfInputFields,
            values: recordsToBeScored
        ]
    ]
]

// Convert request body to JSON
def jsonRequest = JsonOutput.toJson(requestBody)

// Define API endpoint
def urlString = "https://us-south.ml.cloud.ibm.com/ml/v4/deployments/7d9cbd48-17ff-41ad-b64e-5f58486e516c/predictions?version=2021-05-01"
def url = new URL(urlString)
def connection = url.openConnection() as HttpURLConnection

// Retrieve token from records (assumes token is the same for all records in the batch)
def token = records[0].value['token']

// Configure request
connection.setRequestMethod("POST")
connection.setDoOutput(true)
connection.setRequestProperty("Content-Type", "application/json")
connection.setRequestProperty("Accept", "application/json")
connection.setRequestProperty("Authorization", "Bearer ${token}")

// Send JSON data
try {
    OutputStreamWriter writer = new OutputStreamWriter(connection.outputStream, "UTF-8")
    writer.write(jsonRequest)
    writer.flush()
    writer.close()

    // Read response
    def responseCode = connection.responseCode
    def responseText = ""
    if (responseCode == 200) {
        def reader = new BufferedReader(new InputStreamReader(connection.inputStream))
        responseText = reader.lines().collect(Collectors.joining("\n"))
        reader.close()

        def jsonResponse = new JsonSlurper().parseText(responseText)
        
        def i = 0
        // Add predictions to records
        for (record in records) {
            record.value['ml_result'] = jsonResponse['predictions'][0]['values'][i]
            i = i + 1
            sdc.output.write(record)
        }
    } else {
        println "Error: HTTP ${responseCode}"
        def errorReader = new BufferedReader(new InputStreamReader(connection.errorStream))
        def errorResponse = errorReader.lines().collect(Collectors.joining("\n"))
        errorReader.close()
        println "Error Response: ${errorResponse}"
    }
} catch (Exception e) {
    println "Exception during API call: ${e.message}"
}
