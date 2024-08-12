/*Table: Products

+---------------+---------+
| Column Name   | Type    |
+---------------+---------+
| product_id    | int     |
| new_price     | int     |
| change_date   | date    |
+---------------+---------+
(product_id, change_date) is the primary key of this table.
Each row of this table indicates that the price of some product was changed to a new price at some date.


Write an SQL query to find the prices of all products on 2019-08-16. Assume the price of all products before any change is 10.*/

WITH on_date AS
         (SELECT product_id, MAX(change_date) as dt
          FROM Products AS src
          WHERE change_date <= '2019-08-16'
          GROUP BY src.product_id)

SELECT gp.product_id, ISNULL(src.new_price, 10) as price
FROM (select product_id from Products group by product_id) as gp
         LEFT JOIN on_date
                   ON gp.product_id = on_date.product_id
         LEFT JOIN Products src
                   ON src.change_date = on_date.dt
                       AND src.product_id = gp.product_id