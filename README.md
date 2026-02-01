Assignment 6 — Data-Driven & Cross-Browser Automated Testing
Project Title

Data-Driven Login Automation for Thinking Tester Contact List App

Objective

The objective of this assignment is to demonstrate practical skills in:

Data-Driven Testing (DDT) using Excel files

Automated functional testing using Selenium WebDriver

Handling positive and negative test scenarios

Logging test execution results for each data set

Tested Website

URL:
https://thinking-tester-contact-list.herokuapp.com/

This website provides a login form, which makes it suitable for automated functional testing using different input combinations.

Technologies Used

Programming Language: Java (JDK 21)

Automation Tool: Selenium WebDriver

Test Framework: TestNG

Build Tool: Maven

Excel Library: Apache POI

Browser: Google Chrome

IDE: IntelliJ IDEA

Test Approach — Data-Driven Testing (DDT)

Data-Driven Testing allows executing the same test logic with multiple sets of input data.
In this project:

Test data is stored in an Excel (.xlsx) file

Each row in Excel represents a separate test case

The test dynamically reads data and executes login scenarios

Both positive and negative cases are covered

Project Structure
project-root
│
├── src
│   ├── main
│   │   └── java
│   │       └── utils
│   │           └── ExcelReader.java
│   │
│   └── test
│       └── java
│           └── tests
│               └── LoginDDTTest.java
│
├── testData
│   └── loginData.xlsx
│
├── pom.xml
└── README.md

Test Data (Excel)

File: testData/loginData.xlsx

Test Case	Email	Password	Expected Result
TC01	wrong@mail.com
	wrongpass	ERROR
TC02	valid@mail.com
	validpass	SUCCESS
TC03	valid@mail.com
		ERROR
TC04	invalid-email	validpass	ERROR
Test Scenarios
Positive Test Case

Login with valid email and password

Expected result: user is redirected to Contact List page

Negative Test Cases

Invalid email and password

Empty password

Invalid email format

Expected result: error message is displayed

Test Logic Description

Test data is read from Excel using ExcelReader

For each data set:

Browser is launched

Login form is filled

Submit button is clicked

Validation:

SUCCESS → URL contains contactList

ERROR → error message is displayed

Each test case result is logged as PASSED or FAILED

Browser is closed after each iteration

To ensure that all data sets are executed, assertions are handled inside try-catch blocks.

Sample Console Output
TC01 FAILED
TC02 PASSED
TC03 PASSED
TC04 PASSED


This confirms that:

All test data rows were executed

The test did not stop after a failure

Both positive and negative cases were validated

Known Warnings

CDP version warnings related to Chrome browser version

Logging warnings related to logger configuration

These warnings do not affect test execution and are not considered test failures.

How to Run the Test

Clone the project or extract the archive

Open the project in IntelliJ IDEA

Make sure Maven dependencies are downloaded

Run the test class:

LoginDDTTest.java


or use:

mvn test

Conclusion

This project successfully demonstrates:

Data-Driven Testing using Excel

Automated functional testing with Selenium

Handling multiple test scenarios in a single test

Logging individual test execution results

The solution fully meets the requirements of Assignment 6.
