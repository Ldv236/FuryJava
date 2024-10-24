/*Table: Employees

+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| employee_id | int     |
| name        | varchar |
+-------------+---------+
employee_id is the primary key for this table.
Each row of this table indicates the name of the employee whose ID is employee_id.


Table: Salaries

+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| employee_id | int     |
| salary      | int     |
+-------------+---------+
employee_id is the primary key for this table.
Each row of this table indicates the salary of the employee whose ID is employee_id.


Write an SQL query to report the IDs of all the employees with missing information. The information of an employee is missing if:

The employee's name is missing, or
The employee's salary is missing.
Return the result table ordered by employee_id in ascending order.*/
SELECT ISNULL(e.employee_id, s.employee_id) as employee_id
--SELECT CASE WHEN e.employee_id is not null THEN e.employee_id ELSE s.employee_id END as employee_id
FROM Employees e
         FULL JOIN  Salaries  s
                    ON e.employee_id = s.employee_id
WHERE name is null
   OR salary is null
ORDER BY 1
