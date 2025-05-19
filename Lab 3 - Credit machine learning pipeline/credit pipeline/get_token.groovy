import groovy.json.JsonSlurper
import java.net.HttpURLConnection
import java.net.URL
import java.io.OutputStreamWriter
import groovy.json.JsonOutput

// Ambil API key dari environment variable agar lebih aman
def apiKey = System.getenv("IBM_CLOUD_API_KEY") ?: "your-default-api-key"

// URL untuk request token IAM
def urlString = "https://iam.cloud.ibm.com/identity/token"
def url = new URL(urlString)

// Function untuk mendapatkan token IAM
def getIamToken() {
    try {
        def connection = url.openConnection() as HttpURLConnection

        // Configure request
        connection.setRequestMethod("POST")
        connection.setDoOutput(true)
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded")
        connection.setRequestProperty("Accept", "application/json")

        // Request body
        def requestBody = "grant_type=urn:ibm:params:oauth:grant-type:apikey&apikey=${apiKey}"
        connection.outputStream.withWriter("UTF-8") { it.write(requestBody) }

        // Read response
        def responseCode = connection.responseCode
        if (responseCode == 200) {
            def responseText = connection.inputStream.withReader("UTF-8") { it.text }
            def jsonResponse = new JsonSlurper().parseText(responseText)
            return jsonResponse.access_token
        } else {
            def errorResponse = connection.errorStream?.withReader("UTF-8") { it.text }
            println "Error: HTTP ${responseCode} - ${errorResponse}"
            return null
        }
    } catch (Exception e) {
        println "Exception while fetching token: ${e.message}"
        return null
    }
}

// Ambil token hanya sekali per batch (bukan setiap record)
def token = getIamToken()

// Jika token tidak bisa diambil, jangan crash, tetap jalankan SDC
if (!token) {
    println "⚠️  Token retrieval failed, setting token to 'UNAVAILABLE'"
    token = "UNAVAILABLE"
}

// Tambahkan token ke setiap record di batch
for (record in records) {
    record.value['token'] = token
    sdc.output.write(record)
}