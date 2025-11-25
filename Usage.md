📘 Usage Guide – CivisID: National ID Registry System

by UDIT SHARMA 24BCE11124 , Department of Computer Science & Engineering

This guide explains how to set up, run, and use the NatID application to manage citizen records efficiently.

🔧 Prerequisites

Before running this project, ensure the following are installed on your system:

Java SE 8+ (JDK 8, 11, 17, or 21)
Verify installation:

java -version



Text Editor/IDE (Optional):
VS Code • IntelliJ IDEA • Eclipse

▶ Setup & Run
1. Clone the Repository

2. Compile the Source Code
javac *.java

3. Run the Program
java NationalIDApp

📑 CLI Menu Overview

When the program starts, you will see:

=== NATIONAL ID REGISTRY SYSTEM (CSV) ===

--- MAIN MENU ---
1. Register New Citizen
2. Search Citizen by ID
3. Update Citizen Details
4. Delete Citizen
5. List All Registered Citizens
6. Exit
Enter Choice:

🔹 Functionalities & Usage
1️⃣ Register New Citizen

Captures complete demographic details with smart validation.

✔ Smart Relative Logic

Male & Married → asks Wife’s Name

Female & Married → asks Husband’s Name

Unmarried → asks Father’s Name

✔ Auto-ID System

Automatically generates a unique 7-digit National ID.

✔ Verification

Collects ID Proof Number (e.g., Voter ID, PAN) to ensure the citizen is genuine.

2️⃣ Search Citizen by ID

Enter a 7-digit National ID

Instantly retrieves:

Name

Relative details

Phone & Email

Address & Pincode

Demographic data

Search uses in-memory lookup for speed.

3️⃣ Update Citizen Details

Allows editing of important fields:

Name

Address

Phone Number

User chooses which field to modify → enters new value → updated instantly.

4️⃣ Delete Citizen

Removes the citizen from active session.

Historical records remain in CSV for auditing.

Deleted ID will not be retrievable in the current session.

5️⃣ List All Registered Citizens

Displays a clean table-style summary of all citizens loaded in RAM.

6️⃣ Exit

Safely terminates the system:

Closes file streams

Ensures data is stored properly

📂 Data & Storage Files

NatID uses a CSV file for permanent storage.

📄 citizens.csv

Location: Root project folder
Created automatically on first registration.

CSV Structure
NationalID, Name, Age, DOB, Gender, MaritalStatus, Relation,
Phone, Email, Address, Pincode, State, MotherTongue,
FamilyMembers, IDProof, DateRegistered

✔ What the System Does

Appends new entries automatically

Creates header row if file doesn’t exist

Makes data portable and compatible with:

Excel

Google Sheets

Database imports

✔ Tip

Open citizens.csv in Excel to:

Filter citizens


Sort by age/state

Generate charts

Perform data analysis
