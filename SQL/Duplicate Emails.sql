https://leetcode.com/problems/duplicate-emails/submissions/

//Duplicate Emails

Select Email 
from person 
group by email
having count(email)>1;