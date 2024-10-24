/*Table: Employees

+-------------+----------+
| Column Name | Type     |
+-------------+----------+
| employee_id | int      |
| name        | varchar  |
| reports_to  | int      |
| age         | int      |
+-------------+----------+
employee_id is the primary key for this table.
This table contains information about the employees and the id of the manager they report to. Some employees do not report to anyone (reports_to is null).


For this problem, we will consider a manager an employee who has at least 1 other employee reporting to them.

Write an SQL query to report the ids and the names of all managers, the number of employees who report directly to them, and the average age of the reports rounded to the nearest integer.

Return the result table ordered by employee_id.*/

select e1.reports_to as employee_id, e2.name,
       COUNT(e1.reports_to) as reports_count,
       ROUND(AVG(e1.age * 1.0), 0) as average_age
from Employees e1
         JOIN Employees e2
              ON e1.reports_to = e2.employee_id
where e1.reports_to is not null
GROUP BY e1.reports_to, e2.name
ORDER BY e1.reports_to