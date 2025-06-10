Now that you have a streamsets account and have successfully accessed the StreamSets Control Hub portal, the next step is to deploy your engine to your virtual machine (VM). In this workshop, you will be provided with a TechZone VM environment for this purpose.

#### Streamsets Portal

1. **Create deployment on streamsets**
   - Go to the deployment tab and create a deployment
   <img width="1280" alt="image" src="https://github.com/user-attachments/assets/5cb6727b-7f0f-40ff-a92e-c0d5c703b3c1" />

   - Put deployment with `workshop_streamsets_deployment`
     <img width="1280" alt="image" src="https://github.com/user-attachments/assets/24d1563c-57ce-45ab-82eb-c49aad24d77c" />

   - In engine labels, put `workshop_streamsets`
     <img width="1280" alt="image" src="https://github.com/user-attachments/assets/23181402-ed16-4691-a1ae-44b8654996a2" />

---

#### Virtual Machine Portal
In this workshop, we will use PostgreSQL to store the data, so we will return to the VM portal to create the necessary table. Since Kafka has already been installed on the VM, there is no need to install it.

4. **Create the table**
  - Go to the postgres folder, then copy and paste this script
   ```python
   CREATE TABLE financial_transactions (
       transaction_id   VARCHAR(255),
       name             VARCHAR(255),
       address          VARCHAR(255),
       city             VARCHAR(255),
       state            VARCHAR(255),
       account_number   VARCHAR(255),
       account_type     VARCHAR(255),
       amount           DECIMAL(10, 2),
       risk_score       INTEGER,
       type             VARCHAR(255)
   );
   ```
   <img width="1281" alt="image" src="https://github.com/user-attachments/assets/e309c057-3083-4459-8087-ea2b30ab8792" />
