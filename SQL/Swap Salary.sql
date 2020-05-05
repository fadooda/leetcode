/* Using sql write a query to swap all male and female values from salary table*/
update Salary s
set s.sex = (case when s.sex = 'm' then 'f'
            else 'm'
            end);
            