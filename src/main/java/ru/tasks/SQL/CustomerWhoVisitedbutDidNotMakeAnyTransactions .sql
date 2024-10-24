/*Table: Visits

+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| visit_id    | int     |
| customer_id | int     |
+-------------+---------+
visit_id is the primary key for this table.
This table contains information about the customers who visited the mall.


Table: Transactions

+----------------+---------+
| Column Name    | Type    |
+----------------+---------+
| transaction_id | int     |
| visit_id       | int     |
| amount         | int     |
+----------------+---------+
transaction_id is the primary key for this table.
This table contains information about the transactions made during the visit_id.


Write a SQL query to find the IDs of the users who visited without making any transactions
and the number of times they made these types of visits.*/
SELECT customer_id, count(*) as count_no_trans
FROM Visits v
         LEFT JOIN Transactions t
                   ON v.visit_id = t.visit_id
WHERE transaction_id is null
GROUP BY customer_id, transaction_id