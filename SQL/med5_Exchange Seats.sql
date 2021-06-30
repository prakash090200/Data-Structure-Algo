https://leetcode.com/problems/exchange-seats/submissions/

//Exchange Seats

select
case
when id%2=0 then id-1
when id%2!=0 and id!=(select count(id) from seat) then id+1
else id
end
as id,student
from seat order by id;


****************************
select id, 
CASE 
WHEN id % 2 != 0 THEN IFNULL(LEAD(student) OVER(ORDER BY id), student)
ELSE   ifnull(LAG(student)  OVER(ORDER BY id), student)
END as student
from seat;