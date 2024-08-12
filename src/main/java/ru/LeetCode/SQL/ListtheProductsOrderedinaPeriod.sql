/*Table: Products

+------------------+---------+
| Column Name      | Type    |
+------------------+---------+
| product_id       | int     |
| product_name     | varchar |
| product_category | varchar |
+------------------+---------+
product_id is the primary key for this table.
This table contains data about the company's products.


Table: Orders

+---------------+---------+
| Column Name   | Type    |
+---------------+---------+
| product_id    | int     |
| order_date    | date    |
| unit          | int     |
+---------------+---------+
There is no primary key for this table. It may have duplicate rows.
product_id is a foreign key to the Products table.
unit is the number of products ordered in order_date.


Write an SQL query to get the names of products that have at least 100 units ordered in February 2020 and their amount.

Return result table in any order.
*/
SELECT product_name, SUM(unit) as unit
FROM Products p
JOIN Orders o
ON p.product_id  = o.product_id
WHERE order_date between '2020-02-01' and DATEADD(dd, -1, '2020-03-01')
GROUP BY product_name
HAVING SUM(unit) >= 100