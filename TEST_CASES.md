# Test Cases
## UK Healthcare Patient Management Platform

### Test Case Summary

| TC ID | Test Scenario | Priority | Type | Status |
|---|---|---|---|---|
| TC-001 | Verify application launches successfully | High | Functional | PASS |
| TC-002 | Verify Make Appointment navigation | High | Functional | PASS |
| TC-003 | Login with valid credentials | High | Functional | PASS |
| TC-004 | Login with invalid username | High | Negative | PASS |
| TC-005 | Login with invalid password | High | Negative | PASS |
| TC-006 | Login with invalid username and password | Medium | Negative | PASS |
| TC-007 | Verify healthcare facility selection | High | Functional | PASS |
| TC-008 | Verify hospital readmission option | Medium | Functional | PASS |
| TC-009 | Verify healthcare program selection | Medium | Functional | PASS |
| TC-010 | Book appointment with valid details | High | Functional | PASS |
| TC-011 | Verify appointment confirmation details | High | Functional | PASS |
| TC-012 | Verify logout functionality | High | Functional | PASS |

---

# Detailed Test Cases

## TC-001 – Verify Application Launch

**Objective:**  
Verify that the healthcare application launches successfully.

**Precondition:**  
Internet connection is available.

**Test Steps:**
1. Open Google Chrome.
2. Navigate to the healthcare application URL.

**Test Data:**  
Application URL: `https://katalon-demo-cura.herokuapp.com/`

**Expected Result:**  
The healthcare application home page should load successfully.

**Actual Result:**  
The healthcare application home page loaded successfully.

**Status:** PASS

---

## TC-002 – Verify Make Appointment Navigation

**Objective:**  
Verify that the Make Appointment button navigates the user to the login page.

**Precondition:**  
Healthcare application is open.

**Test Steps:**
1. Open the healthcare application.
2. Click the **Make Appointment** button.

**Expected Result:**  
The user should be navigated to the login page.

**Actual Result:**  
The user was successfully navigated to the login page.

**Status:** PASS

---

## TC-003 – Login with Valid Credentials

**Objective:**  
Verify that a user can successfully log in using valid credentials.

**Test Data:**
- Username: `John Doe`
- Password: `ThisIsNotAPassword`

**Test Steps:**
1. Navigate to the login page.
2. Enter a valid username.
3. Enter a valid password.
4. Click the Login button.

**Expected Result:**  
The user should successfully log in and the appointment page should be displayed.

**Actual Result:**  
The user successfully logged in and the appointment page was displayed.

**Status:** PASS

---

## TC-004 – Login with Invalid Username

**Objective:**  
Verify that login fails when an invalid username is provided.

**Test Data:**
- Username: `InvalidUser`
- Password: `ThisIsNotAPassword`

**Test Steps:**
1. Navigate to the login page.
2. Enter an invalid username.
3. Enter a valid password.
4. Click the Login button.

**Expected Result:**  
The application should reject the login attempt and display an appropriate error message.

**Actual Result:**  
The application rejected the login attempt and displayed a login failure message.

**Status:** PASS

---

## TC-005 – Login with Invalid Password

**Objective:**  
Verify that login fails when an invalid password is provided.

**Test Data:**
- Username: `John Doe`
- Password: `WrongPassword`

**Test Steps:**
1. Navigate to the login page.
2. Enter a valid username.
3. Enter an invalid password.
4. Click the Login button.

**Expected Result:**  
The application should reject the login attempt and display an appropriate error message.

**Actual Result:**  
The application rejected the login attempt and displayed a login failure message.

**Status:** PASS

---

## TC-006 – Login with Invalid Username and Password

**Objective:**  
Verify that login fails when both username and password are invalid.

**Test Data:**
- Username: `InvalidUser`
- Password: `WrongPassword`

**Test Steps:**
1. Navigate to the login page.
2. Enter an invalid username.
3. Enter an invalid password.
4. Click the Login button.

**Expected Result:**  
The application should reject the login attempt and display an appropriate error message.

