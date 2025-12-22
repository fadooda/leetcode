# Write your MySQL query statement below
    select e.employee_id,
    case 
    when count(e.department_id)=1 
    then e.department_id
    else primarydep.department_id end as department_id
from Employee e 
left join (
    select e.employee_id, e.department_id
    from employee e 
    where e.primary_flag='Y'
) primarydep on primarydep.employee_id=e.employee_id 
group by  e.employee_id
