/*Table: Users

+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| user_id     | int     |
| user_name   | varchar |
+-------------+---------+
user_id is the primary key for this table.
Each row of this table contains the name and the id of a user.


Table: Register

+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| contest_id  | int     |
| user_id     | int     |
+-------------+---------+
(contest_id, user_id) is the primary key for this table.
Each row of this table contains the id of a user and the contest they registered into.


Write an SQL query to find the percentage of the users registered in each contest rounded to two decimals.

Return the result table ordered by percentage in descending order. In case of a tie, order it by contest_id in ascending order.*/

SELECT contest_id,
       ROUND(count(contest_id)* 100.00 / (select count(*) from Users), 2) as percentage
FROM Register
GROUP BY contest_id
ORDER BY count(contest_id) desc, contest_id