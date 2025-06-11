Now that you have a streamsets account and have successfully accessed the StreamSets Control Hub portal, the next step is to deploy your engine to your virtual machine (VM). In this workshop, you will be provided with a TechZone VM environment for this purpose.

#### Streamsets Portal

Create the modular connection in the connections tab
<img width="1285" alt="image" src="https://github.com/user-attachments/assets/3b3aebb7-0f31-4cd8-aa3e-f6c33f5901d5" />

1. **Kafka connection**
   - Put `kafka` as name and the type
   <img width="1280" alt="image" src="https://github.com/user-attachments/assets/326154c0-9f60-4a88-9c68-3c94607cf1fe" />

   - Test connection and save
     <img width="1280" alt="image" src="https://github.com/user-attachments/assets/37cee246-2a6f-4503-9216-3c5a37f0a197" />

---

#### Virtual Machine Portal
In this workshop, we will use PostgreSQL to store the data, so we will return to the VM portal to create the necessary table. Since Kafka has already been installed on the VM, there is no need to install it.

4. **Postgress - Create the table**
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
