/*Table: Users

+----------------+---------+
| Column Name    | Type    |
+----------------+---------+
| user_id        | int     |
| name           | varchar |
+----------------+---------+
user_id is the primary key for this table.
This table contains the ID and the name of the user. The name consists of only lowercase and uppercase characters.


Write an SQL query to fix the names so that only the first character is uppercase and the rest are lowercase.

Return the result table ordered by user_id.*/

SELECT [user_id],
--UPPER(LEFT ([name], 1)) +
    UPPER(SUBSTRING ([name], 1, 1)) +
    LOWER(SUBSTRING ([name], 2, LEN([name]))) as [name]
FROM [Users]
ORDER BY user_id