**Actual Result:**  
The application rejected the login attempt and displayed the message:

`Login failed! Please ensure the username and password are valid.`

**Status:** PASS

---

## TC-007 – Verify Healthcare Facility Selection

**Objective:**  
Verify that a user can select a healthcare facility.

**Precondition:**  
User is successfully logged in.

**Test Steps:**
1. Login using valid credentials.
2. Navigate to the appointment page.
3. Open the healthcare facility dropdown.
4. Select `Tokyo CURA Healthcare Center`.

**Expected Result:**  
The selected healthcare facility should be displayed in the dropdown.

**Actual Result:**  
`Tokyo CURA Healthcare Center` was successfully selected.

**Status:** PASS

---

## TC-008 – Verify Hospital Readmission Option

**Objective:**  
Verify that the hospital readmission option can be selected.

**Precondition:**  
User is successfully logged in.

**Test Steps:**
1. Navigate to the appointment page.
2. Locate the hospital readmission option.
3. Select the hospital readmission checkbox.

**Expected Result:**  
The hospital readmission option should be selected successfully.

**Actual Result:**  
The hospital readmission option was selected successfully.

**Status:** PASS

---

## TC-009 – Verify Healthcare Program Selection

**Objective:**  
Verify that the user can select the Medicaid healthcare program.

**Precondition:**  
User is successfully logged in.

**Test Steps:**
1. Navigate to the appointment page.
2. Locate the healthcare program options.
3. Select Medicaid.

**Expected Result:**  
Medicaid should be selected successfully.

**Actual Result:**  
Medicaid was selected successfully.

**Status:** PASS

---

## TC-010 – Book Appointment with Valid Details

**Objective:**  
Verify that a user can successfully book an appointment using valid appointment details.

**Precondition:**  
User is successfully logged in.

**Test Data:**
- Facility: `Tokyo CURA Healthcare Center`
- Hospital Readmission: Selected
- Healthcare Program: `Medicaid`
- Visit Date: `12/09/2026`
- Comment: `Routine checkup`

**Test Steps:**
1. Login using valid credentials.
2. Select the healthcare facility.
3. Select hospital readmission.
4. Select Medicaid.
5. Enter the visit date.
6. Enter the appointment comment.
7. Click **Book Appointment**.

**Expected Result:**  
The appointment should be successfully booked and the appointment confirmation page should be displayed.

**Actual Result:**  
The appointment was successfully booked and the appointment confirmation page was displayed.

**Status:** PASS

---

## TC-011 – Verify Appointment Confirmation Details

**Objective:**  
Verify that appointment confirmation details are displayed after successful booking.

**Precondition:**  
An appointment has been successfully booked.

**Test Steps:**
1. Complete the appointment booking process.
2. Verify that the appointment confirmation page is displayed.
3. Verify the appointment information displayed on the confirmation page.

**Expected Result:**  
The appointment confirmation page should display the submitted appointment details.

**Actual Result:**  
The appointment confirmation page displayed the submitted appointment information.

**Status:** PASS

---

## TC-012 – Verify Logout Functionality

**Objective:**  
Verify that a logged-in user can successfully log out.

**Precondition:**  
User is successfully logged in.

**Test Steps:**
1. Login using valid credentials.
2. Open the navigation menu.
3. Click **Logout**.

**Expected Result:**  
The user should be logged out and redirected to the application home page.

**Actual Result:**  
The user was successfully logged out and redirected to the application home page.

**Status:** PASS

---

# Test Execution Summary

| Total Test Cases | Passed | Failed | Blocked |
|---:|---:|---:|---:|
| 12 | 12 | 0 | 0 |

## Automated Test Scenarios

The following key scenarios are automated using Selenium WebDriver and TestNG:

1. Valid Login
2. Invalid Login
3. Appointment Booking
4. Logout

## Automation Framework

The automation framework uses:

- Java 17
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model
- SLF4J
- Logback
- Git
- GitHub

## Final Execution Result

```text
Tests Run: 4
Passed: 4
Failed: 0
Errors: 0

BUILD SUCCESS