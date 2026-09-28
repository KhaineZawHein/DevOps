# Use Case 5: Add a New Employee's Details

## Goal in Context
As an HR advisor I want to add a new employee's details so that I can ensure the new employee is paid.

## Scope
HR System

## Level
User goal

## Preconditions
- The HR advisor is logged into the HR System.

## Success Condition
The new employee's details are successfully saved in the database.

## Failed Condition
- Required fields are missing or invalid.
- The system fails to save the data to the database.

## Primary Actor
HR Advisor

## Trigger
A new employee has been hired and needs to be added to the system.

## Main Success Scenario
1. HR advisor selects the option to add a new employee.
2. The system displays a form for employee details.
3. HR advisor enters the required details (e.g., name, role, salary, department).
4. HR advisor submits the form.
5. The system validates the entered data.
6. The system saves the new employee details to the database.
7. The system displays a confirmation message.

## Extensions
- 3a. Required fields are left blank:
    - System highlights the missing fields and prompts the HR advisor to fill them.
- 5a. Data validation fails (e.g., invalid date format):
    - System displays an error message describing the issue.
    - HR advisor corrects the data and resubmits.
- 6a. Database connection fails:
    - System displays an error message.
    - HR advisor retries or contacts support.

## Sub-variations
- None.

## Schedule
This use case is executed whenever a new employee is hired.