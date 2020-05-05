/*Write a SQL solution to output big countries' name, population and area*/
select w.Name, w.Population, w.Area
from world w
where w.Population > 25000000 or w.area > 3000000