# Data Integration with StreamSets

This lab guides you through setting up a complete data integration flow using **StreamSets**, from environment setup to building a credit scoring machine learning pipeline.

---

## 📌 Prerequisites

Before you begin, ensure you have:
- A compatible operating system (Linux/macOS/Windows WSL)
- Docker & Docker Compose installed
- Access to [StreamSets](https://cloud.streamsets.com/)
- Git installed

---

### Step 1. Setup StreamSets Platform  
Begin by installing and configuring the StreamSets platform environment.  
📂 [1. setup streamsets](https://github.com/Client-Engineering-Indonesia/workshop-maybank-2025/tree/main/Lab%203%20-%20Data%20Integration%20with%20Streamsets/1.%20setup%20streamsets)


### Step 2. (Optional) Setup StreamSets Engine (Data Collector)  
If you're running a self-managed instance or want full control over your pipelines, set up your own StreamSets Data Collector engine.  
📂 [2. setup data collector](https://github.com/Client-Engineering-Indonesia/workshop-maybank-2025/tree/main/Laba%203%20-%20Data%20Integration%20with%20Streamsets/2.%20setup%20data%20collector)


### Step 3. Setup Pipeline: Data Generator  
This step walks you through creating a simulated data generator pipeline to feed downstream processing.  
📂 [3. data generator](https://github.com/Client-Engineering-Indonesia/workshop-maybank-2025/tree/main/Lab%203%20-%20Data%20Integration%20with%20Streamsets/3.%20data%20generator)


### Step 4. Setup Pipeline: Machine Learning (Credit Scoring)  
Finally, build and deploy a machine learning pipeline for credit scoring using the previously generated data.  
📂 [4. credit pipeline](https://github.com/Client-Engineering-Indonesia/workshop-maybank-2025/tree/main/Lab%203%20-%20Data%20Integration%20with%20Streamsets/4.%20credit%20pipeline)

---

## Outcome

By completing this lab, you will:
- Understand StreamSets architecture and components
- Deploy pipelines from data generation to machine learning
- Simulate real-world data integration and scoring scenarios
