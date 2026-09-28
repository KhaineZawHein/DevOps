# Use Case 7: Update an Employee's Details

## Goal in Context
As an HR advisor I want to update an employee's details so that employee's details are kept up-to-date.

## Scope
HR System

## Level
User goal

## Preconditions
- The HR advisor is logged into the HR System.
- The employee whose details are being updated exists in the database.

## Success Condition
The employee's details are successfully updated and saved in the database.

## Failed Condition
- The specified employee does not exist.
- The entered data is invalid.
- The system fails to save the updated data to the database.

## Primary Actor
HR Advisor

## Trigger
An employee's personal or professional information has changed (e.g., address, role, salary).

## Main Success Scenario
1. HR advisor selects the option to update employee details.
2. HR advisor searches for the specific employee.
3. The system retrieves and displays the current employee details.
4. HR advisor modifies the necessary fields.
5. HR advisor submits the updated information.
6. The system validates the new data.
7. The system saves the updated details to the database.
8. The system displays a confirmation message.

## Extensions
- 2a. Employee not found:
    - System displays a message: "Employee not found."
    - Use case ends.
- 6a. Data validation fails (e.g., invalid date or missing required field):
    - System highlights the errors and prompts the HR advisor to correct them.
- 7a. Database connection fails:
    - System displays an error message.
    - HR advisor retries or contacts support.

## Sub-variations
- None.

## Schedule
This use case is executed whenever an employee's information needs to be changed.