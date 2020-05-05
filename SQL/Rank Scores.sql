/* Rank scores*/ 
Select sboard.Score,
       (Select Count(1) + 1  /* add one to the counter to begin at 1 instead of zero  */
	   From (Select Distinct Score from Scores) as uniqScore 
	   where sboard.Score <uniqScore.Score) as "Rank"  /*only increment when the sboard is less than uniqScore*/
From Scores sboard 
Order by sboard.Score Desc;
