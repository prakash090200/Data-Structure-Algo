// https://leetcode.com/problems/classes-more-than-5-students/submissions/

///Classes More Than 5 Students


Select class 
from courses
group by class
having count(distinct student) >4;