/*Table: Delivery

+-----------------------------+---------+
| Column Name                 | Type    |
+-----------------------------+---------+
| delivery_id                 | int     |
| customer_id                 | int     |
| order_date                  | date    |
| customer_pref_delivery_date | date    |
+-----------------------------+---------+
delivery_id is the primary key of this table.
The table holds information about food delivery to customers that make orders at some date and specify a preferred delivery date (on the same order date or after it).


If the customer's preferred delivery date is the same as the order date, then the order is called immediate; otherwise, it is called scheduled.

The first order of a customer is the order with the earliest order date that the customer made. It is guaranteed that a customer has precisely one first order.

Write an SQL query to find the percentage of immediate orders in the first orders of all customers, rounded to 2 decimal places.*/

SELECT
    ROUND(
                    (SELECT count(DISTINCT(d1.customer_id))
                     FROM Delivery d1
                              JOIN (
                         select customer_id, min(order_date) as min_date from Delivery
                         GROUP BY customer_id) d2
                                   ON d1.customer_id = d2.customer_id
                                       AND d1.order_date = d2.min_date
                     WHERE d2.min_date = d1.customer_pref_delivery_date)
                    * 100.00
                /
                    (SELECT count(DISTINCT(customer_id)) FROM Delivery)
        , 2)
        as immediate_percentage
