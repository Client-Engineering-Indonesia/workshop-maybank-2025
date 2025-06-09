# Data Integration with StreamSets

This lab guides you through setting up a complete data integration flow using **StreamSets**, from environment setup to building a credit scoring machine learning pipeline.

Key Features of IBM StreamSets include:
1. No-Code Data Integration:
   IBM StreamSets allows data integrations to be implemented using a rich graphical environment,with drag and drop connectors and processors; no coding is required.
2. Schema Flexibility:
   IBM StreamSets is designed to handle dynamic and evolving data schemas, making it ideal for environments where data structures are constantly changing. It automatically adapts to schema changes, ensuring that data pipelines remain operational even when data formats shift.
3. Modular and Reusable Pipelines:
   IBM StreamSets promotes modularity through reusable pipeline fragments, parameterization and Job templates, allowing users to create and maintain complex pipelines more efficiently. This approach reduces redundancy and simplifies pipeline management.
4. Custom Data Transformations:
   With support for Groovy, Jython, and other scripting languages, IBM StreamSets allows users to embed custom logic within their pipelines. This flexibility ensures that specific business requirements can be met with the flexibility of custom scripting/coding.
5. Real-Time Monitoring and Debugging:
   IBM StreamSets provides robust monitoring and debugging tools, including comprehensive runtime metrics, snapshots, and previews, which help users identify and resolve issues quickly. This real-time visibility into pipeline performance ensures that data flows are optimized and
reliable.
6. Broad Connectivity:
   IBM StreamSets supports a wide range of connectors for popular data sources and targets, including databases, cloud storage, messaging systems, and more. This extensive connectivity makes it easy to integrate data across different platforms and technologies snologies.

### Prerequisites

Before you begin, ensure you have:
- A compatible operating system (Linux/macOS/Windows WSL)
- Docker & Docker Compose installed
- Access to [StreamSets](https://cloud.streamsets.com/)
- Git installed

### Outcome

By completing this lab, you will:
- Understand StreamSets architecture and components
- Deploy pipelines from data generation to machine learning
- Simulate real-world data integration and scoring scenarios

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
