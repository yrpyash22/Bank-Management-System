# 🏦 Bank Management System

![Java](https://img.shields.io/badge/Java-17-orange)
![MySQL](https://img.shields.io/badge/MySQL-Database-blue)
![JDBC](https://img.shields.io/badge/JDBC-Connector-green)
![Swing](https://img.shields.io/badge/Java-Swing-red)

## Overview

Bank Management System is a desktop-based banking application developed using Java Swing, JDBC, and MySQL. The project simulates the functionality of an ATM system and allows users to perform various banking operations through an interactive graphical user interface.

Users can create a new bank account, log in using an ATM card number and PIN, deposit and withdraw money, perform fast cash transactions, view account balance, generate mini statements, and change their PIN securely.

The application stores customer information and transaction records in a MySQL database, making it a complete CRUD-based Java project.

---

## Features

### Account Registration

* Multi-step account opening process
* Personal information collection
* Additional customer details
* Account type selection
* Automatic Card Number generation
* Automatic PIN generation

### User Authentication

* Login using Card Number and PIN
* Credential verification through MySQL database

### Banking Services

* Deposit Money
* Withdraw Money
* Fast Cash Withdrawal
* Balance Enquiry
* Mini Statement
* PIN Change

### Additional Services

* ATM Card Facility
* Internet Banking
* Mobile Banking
* Email Alerts
* Cheque Book Facility
* E-Statement Service

---

## Technologies Used

| Technology    | Purpose                   |
| ------------- | ------------------------- |
| Java          | Core Programming Language |
| Swing         | GUI Development           |
| AWT           | UI Components             |
| JDBC          | Database Connectivity     |
| MySQL         | Database Management       |
| JCalendar     | Date Selection Component  |
| IntelliJ IDEA | Development Environment   |

---

## Project Structure

```text
## Project Structure

```text
Bank-Management-System/
│
├── README.md
├── .gitignore
├── jcalendar-tz-1.3.3-4.jar
├── mysql-connector-j-9.5.0.jar
│
└── src/
    ├── bank/
    │   └── management/
    │       └── system/
    │           ├── Login.java
    │           ├── Signup.java
    │           ├── Signup2.java
    │           ├── Signup3.java
    │           ├── Main_Class.java
    │           ├── Deposit.java
    │           ├── Withdrawl.java
    │           ├── FastCash.java
    │           ├── BalanceEnquriy.java
    │           ├── Mini_Statement.java
    │           ├── Change_Pin.java
    │           └── DBConnection.java
    │
    └── Icon/
        ├── atmmachine.jpg
        ├── background.jpg
        ├── banklogo.jpg
        ├── card.jpg
        └── atm_background.jpg
```

```

---

## Database Configuration

### Database Name

```sql
bankSystem
```

### Create Database

```sql
CREATE DATABASE bankSystem;
USE bankSystem;
```

---

## Database Tables

### 1. signup

Stores personal information of users.

```sql
CREATE TABLE signup(
    form_no VARCHAR(20),
    name VARCHAR(100),
    father_name VARCHAR(100),
    dob VARCHAR(50),
    gender VARCHAR(20),
    email VARCHAR(100),
    marital_status VARCHAR(50),
    address VARCHAR(255),
    city VARCHAR(100),
    pincode VARCHAR(20),
    state VARCHAR(100),
    country VARCHAR(100)
);
```

---

### 2. signup_two

Stores additional customer information.

```sql
CREATE TABLE signup_two(
    form_no VARCHAR(20),
    religion VARCHAR(50),
    category VARCHAR(50),
    income VARCHAR(50),
    education VARCHAR(100),
    occupation VARCHAR(100),
    pan VARCHAR(20),
    aadhar VARCHAR(20),
    senior_citizen VARCHAR(10),
    existing_account VARCHAR(10)
);
```

---

### 3. signup_three

Stores account details and services selected by the customer.

```sql
CREATE TABLE signup_three(
    form_no VARCHAR(20),
    account_type VARCHAR(100),
    card_number VARCHAR(20),
    pin VARCHAR(10),
    services VARCHAR(255)
);
```

---

### 4. login

Stores ATM login credentials.

```sql
CREATE TABLE login(
    form_no VARCHAR(20),
    card_number VARCHAR(20),
    pin VARCHAR(10)
);
```

---

### 5. bank

Stores all banking transactions.

```sql
CREATE TABLE bank(
    pin VARCHAR(10),
    date VARCHAR(100),
    type VARCHAR(50),
    amount VARCHAR(20)
);
```

---

## Required Libraries

Add the following JAR files to the project:

### MySQL JDBC Driver

```text
mysql-connector-j-9.5.0.jar
```

### JCalendar

```text
jcalendar-tz-1.3.3-4.jar
```

---

## Database Connection Setup

Open:

```java
DBConnection.java
```

Replace:

```java
private static final String username = "YOUR_USERNAME";
private static final String password = "YOUR_PASSWORD";
```

with your MySQL credentials.

Example:

```java
private static final String username = "root";
private static final String password = "your_password";
```

---

## How To Run

### Step 1

Clone the repository.

```bash
git clone <repository-url>
```

### Step 2

Create the MySQL database and tables.

### Step 3

Add required JAR files.

### Step 4

Configure database credentials in:

```text
DBConnection.java
```

### Step 5

Run:

```text
Login.java
```

---

## Application Workflow

```text
Signup
   ↓
Signup2
   ↓
Signup3
   ↓
Card Number & PIN Generated
   ↓
Login
   ↓
Main ATM Menu
   ↓
Deposit / Withdraw / Fast Cash
   ↓
Balance Enquiry
   ↓
Mini Statement
   ↓
PIN Change
```

---

## Security Note

This project is created for educational and learning purposes.

Current version stores PIN information directly in the database. For production-level applications:

* Use Password Hashing
* Use Prepared Statements
* Prevent SQL Injection
* Encrypt Sensitive Information
* Implement Role-Based Authentication

---

## Skills Demonstrated

* Java Programming
* Object-Oriented Programming (OOP)
* Java Swing GUI Development
* JDBC Connectivity
* MySQL Database Management
* Event Handling
* Form Validation
* Database CRUD Operations
* ATM System Design
* Desktop Application Development



---
## Future Enhancements

* Transaction Receipt Generation
* Admin Dashboard
* Customer Profile Management
* Account Transfer Facility
* Online Banking Support
* OTP Verification
* Email Notifications
* Secure PIN Encryption
* Transaction Search & Filters

---

## Author

**Yashraj Prajapati**

Java Developer | JDBC | MySQL | Swing GUI Development

---

⭐ If you found this project useful, consider giving it a star on GitHub.
