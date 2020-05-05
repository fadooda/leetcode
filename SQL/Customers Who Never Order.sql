/*Customers Who Never Order*/
select cus.Name as "Customers"
from Customers cus
left join Orders o  /*left join then filter on null to find customers who did not order*/
On cus.id = o.CustomerId 
where o.Customerid is null
