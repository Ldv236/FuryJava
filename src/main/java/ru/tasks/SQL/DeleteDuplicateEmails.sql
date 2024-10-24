/*
 Please write a DELETE statement and DO NOT write a SELECT statement.
 Write your T-SQL query statement below
 */
 DELETE p1 FROM Person p1, Person p2
 WHERE p1.Email = p2.Email and p1.id > p2.id
