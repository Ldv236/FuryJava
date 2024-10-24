/*Table: Triangle

+-------------+------+
| Column Name | Type |
+-------------+------+
| x           | int  |
| y           | int  |
| z           | int  |
+-------------+------+
(x, y, z) is the primary key column for this table.
Each row of this table contains the lengths of three line segments.


Write an SQL query to report for every three line segments whether they can form a triangle.

Return the result table in any order.

The query result format is in the following example.
*/
/* Write your T-SQL query statement below */
select x, y, z,
       IIF(x+y>z and z+x>y and y+z>x, 'Yes', 'No') as triangle
--and other variant with CASE
--case when (x+y>z and z+x>y and y+z>x) then 'Yes' else 'No' end as triangle
from Triangle