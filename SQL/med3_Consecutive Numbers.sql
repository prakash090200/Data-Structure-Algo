https://leetcode.com/problems/consecutive-numbers/submissions/

//Consecutive Numbers

select distinct Num as ConsecutiveNums
from (select Num, lag (Num, 1) over (order by id asc) as Num1, 
	lag (Num, 2) over (order by id asc) as Num2
	from Logs) as sub
where Num = Num1 and Num1 = Num2;


********************************************
// cross join technique

select distinct a.num as consecutivenums 
from logs a,logs b,logs c 
where a.num=b.num and b.num=c.num AND 
b.id-a.id=1 and c.id-b.id=1;