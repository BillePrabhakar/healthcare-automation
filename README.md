# Healthcare Automation

## About the Project

This project is a Selenium automation framework created to test the main functionalities of a healthcare web application.

The framework covers login, appointment booking, and logout scenarios. It is built using Java, Selenium WebDriver, TestNG, and Maven.

## Application

The automation is performed on the CURA Healthcare Service demo application.

**URL:** https://katalon-demo-cura.herokuapp.com/

**Login credentials:**
- Username: `John Doe`
- Password: `ThisIsNotAPassword`

## What is Automated

The following scenarios are automated:

- Valid Login
- Invalid Login
- Appointment Booking
- Logout

## Tools Used

- Java 17
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)
- SLF4J and Logback
- Git and GitHub
- Google Chrome

## Project Structure

```text
src/test/java/com/healthcare
│
├── base
│   └── BaseTest.java
│
├── pages
│   ├── HomePage.java
│   ├── LoginPage.java
│   └── AppointmentPage.java
│
├── tests
│   ├── LoginTest.java
│   ├── InvalidLoginTest.java
│   ├── AppointmentTest.java
│   └── LogoutTest.java
│
└── utilities
    └── LogUtil.java

src/test/resources
└── logback.xml

pom.xml
testng.xml
TEST_PLAN.md
TEST_CASES.md
```

## Framework

I have used the Page Object Model to keep the page locators and actions separate from the test cases.

`BaseTest` handles browser setup and cleanup.

The `pages` package contains reusable page actions.

The `tests` package contains the actual test scenarios.

The `utilities` package contains reusable utilities such as logging.

## Test Execution

The tests are executed using TestNG through `testng.xml` in this order:

1. Valid Login
2. Invalid Login
3. Appointment Booking
4. Logout

## How to Run

Make sure Java, Maven, and Chrome are installed.

Run the following command from the project directory:

```bash
mvn clean test
```

## Test Result

All four automated tests passed successfully.

```text
Tests Run: 4
Passed: 4
Failed: 0
Errors: 0
Skipped: 0

BUILD SUCCESS
```

## Documentation

`TEST_PLAN.md` contains the test plan and testing approach.

`TEST_CASES.md` contains the detailed functional test cases, including test steps, expected results, actual results, priority, and status.

## Repository

The project source code is maintained in GitHub.