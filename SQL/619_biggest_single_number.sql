# Write your MySQL query statement below
-- select  max(case when count(*))
-- from MyNumbers
with cte as(
select mn.num
 from MyNumbers mn
 group by mn.num
 having count(*)=1
)
select max(cte.num) as num
from cte