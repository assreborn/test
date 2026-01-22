# Product Automation Tests (Selenium WebDriver)

## Project Description
This project contains automated UI tests for product and cart functionality
using Selenium WebDriver with Java and TestNG.

The tests are implemented for an e-commerce web application and cover
adding products to cart, removing products, and verifying cart contents.
Logging and test reporting are implemented using Log4j and Extent Reports.

---

## Technologies Used
- Java
- Selenium WebDriver
- TestNG
- Maven
- Log4j2
- Extent Reports

---

## Project Structure
src
├── main
│ └── java
│ ├── base
│ │ └── BaseTest.java
│ └── utils
│ ├── ExtentManager.java
│ └── ScreenshotUtil.java
└── test
└── java
└── tests
└── ProductTests.java


---

## Test Environment
- Browser: Google Chrome
- OS: Windows
- Automation Tool: Selenium WebDriver
- Test Framework: TestNG

---

## Implemented Test Scenarios
1. Add product to cart
2. Remove product from cart
3. Verify product visibility on cart page

---

## Reporting
- Test execution results are logged using Log4j
- Extent Reports are generated after test execution
- Screenshots are captured automatically on test failure

---

## How to Run Tests
1. Install Java and Maven
2. Clone the project
3. Open the project in IntelliJ IDEA
4. Run TestNG tests from ProductTests.java

---

## Notes
- Login functionality is reused via a helper method
- Exception handling is implemented to capture screenshots on failure
