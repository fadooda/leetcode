# Write your MySQL query statement below

select f.user_id, count(*) as followers_count
from Followers f 
group by f.user_id
order by f.user_id asc
