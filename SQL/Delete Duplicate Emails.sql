/*Delete Duplicate Emails*/
delete prow from person prow, person p2table 
where prow.email = p2table.email and prow.id > p2table.id; /* it will delete duplicate rows based on: the same email and the greater id (to keep the minimum id)*/


/* Different query solution, that returns minimum id along with the respective unique emails without deleting it from the original table*/
select min(id) as Id, Email
from Person
group by email
order by id; 