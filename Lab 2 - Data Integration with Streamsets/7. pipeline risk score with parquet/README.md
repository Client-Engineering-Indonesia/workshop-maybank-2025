
# Streaming Pipeline Enhancement: Export to Parquet

In this phase, you will extend your existing StreamSets pipeline that filters transactions based on risk score. The new requirement is to export the filtered data into Parquet format for further analysis, typically for machine learning prediction tasks. The Parquet files will be stored in either the local file system or IBM Cloud Object Storage (IBM COS).

---

## Option 1: Export to Local File System (Local FS)

### Add Output Stage: Local FS (Parquet)

1. Add a new stage and select `Local FS`.
2. Change the name of the stage to:
   ```
   Datalake (Parquet)
   ```

3. Set the **Directory Template** to:
   ```
   /tmp/transactions
   ```

4. Set the **Files Suffix** to:
   ```
   parquet
   ```

5. In the **Data Format** tab:
   - Set **Data Format** to `Parquet`
   - Set **Parquet Compression Codec** to `Snappy`
   - Set **Parquet Format Version** to `2.0`

---

## Option 2: Export to IBM Cloud Object Storage (IBM COS)

### Add Output Stage: Amazon S3 (IBM COS-Compatible)

1. Add a new stage and select `Amazon S3`.
2. Enter your **Access Key ID** and **Secret Access Key** (provided by the instructor).
3. Check `Use Specific Region`.
4. Set:
   - **Region**: `Other - Specify`
   - **Endpoint**:
     ```
     s3.us-south.cloud-object-storage.appdomain.cloud
     ```

5. Check `Use Specific Region` again (for Signin region).
6. Set:
   - **Signin Region**:
     ```
     us-south
     ```

7. Set the **Bucket Name** to:
   ```
   streamsets-demo
   ```

---

## Validate the Pipeline

### 1. Validate Postgres Output

Open Postgres:

```bash
sudo su - postgres
psql
```

Run these queries:

```sql
SELECT COUNT(*) FROM financial_transactions;
SELECT * FROM financial_transactions LIMIT 20;

SELECT state, AVG(risk_score) AS avg_risk_score, COUNT(*) AS num_transactions
FROM financial_transactions
GROUP BY state
ORDER BY avg_risk_score DESC
LIMIT 5;
```

### 2. Validate Parquet Output

- Check the `/tmp/transactions` folder for local FS output
- Or, check the `streamsets-demo` bucket in IBM COS for uploaded `.parquet` files
- Ensure the files are compressed with `Snappy` and follow Parquet 2.0 format
