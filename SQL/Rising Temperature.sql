/*Problem: Given a Weather table, write a SQL query to find all dates' Ids with higher temperature compared to its previous (yesterday's) dates.*/

Select w.id 
from weather w
inner join weather wther /*self-join to compare rows*/
on  DATEDIFF(w.RecordDate, wther.RecordDate) = 1 /*Use datediff to get the difference from the date format in terms of day(s)*/
and w.temperature> wther.temperature; /*compare today temperature to yesterday*/