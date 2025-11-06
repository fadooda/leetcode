# Write your MySQL query statement below
select t.x,t.y,t.z,
case 
when t.x + t.y <= t.z
then "No"
when t.x + t.z<= t.y
then "No"
when t.z + t.y<= t.x
then "No"
else "Yes"
end as triangle
from triangle t
