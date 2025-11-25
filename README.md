# CivisID: National ID Registry System

**CivisID** is a Java-based Command Line Interface (CLI) application designed to simulate the backend workflows of a real-world national citizen registration and verification system. Built with a focus on accuracy, scalability, security, data integrity, and persistent storage, it goes far beyond traditional console-based programs.

##  Project Overview

While basic Java applications lose data upon exit, **CivisID ensures permanent storage** using CSV-based data files, making all records easily exportable, readable, and compatible with tools like Excel, Google Sheets, and government data platforms.

### Core Objectives
CivisID is designed to help the government maintain a centralized citizen database, enabling authorities to know essential details about each citizen—such as identity, age, address, phone number, and email—ensuring consistent and accurate record-keeping across departments.

Each citizen is assigned a unique **CivisID Number**, which is used to:
* Verify the authenticity of the user.
* Prevent duplicate registrations.
* Ensure secure access and identity validation.
* Track updates made by the citizen or the authorities.

### Empowering E-Governance
The application collects **Email IDs** and **Phone Numbers**, enabling the system to:
* Deliver government schemes, subsidies, and welfare updates.
* Send important notifications, emergency alerts, and reminders.
* Maintain direct communication between public departments and citizens.

Overall, CivisID replicates the fundamental features of national ID systems (similar to Aadhaar, SSN, etc.) by providing secure registration, validation, monitoring, and data persistence—all from a lightweight and efficient Java CLI environment.

---

## Key Features

###  1. Dynamic & Context-Aware Relative Logic
The system intelligently adapts the registration flow based on **Gender** and **Marital Status**. This mirrors real government documentation patterns.

| Citizen Type | Relative Prompt |
| :--- | :--- |
| **Married Male** | Wife’s Name |
| **Married Female** | Husband’s Name |
| **Unmarried** | Father’s Name |

### 2. Secure 7-Digit Random National ID
Each citizen receives a **non-sequential, unpredictable 7-digit ID**. This increases anonymity and prevents ID guessing attacks.

###  3. Permanent CSV Data Storage
CivisID uses `citizens.csv` to store data persistently.
* Auto-creates CSV with headers if missing.
*  Appends new data safely.
*  Readable in Excel/Google Sheets.
* Follows structured, clean formatting.

###  4. Full CRUD Management
The administrator has full control over the registry:
* **Create:** Register new citizens.
* **Read:** Search by ID (Instant lookup).
* **Update:** Modify name, address, pincode, contact info.
* **Delete:** Remove unwanted/invalid records from the active session.

### 5. Comprehensive Data Capture
The system captures **15+ essential data points**:
* Full Name, Age, DOB, Gender
* Relative Name (Context-Aware)
* Address, Pincode, State
* Mother Tongue, Family Members
* ID Proof, National ID
* Phone, Email
* Registration Timestamp

---

## Tech Stack

| Component | Technology | Purpose |
| :--- | :--- | :--- |
| **Language** | Java (JDK 8+) | Secure, portable, enterprise-grade logic. |
| **Data Structure** | `HashMap<String, Citizen>` | **O(1)** fast retrieval of records during runtime. |
| **OOP** | Encapsulation | Protects data integrity via Getters/Setters. |
| **File I/O** | `FileWriter` | persistent CSV storage management. |
| **Error Handling** | `try-catch` | Prevents crashes on invalid input or file errors. |

---


## ⚙️ How to Run
```bash
# Clone the Repository
https://github.com/udayraj-rgb/CivisID-National-ID-Registry-System-24BCE11159.git

# Compile
javac *.java

# Run
java NationalIDApp
```

## Sample CSV Output
| NationalID | Name | Age | DOB | Gender | MaritalStatus | Relation | Phone | Email | Address | Pincode | State |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- | :--- | :--- | :--- | :--- | :--- |
| 2145852 | Udayraj Patil | 20 | 25-03-2005 | Male | Unmarried | Father: Suresh Patil | 9999117777 | uday@education.com | Bandra West Mumbai | 34567 | Maharashtra |
| 5903076 | Rahul Deshmukh | 23 | 20-02-2003 | Male | Unmarried | Father: Shrikant Deshmukh | 7777788999 | rahul@compnay.com | Sahibaug Ahmedabad | 382461 | Gujarat |
| 5552702 | Neha Gupta | 34 | 16-01-1991 | Female | Married | Husband: Ravi Gupta | 888777902 | neha@gmail.com | Sector-25 Gurugram | 122221 | Haryana |
| 1186232 | Ashutosh Dubey | 43 | 07-07-1982 | Male | Married | Wife: Sneha Dubey | 7777788891 | ashutosh@exmaple.com | Gandhinagar Lucknow | 2234567 | Uttar Pradesh |
| 7142094 | Kashish Jain | 21 | 05-03-2004 | Female | Unmarried | Father: Pankaj Jain | 77885469732 | kashish@gmail.com | New Colony Chandigarh | 112234 | Punjab |
| 9857396 | Shubham Gaikwad | 41 | 23-06-1983 | Male | Married | Wife: Priya Gaikwad | 77896542367 | Shubham123@emali.com | Sarafa Bazar Indore | 3456789 | Madhya Pradesh |

## Screenshots
* ![image alt](https://github.com/udayraj-rgb/CivisID-National-ID-Registry-System-24BCE11159/blob/85caf7a4c55be18334df9256e3d2a913006a830a/Screenshots/Screenshot%202025-11-24%20163016.png)
* ![image alt](https://github.com/udayraj-rgb/CivisID-National-ID-Registry-System-24BCE11159/blob/c3a93522b17df42dfeeabab30e737bdb6c4a5395/Screenshots/Screenshot%202025-11-24%20163047.png)
* ![image alt](https://github.com/udayraj-rgb/CivisID-National-ID-Registry-System-24BCE11159/blob/c3a93522b17df42dfeeabab30e737bdb6c4a5395/Screenshots/Screenshot%202025-11-24%20163140.png)
* ![image alt](https://github.com/udayraj-rgb/CivisID-National-ID-Registry-System-24BCE11159/blob/c3a93522b17df42dfeeabab30e737bdb6c4a5395/Screenshots/Screenshot%202025-11-24%20163629.png)
* ![image alt](https://github.com/udayraj-rgb/CivisID-National-ID-Registry-System-24BCE11159/blob/c3a93522b17df42dfeeabab30e737bdb6c4a5395/Screenshots/Screenshot%202025-11-24%20164224.png)
##  Future Enhancements
* GUI: JavaFX/Swing interface for a modern desktop experience.
* Database: Integration with MySQL/PostgreSQL via JDBC for large-scale usage.
* Security: Biometric Hashing (SHA-256 simulation) for ID proofs.
* Cloud: Sync data via REST APIs (Firebase/AWS).
* Search: Advanced filtering by Name or Region.
##  Developed By 
* Udayraj Patil (24BCE11159) National ID System — Educational Prototype for e-Governance Concepts

