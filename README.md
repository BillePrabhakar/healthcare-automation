# Healthcare Patient Management Automation

## Project Overview
This project contains a Selenium-based automation framework for functional and regression testing of a healthcare patient management platform.

## Technology Stack
- Java 17
- Selenium WebDriver
- TestNG
- Maven
- Git
- Jira

## Framework
The project follows the Page Object Model (POM) design pattern.

## Project Structure

src/test/java/com/healthcare/
- base - Base test and WebDriver setup
- pages - Page Object classes
- tests - TestNG test classes
- utilities - Reusable utility classes

## Test Documents
- TEST_PLAN.md - Test strategy and scope
- TEST_CASES.md - Functional and regression test cases

## How to Run

1. Clone the repository.
2. Open the project in an IDE.
3. Ensure Java 17 is installed.
4. Run Maven tests:

mvn test

## Current Automation
The current LoginTest is a setup verification test used to confirm that Selenium and TestNG are configured correctly.

## Note
Application-specific URLs, credentials, locators, and requirements will be updated once the project application details are provided.