https://leetcode.com/problems/rank-scores/


//https://www.youtube.com/watch?v=QFj-hZi8MKk&ab_channel=.NETInterviewPreparationvideos

//https://www.youtube.com/watch?v=SnHuzYstzHw&t=29s&ab_channel=Lotusamaze

//Rank Scores

Select score,
dense_rank() over (order by score desc) as 'rank'
from SCORES
ORDER BY score desc;
