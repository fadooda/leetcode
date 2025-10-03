# Write your MySQL query statement below
SELECT u.user_id, concat(upper(LEFT(u.name, 1)), lower(right(u.name,length(u.name)-1))) name
from  Users u
order by u.user_id asc
        