# Simple Password Manager
## Overview
The Simple Password Manager is a Java-based application that serves as a password management tool. It provides a user-friendly frontend built in Java and a MySQL backend for secure storage of passwords.

## Features
- **Secure Storage**: Passwords are securely stored in a MySQL database.
- **User-Friendly Interface**: The Java frontend offers a simple and intuitive interface for managing passwords.
- **Password Generation**: The application can generate strong and secure passwords.

## Prerequisites
- Java Development Kit (JDK) installed
- MySQL database installed and configured

## Installation
1. Clone the repository:
   ``` cmd
   git clone https://github.com/your-username/simple-password-manager.git
   ```
2. Set up the MySQL database with the provided schema script.
3. Build and run the Java application.
   ```cmd
    cd simple_password_manager
    javac Main.java
    java Main
   ```

## Configuration
- Configure the MySQL database connection in the config.properties file.
  ``` properties
  db.url=jdbc:mysql://localhost:3306/password_manager
  db.user=root
  db.password=your_password
  ```

## Usage
1. Run the application
2. Enter configured master password for the MySQL database to login
3. Use the graphical interface to add, view or delete passwords
4. Generate secure passwords using the built-in password generator


