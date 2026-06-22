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
create table signup(form_no varchar(30), name varchar(30), father_name varchar(30), DOB varchar(30), gender varchar(30), email varchar(60), marital_status varchar(30), address varchar(60), city varchar(30), pincode varchar(30), state varchar(50), country varchar(30));
select * from signup;
```

---

### 2. signup_two

Stores additional customer information.

```sql
create table signup_two(form_no varchar(30), religion varchar(30), category varchar(30), income varchar(50), education varchar(30), occupation varchar(60), pan varchar(30), aadhar varchar(60), senior_citizen varchar(30), existing_account varchar(30));
select * from signup_two;
```

---

### 3. signup_three

Stores account details and services selected by the customer.

```sql
create table signup_three( form_no varchar(30), account_Type varchar(50), card_number varchar(40), pin varchar(30), facility varchar(200));
select * from signup_three;
```

---

### 4. login

Stores ATM login credentials.

```sql
create table login(form_no varchar(30), card_number varchar(50), pin varchar(30));
select * from login;
```

---

### 5. bank

Stores all banking transactions.

```sql
create table bank(pin varchar(10), date varchar(50), type varchar(20), amount varchar(20));
select * from bank;
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


