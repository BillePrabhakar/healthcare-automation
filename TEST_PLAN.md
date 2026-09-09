# UK Healthcare Patient Management Platform
## Test Plan

### 1. Objective
The objective of this test plan is to verify the functionality, reliability, and usability of the healthcare patient management platform through functional and regression testing.

### 2. Scope

#### In Scope
- User Login
- Patient Registration
- Patient Search
- Patient Information
- Appointment Management
- Logout
- Functional Testing
- Regression Testing
- Automation Testing

#### Out of Scope
- Performance Testing
- Security Testing
- Production deployment testing

### 3. Testing Types
- Functional Testing
- Regression Testing
- Integration Testing
- UI Testing
- Automation Testing

### 4. Automation Scope
The following stable and repetitive scenarios will be automated:
- Valid Login
- Invalid Login
- Patient Registration
- Patient Search
- Appointment Creation
- Logout

### 5. Tools and Technologies
- Java 17
- Selenium WebDriver
- TestNG
- Maven
- Git
- Jira
- VS Code

### 6. Automation Framework
The automation framework follows the Page Object Model (POM).

Framework components:
- BaseTest
- Page Classes
- Test Classes
- Utilities
- TestNG
- Maven

### 7. Entry Criteria
- Application environment is available.
- Requirements are available.
- Test data is available.
- Required credentials/access are available.

### 8. Exit Criteria
- Planned test cases are executed.
- Critical defects are resolved or documented.
- Regression testing is completed.
- Test results are documented.

### 9. Defect Management
Defects will be logged in Jira with:
- Summary
- Description
- Steps to Reproduce
- Expected Result
- Actual Result
- Severity
- Priority
- Screenshots/Evidence

### 10. Risks and Assumptions
- Application availability may affect testing.
- Test data should be available before execution.
- Automation scripts may require maintenance when the UI changes.
- Actual application requirements and access will be incorporated once provided.

### 11. Test Deliverables
- Test Plan
- Test Cases
- Automation Framework
- Automation Scripts
- Test Execution Results
- README
- Defect Reports