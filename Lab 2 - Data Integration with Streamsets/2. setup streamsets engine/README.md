Now that you have a StreamSets account and have successfully accessed the StreamSets Control Hub portal, the next step is to deploy your engine to your virtual machine (VM). In this workshop, you will be provided with a TechZone VM environment for this purpose.


<img width="1280" alt="image" src="https://github.com/user-attachments/assets/dea22f5d-427c-4eb5-a539-ca42b0bcab04" />


#### Streamsets Portal

1. **Create deployment on streamsets**
   - Open `https://cloud.login.streamsets.com/login` in your browser [here](https://cloud.login.streamsets.com/login)
   <img width="1280" alt="image" src="https://github.com/user-attachments/assets/5cb6727b-7f0f-40ff-a92e-c0d5c703b3c1" />

1. **Create deployment on streamsets**
   - Open `https://cloud.login.streamsets.com/login` in your browser [here](https://cloud.login.streamsets.com/login)
   <img width="1716" alt="image" src="https://github.com/user-attachments/assets/b32a6e46-3221-42a7-b9f2-5d9db2e38a27" />

1. **Create deployment on streamsets**
   - Open `https://cloud.login.streamsets.com/login` in your browser [here](https://cloud.login.streamsets.com/login)
   <img width="1716" alt="image" src="https://github.com/user-attachments/assets/b32a6e46-3221-42a7-b9f2-5d9db2e38a27" />

1. **Create deployment on streamsets**
   - Open `https://cloud.login.streamsets.com/login` in your browser [here](https://cloud.login.streamsets.com/login)
   <img width="1716" alt="image" src="https://github.com/user-attachments/assets/b32a6e46-3221-42a7-b9f2-5d9db2e38a27" />

1. **Create deployment on streamsets**
   - Open `https://cloud.login.streamsets.com/login` in your browser [here](https://cloud.login.streamsets.com/login)
   <img width="1716" alt="image" src="https://github.com/user-attachments/assets/b32a6e46-3221-42a7-b9f2-5d9db2e38a27" />

1. **Create deployment on streamsets**
   - Open `https://cloud.login.streamsets.com/login` in your browser [here](https://cloud.login.streamsets.com/login)
   <img width="1716" alt="image" src="https://github.com/user-attachments/assets/b32a6e46-3221-42a7-b9f2-5d9db2e38a27" />

1. **Create deployment on streamsets**
   - Open `https://cloud.login.streamsets.com/login` in your browser [here](https://cloud.login.streamsets.com/login)
   <img width="1716" alt="image" src="https://github.com/user-attachments/assets/b32a6e46-3221-42a7-b9f2-5d9db2e38a27" />

---

2. **Sign Up or Log In**
  - If you don’t have a StreamSets account, click Sign Up to create one.
    <img width="1716" alt="image" src="https://github.com/user-attachments/assets/c810cafe-8347-4d3a-9fb5-f4b55dbf3dc2" />
    
    - Register your email by filling information here for streamsets account free trial
      <img width="1716" alt="image" src="https://github.com/user-attachments/assets/2d9a0a31-1332-4363-88d2-7f81def0abfa" />

      <img width="1716" alt="image" src="https://github.com/user-attachments/assets/21cae6e8-379b-4f7a-9467-761bf3bc85ce" />


  - If you already have an account, click Log In.
    - Click Log In using your email, then select an authentication method: Standard (enter email and password, then click Sign In)
    - click Single Sign-On, choose your identity provider, and approve the request.
    <img width="1716" alt="image" src="https://github.com/user-attachments/assets/d909a07a-669c-4780-9683-be38a3b5829d" />

---
   
3. When the **dashboard** appears, you’re in
  <img width="1716" alt="image" src="https://github.com/user-attachments/assets/5461a736-57af-41dd-8e6b-bf29fb3e68ac" />
 
---

#### VM Portal

1. **Go to Stramsets Portal Page**
   - Open `https://cloud.login.streamsets.com/login` in your browser [here](https://cloud.login.streamsets.com/login)
   <img width="1716" alt="image" src="https://github.com/user-attachments/assets/b32a6e46-3221-42a7-b9f2-5d9db2e38a27" />

---

2. **Sign Up or Log In**
  - If you don’t have a StreamSets account, click Sign Up to create one.
    <img width="1716" alt="image" src="https://github.com/user-attachments/assets/c810cafe-8347-4d3a-9fb5-f4b55dbf3dc2" />
    
    - Register your email by filling information here for streamsets account free trial
      <img width="1716" alt="image" src="https://github.com/user-attachments/assets/2d9a0a31-1332-4363-88d2-7f81def0abfa" />

      <img width="1716" alt="image" src="https://github.com/user-attachments/assets/21cae6e8-379b-4f7a-9467-761bf3bc85ce" />


  - If you already have an account, click Log In.
    - Click Log In using your email, then select an authentication method: Standard (enter email and password, then click Sign In)
    - click Single Sign-On, choose your identity provider, and approve the request.
    <img width="1716" alt="image" src="https://github.com/user-attachments/assets/d909a07a-669c-4780-9683-be38a3b5829d" />

---
   
3. When the **dashboard** appears, you’re in
  <img width="1716" alt="image" src="https://github.com/user-attachments/assets/5461a736-57af-41dd-8e6b-bf29fb3e68ac" />
 
---

Techzone portal
<img width="1279" alt="image" src="https://github.com/user-attachments/assets/7f5308bf-cf59-4956-b7f1-1d5ad8287a3f" />



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
