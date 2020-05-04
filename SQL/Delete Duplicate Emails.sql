/*Delete Duplicate Emails*/
delete prow from person prow, person p2table 
where prow.email = p2table.email and prow.id > p2table.id; /* it will delete duplicate rows based on, the same email and the greater id (to keep the minimum id)*/
