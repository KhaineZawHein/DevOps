# Use Case 3: Produce a Report on the Salary of Employees in My Department

## Goal in Context
As a department manager I want to produce a report on the salary of employees in my department so that I can support financial reporting for my department.

## Scope
HR System

## Level
User goal

## Preconditions
- The department manager is logged into the HR System.
- Employee salary data exists in the database.
- The manager is assigned to a specific department.

## Success Condition
A report containing the salary of employees in the manager's department is generated and can be viewed/printed.

## Failed Condition
- The manager has no assigned department.
- The system fails to generate the report.

## Primary Actor
Department Manager

## Trigger
The department manager requests a salary report for their department.

## Main Success Scenario
1. Department manager logs into the HR System.
2. Department manager selects the option to generate a salary report.
3. The system identifies the manager's assigned department.
4. The system retrieves the employee salary data for that department from the database.
5. The system displays the salary report.
6. Department manager reviews the report.

## Extensions
- 3a. Manager has no department assigned:
    - System displays a message: "No department assigned."
    - Use case ends.
- 4a. Database connection fails:
    - System displays an error message.
    - Manager retries or contacts support.
    - Use case ends.

## Sub-variations
- 5a. Manager chooses to print the report instead of viewing it.
    - System sends the report to the printer.

## Schedule
This use case can be executed at any time during the financial reporting period.