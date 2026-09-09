# Healthcare Patient Management Platform
## Test Cases

| TC ID | Module | Test Scenario | Expected Result | Type |
|---|---|---|---|---|
| TC-001 | Login | Login with valid credentials | User should successfully log in | Functional |
| TC-002 | Login | Login with invalid username | Appropriate error message should display | Functional |
| TC-003 | Login | Login with invalid password | Appropriate error message should display | Functional |
| TC-004 | Login | Login with blank credentials | Validation message should display | Functional |
| TC-005 | Patient | Register a new patient with valid data | Patient should be registered successfully | Functional |
| TC-006 | Patient | Register patient with mandatory fields blank | Validation messages should display | Functional |
| TC-007 | Patient Search | Search patient using valid Patient ID | Correct patient details should display | Functional |
| TC-008 | Patient Search | Search using invalid Patient ID | Appropriate message should display | Functional |
| TC-009 | Appointment | Create appointment with valid details | Appointment should be created successfully | Functional |
| TC-010 | Appointment | Create appointment with missing mandatory data | Validation message should display | Functional |
| TC-011 | Logout | Logout from application | User should be logged out successfully | Functional |
| TC-012 | Regression | Execute critical existing functionality after changes | Existing functionality should continue working | Regression |