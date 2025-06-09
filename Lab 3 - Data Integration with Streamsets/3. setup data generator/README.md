### Start a Data Generator Pipeline
Go back to StreamSets Platform in Firefox/
Create and start a transaction generator from the pre-existing template using the instructions
below. The transaction data generated here will be used by the streaming pipeline you'll build in
Lab Exercise #1. Here are the steps:
1. Create a new pipeline:
2. Clicking Build
3. Click Pipelines
4. Select Create a pipeline

![image](https://github.com/user-attachments/assets/5ca26c7f-6f95-4730-810c-3e7b51f2b0ce)


1. Change the name to Financial Data Generator
2. Select Data Collector for the Engine Type
3. Select start with Sample Pipeline
4. Click Next

![image](https://github.com/user-attachments/assets/c64cee93-215a-4292-8f82-7fe3efdf6c99)

Click the link shown to select a Sample Pipeline.

![image](https://github.com/user-attachments/assets/170826e7-fca8-423a-a62c-9d58fe2d44bf)


5. Select User Samples on the far right
6. Select the Data Generator Example
7. Click Save

![image](https://github.com/user-attachments/assets/d911bd7e-3567-43eb-a7ee-d86e8fb553a8)


1. Make sure your engine is already selected. If your Authoring Engine is correct, click
Save & Open in Canvas.

![image](https://github.com/user-attachments/assets/275982c6-deb1-4f4a-a751-c1be2c0a4f37)

2. Select the engine you created
3. Click Save to your engine choice

![image](https://github.com/user-attachments/assets/34a2ed84-1e9d-4954-a1d5-4224c93acc9f)

4. Once your sample pipeline and engine are set
5. Click Save & Open in Canvas

![image](https://github.com/user-attachments/assets/05c03c71-586e-48fb-8819-3ba195d5c59f)

Your new pipeline should open like this:

![image](https://github.com/user-attachments/assets/7ac1340f-2bbc-40f1-be16-6eb3eeb9da21)

Click the Draft run drop down menu and
Click Start Pipeline

![image](https://github.com/user-attachments/assets/d847e8f9-e8e7-416c-88f8-a45fc22e4d41)

You should see increasing metrics for the record count bar graph that confirm the pipeline is
running.

![image](https://github.com/user-attachments/assets/897439e2-661d-4c1e-8282-5253263f75c6)

### Start a Risk Scoring Microservice Pipeline

Create and start a risk- scoring microservice from a pre-existing template using the instructions
below. The risk-scoring service will be used by the main streaming pipeline you will build later.
Click on Build
Select Pipelines
Click Create a pipeline:

![image](https://github.com/user-attachments/assets/aa1de67e-1788-4a4b-bbf4-6f9c86943065)

1. Set name. Enter Transaction Risk Scoring Microservice
2. Select Data Collector for the Engine Type
3. Select Start with Sample Pipeline
4. Click Next

![image](https://github.com/user-attachments/assets/71c7b29a-a283-44cd-b345-c24f59c910c7)

Click the Click here to select link to select a Sample Pipeline

![image](https://github.com/user-attachments/assets/0bbf5bd3-52fa-4acc-b4d8-814863c33d12)

5. Select User Samples on the far right
6. Select the Microservice Example
7. Click Save

![image](https://github.com/user-attachments/assets/182a78ad-6526-414f-8984-b60da901d41a)

4. Make sure your Authoring Engine is selected here (1). If your Authoring Engine is
correct,
Click Save & Open in Canvas :

![image](https://github.com/user-attachments/assets/226d720c-c9d3-4030-95fa-6e2ba120c186)

If your deployment is not set as the Authoring Engine
Click the Click here to select link

2. Select your engine choice
3. Click Save

![image](https://github.com/user-attachments/assets/87125034-b3ab-470c-a551-074139e9295b)


1. Once your sample pipeline and engine are set
5. Click the Save & Open in Canvas button

![image](https://github.com/user-attachments/assets/d10112f6-c91a-448e-a5ca-e9475f9fcb7a)

Click Draft Run at the top of the screen
Click Start Pipeline and it should look like this:

![image](https://github.com/user-attachments/assets/9b4963ec-4f56-4041-9e26-dda2b145d94a)

Note: Even though the pipeline is running, there are no metrics to display just yet because there
have not yet been any calls to this service.

