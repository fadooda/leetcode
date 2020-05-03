/* Find the second highest salary*/
select max(salary) as "SecondHighestSalary" /* get the second max (second highest) salary after the where filters out the highest */
from employee
where salary < (select max(salary) from employee); /*get all the salaries that are not max (highest salary) */