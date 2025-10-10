# Write your MySQL query statement below
select p.product_name, sum(o.unit) unit
from Orders o
join products p on p.product_id= o.product_id
WHERE DATE_FORMAT(o.order_date, '%Y-%m') = '2020-02'
group by date_format(o.order_date, '%Y-%m'), o.product_id
having unit>=100

