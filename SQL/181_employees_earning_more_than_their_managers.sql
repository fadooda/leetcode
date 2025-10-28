/*Employees Earning More Than Their Managers*/
select emp.Name as Employee
from Employee emp
inner join Employee mang /*self join on employeee table to get managers*/
on emp.ManagerId = mang.Id 
where emp.Salary > mang.Salary /* compare salaries of employees to managers