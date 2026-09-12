# Test Plan
## UK Healthcare Patient Management Platform – Automation Testing

### 1. Document Information

| Item | Details |
|---|---|
| Project | UK Healthcare Patient Management Platform |
| Testing Type | Functional & Regression Testing |
| Automation Tool | Selenium WebDriver |
| Programming Language | Java |
| Test Framework | TestNG |
| Build Tool | Maven |
| Design Pattern | Page Object Model (POM) |
| Version Control | Git / GitHub |
| Browser | Google Chrome |

---

## 2. Objective

The objective of this test plan is to define the approach for functional and regression automation testing of the healthcare application.

The automation framework validates the major user workflows including:

- Valid Login
- Invalid Login
- Appointment Booking
- Logout

---

## 3. Scope

### In Scope

- Application launch
- Valid user login
- Invalid user login validation
- Appointment page navigation
- Appointment booking
- Appointment confirmation validation
- User logout
- Functional test automation
- Regression test execution

### Out of Scope

- Performance testing
- Load testing
- Security testing
- Penetration testing
- Production deployment testing
- Database testing

---

## 4. Test Approach

The following approach is used for automation testing:

1. Launch the healthcare application.
2. Navigate to the required functionality.
3. Perform user actions using Selenium WebDriver.
4. Validate expected results using TestNG assertions.
5. Use explicit waits for synchronization.
6. Generate execution logs using SLF4J and Logback.
7. Execute the complete test suite using TestNG and Maven.
8. Maintain the automation code using Git and GitHub.

---

## 5. Automation Framework Structure

The framework follows the Page Object Model design pattern.

### Base Layer

`BaseTest.java`

- Initializes WebDriver.
- Configures the browser.
- Closes the browser after test execution.

### Page Layer

- `HomePage.java`
- `LoginPage.java`
- `AppointmentPage.java`

These classes contain application page locators and reusable page actions.

### Test Layer

- `LoginTest.java`
- `InvalidLoginTest.java`
- `AppointmentTest.java`
- `LogoutTest.java`

These classes contain the actual test scenarios and validations.

### Utility Layer

`LogUtil.java`

Used for reusable logging functionality.

### Configuration

`testng.xml`

Defines the test execution order and test classes.

---

## 6. Test Execution Order

The tests are executed in the following order:

1. Valid Login Test
2. Invalid Login Test
3. Appointment Test
4. Logout Test

---

## 7. Tools and Technologies

| Tool / Technology | Purpose |
|---|---|
| Java 17 | Programming language |
| Selenium WebDriver | Browser automation |
| TestNG | Test execution and assertions |
| Maven | Build and dependency management |
| SLF4J | Logging API |
| Logback | Log implementation |
| Git | Version control |
| GitHub | Source code repository |
| VS Code | Development environment |
| Google Chrome | Test browser |

---

## 8. Entry Criteria

Testing can begin when:

- Application is accessible.
- Test environment is available.
- Java and Maven are configured.
- Selenium dependencies are available.
- Test data and valid credentials are available.
- Automation framework is configured.

---

## 9. Exit Criteria

Testing is considered complete when:

- All planned test cases are executed.
- Critical functional scenarios are automated.
- Test execution completes successfully.
- All critical test failures are resolved.
- Automation code is committed to GitHub.
- Test documentation is completed.

---

## 10. Defect Management

Any failed test scenario should be investigated and documented with:

- Test case name
- Steps to reproduce
- Expected result
- Actual result
- Error message
- Severity
- Evidence such as logs or screenshots

Defects can be tracked using the project defect management process.

---

## 11. Risks and Mitigation

| Risk | Mitigation |
|---|---|
| Application availability issues | Verify application availability before execution |
| Browser compatibility issues | Use a supported Chrome version |
| Synchronization issues | Use explicit waits |
| Locator changes | Maintain locators in Page Object classes |
| Test data changes | Maintain reusable test data |
| Network issues | Re-run failed tests after confirming connectivity |

---

## 12. Deliverables

The following deliverables are included:

- Automation framework
- Selenium test scripts
- TestNG test suite
- Test plan
- Test cases
- README documentation
- Execution logs
- GitHub source code repository

---

## 13. Execution Command

The complete test suite can be executed using:

```powershell
mvn clean test