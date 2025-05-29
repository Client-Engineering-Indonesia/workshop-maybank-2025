<div align="center">
  <img src="https://github.com/user-attachments/assets/619606e5-6b9f-490a-b5da-34a81a2289e7" alt="Updated Image" width="400" height="224">
</div>

### Introduction
IBM StreamSets enables real-time data integration and automation, allowing organizations to efficiently process and manage data streams across hybrid and multi-cloud environments.


## How to Log In to StreamSets

### 1 . Prerequisites
| Item | Why you need it |
|------|-----------------|
| StreamSets Control Hub URL <br>*(e.g. `https://cloud.streamsets.com` or your on-prem URL)* | Entry point to the platform |
| Company username / email & password **or** SSO enabled | Credentials for the web UI |
| (Optional) Personal Access Token (PAT) | Required for CLI / API / Data Collector registration |

---

### 2 . Log In via Web UI

1. **Open the Control Hub URL** in your browser.  
2. Click **`Log In`**.  
3. **Select authentication method**:  
   * *Standard*: enter **email** and **password**, then click **`Sign In`**.  
   * *SSO (OAuth/SAML)*: click **`Single Sign-On`**, choose your identity provider, and approve the request.  
4. **First-time users only**: complete the short profile wizard (timezone, notifications, etc.).  
5. When the **dashboard** appears, you’re in 🎉

> **Tip:** Bookmark the URL after a successful sign-in so you land on the dashboard next time.

---

### 3 . Authenticate the CLI / Data Collector (PAT)

If you’ll run pipelines from a workstation or register an on-prem Data Collector, use a Personal Access Token.

#### 3 . 1 Create the token

1. In Control Hub, click your **avatar → *Personal Access Tokens***.  
2. Press **`+ New Token`**, give it a name (e.g. `“local-dev”`), choose an expiry date, and click **`Generate`**.  
3. Copy the token **once**; you won’t be able to see it again.

#### 3 . 2 Log in with the token (CLI example)

```bash
# 1. Install the StreamSets CLI if you haven’t already
pip install sstreamsets

# 2. Log in (replace placeholders)
export SCH_URL="https://cloud.streamsets.com"
export SCH_TOKEN="PASTE_YOUR_TOKEN_HERE"

sst login --host "$SCH_URL" --token "$SCH_TOKEN"



https://cloud.login.streamsets.com/login

<img width="1716" alt="image" src="https://github.com/user-attachments/assets/b32a6e46-3221-42a7-b9f2-5d9db2e38a27" />
