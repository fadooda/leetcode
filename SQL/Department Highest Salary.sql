/* Write your MySQL query statement below*/
select dep.Name as "Department", emp.Name as "Employee", emp.Salary
from Employee emp
inner join Department dep
on emp.DepartmentId = dep.id
where emp.Salary in (select max(e.salary) from Employee e where e.DepartmentId =  dep.id group by e.DepartmentId); /*subquery gets the max salary for each department id group */

