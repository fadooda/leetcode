/*Write your MySQL query statement below*/
select max(e.salary) from Employee e
inner join Department d
on e.DepartmentId = d.id
group by e.DepartmentId
