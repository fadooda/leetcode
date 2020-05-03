/* Combine two tables*/
select p.FirstName, p.LastName, a.City, a.State
from person p 
left join Address a /*left join to include person(s) that do not have a registered address (address will be displayed as null)*/
on p.personid =a.personid


