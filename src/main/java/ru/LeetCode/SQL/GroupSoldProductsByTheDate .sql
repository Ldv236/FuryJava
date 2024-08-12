/*Table Activities:

+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| sell_date   | date    |
| product     | varchar |
+-------------+---------+
There is no primary key for this table, it may contain duplicates.
Each row of this table contains the product name and the date it was sold in a market.


Write an SQL query to find for each date the number of different products sold and their names.

The sold products names for each date should be sorted lexicographically.

Return the result table ordered by sell_date.*/

/* Write your T-SQL query statement below */
SELECT sell_date, count(product) as num_sold,
       STRING_AGG(product, ',' ) as products
FROM (select distinct * from Activities) t
GROUP BY sell_date