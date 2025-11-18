# Write your MySQL query statement below
select cust.name
from customer cust
where cust.referee_id <> 2 or cust.referee_id is Null