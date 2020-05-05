/* Write a SQL query to find all duplicate emails in a table named Person*/
select p.Email
From Person p
group by p.Email /*get emails into a single row (by grouping) then filter group by count */
having count( p.Email) > 1