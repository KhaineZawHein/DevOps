# Use Case 2: Produce a Report on the Salary of Employees in a Department

## Goal in Context
As an HR advisor I want to produce a report on the salary of employees in a department so that I can support financial reporting of the organisation.

## Scope
HR System

## Level
User goal

## Preconditions
- The HR advisor is logged into the HR System.
- Department and employee salary data exists in the database.

## Success Condition
A report containing the salary of employees in a specific department is generated and can be viewed/printed.

## Failed Condition
- The specified department does not exist.
- The system fails to generate the report.

## Primary Actor
HR Advisor

## Trigger
The HR advisor requests a salary report for a specific department.

## Main Success Scenario
1. HR advisor logs into the HR System.
2. HR advisor selects the option to generate a salary report.
3. HR advisor chooses to view salaries for a **specific department**.
4. The system retrieves the employee salary data for that department from the database.
5. The system displays the salary report.
6. HR advisor reviews the report.

## Extensions
- 3a. Department not found:
    - System displays a message: "Department not found."
    - Use case ends.
- 4a. Database connection fails:
    - System displays an error message.
    - HR advisor retries or contacts support.
    - Use case ends.

## Sub-variations
- 5a. HR advisor chooses to print the report instead of viewing it.
    - System sends the report to the printer.

## Schedule
This use case can be executed at any time during the financial reporting period.