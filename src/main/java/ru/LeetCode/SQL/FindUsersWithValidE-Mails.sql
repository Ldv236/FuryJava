/*table: Users

+---------------+---------+
| Column Name   | Type    |
+---------------+---------+
| user_id       | int     |
| name          | varchar |
| mail          | varchar |
+---------------+---------+
user_id is the primary key for this table.
This table contains information of the users signed up in a website. Some e-mails are invalid.


Write an SQL query to find the users who have valid emails.

A valid e-mail has a prefix name and a domain where:

The prefix name is a string that may contain letters (upper or lower case), digits, underscore '_', period '.', and/or dash '-'. The prefix name must start with a letter.
The domain is '@leetcode.com'.*/

SELECT user_id, name, mail FROM Users
WHERE mail like '[a-zA-Z]%@leetcode.com'
  and CHARINDEX('@', mail) = LEN(mail) - 12
  and SUBSTRING(mail, 1, CHARINDEX('@', mail) - 1) NOT LIKE '%[^0-9a-zA-Z_.-]%'