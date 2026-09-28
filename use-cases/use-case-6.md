# Use Case 6: View an Employee's Details

## Goal in Context
As an HR advisor I want to view an employee's details so that the employee's promotion request can be supported.

## Scope
HR System

## Level
User goal

## Preconditions
- The HR advisor is logged into the HR System.
- The employee exists in the database.

## Success Condition
The requested employee's details are successfully retrieved and displayed.

## Failed Condition
- The specified employee does not exist.
- The system fails to retrieve the data.

## Primary Actor
HR Advisor

## Trigger
An employee has submitted a promotion request, and the HR advisor needs to review their current details.

## Main Success Scenario
1. HR advisor logs into the HR System.
2. HR advisor selects the option to view employee details.
3. HR advisor enters the employee's identifier (e.g., Employee Number or Name).
4. The system searches