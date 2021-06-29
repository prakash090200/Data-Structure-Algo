https://leetcode.com/problems/delete-duplicate-emails/submissions/

//Delete Duplicate Emails


/best
DELETE FROM Person WHERE Id not in
(SELECT * FROM(
    SELECT min(Id) 
    FROM Person 
    GROUP BY Email) as p);

********************************

DELETE p1
FROM Person p1
join Person p2
 WHERE p1.Id > p2.Id
    and p1.Email = p2.Email;