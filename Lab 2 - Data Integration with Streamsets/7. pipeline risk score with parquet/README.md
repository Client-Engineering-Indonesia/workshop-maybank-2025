### Create a streaming Pipeline (Continue)

Previously, you set up a stream pipeline that filtered data based on risk scores—either storing them in PostgreSQL or discarding them. Now, as a Data Scientist, you need to export this data into Parquet format for further analysis, typically for machine learning prediction tasks. In this updated pipeline, we will use IBM Cloud Object Storage as the destination for the Parquet files. 



--- 
### Connect as parquet (Local file system/ Local FS)
The final pipeline will be structured as follows:
<img width="1020" alt="image" src="https://github.com/user-attachments/assets/1903e949-bba4-44d6-976f-36be0af783ea" />

- Add Stage
- Select Local FS
- Put the creds of **Access Key ID** and **Secret Access Key** from the instructors
- Check list Use Specific Region
- Put Region as **Other-Specify**
- Copy and Paste the Endpoint
  ```text
  s3.us-south.cloud-object-storage.appdomain.cloud
  ```
<img width="1211" alt="image" src="https://github.com/user-attachments/assets/e00155e8-6672-4516-8c92-5c6428c6c6e2" />
- Check list Use Specific Region
- Put Signin region as **Other-Specify**
- Copy and Paste the Endpoint
  ```text
  us-south
  ```
- Put bucket name as **streamsets-demo**
<img width="1211" alt="image" src="https://github.com/user-attachments/assets/f4ef199c-d2d2-4800-8b87-288236d3ff55" />

---

### Connect as parquet (IBM COS)

<img width="1020" alt="image" src="https://github.com/user-attachments/assets/3f66e238-26dc-4b8f-bce0-c4d0421781cd" />
- Add Stage
- Select Amazon S3
- Put the creds of **Access Key ID** and **Secret Access Key** from the instructors
- Check list Use Specific Region
- Put Region as **Other-Specify**
- Copy and Paste the Endpoint
  ```text
  s3.us-south.cloud-object-storage.appdomain.cloud
  ```
<img width="1211" alt="image" src="https://github.com/user-attachments/assets/e00155e8-6672-4516-8c92-5c6428c6c6e2" />
- Check list Use Specific Region
- Put Signin region as **Other-Specify**
- Copy and Paste the Endpoint
  ```text
  us-south
  ```
- Put bucket name as **streamsets-demo**
<img width="1211" alt="image" src="https://github.com/user-attachments/assets/f4ef199c-d2d2-4800-8b87-288236d3ff55" />

### Validate the pipeline and run


<img width="1140" alt="image" src="https://github.com/user-attachments/assets/5570f5f8-2139-497d-8261-295a4ff6987b" />

