# Use Case 8: Delete an Employee's Details

## Goal in Context
As an HR advisor I want to delete an employee's details so that the company is compliant with data retention legislation.

## Scope
HR System

## Level
User goal

## Preconditions
- The HR advisor is logged into the HR System.
- The employee to be deleted exists in the database.

## Success Condition
The employee's details are successfully removed from the database.

## Failed Condition
- The specified employee does not exist.
- The system fails to delete the data from the database.

## Primary Actor
HR Advisor

## Trigger
An employee's data retention period has expired, or a formal request to delete the employee's data has been received.

## Main Success Scenario
1. HR advisor selects the option to delete an employee.
2. HR advisor searches for the specific employee.
3. The system retrieves and displays the employee's current details.
4. HR advisor confirms the deletion action.
5. The system removes the employee's details from the database.
6. The system displays a confirmation message that the deletion was successful.

## Extensions
- 2a. Employee not found:
    - System displays a message: "Employee not found."
    - Use case ends.
- 4a. HR advisor cancels the action:
    - System aborts the deletion.
    - Use case ends.
- 5a. Database connection fails:
    - System displays an error message.
    - HR advisor retries or contacts support.

## Sub-variations
- None.

## Schedule
This use case is executed when data retention policies require the removal of employee records.