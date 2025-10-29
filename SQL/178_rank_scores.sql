/* Rank scores*/ 
Select Score,
       dense_rank() over (order by score desc) as "Rank"  /*make a rank based on score desc*/
From Scores 

