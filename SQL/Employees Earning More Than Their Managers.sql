
https://leetcode.com/problems/employees-earning-more-than-their-managers/submissions/

// Employees Earning More Than Their Managers

SELECT A.Name AS Employee
FROM Employee A
left JOIN Employee B
ON A.managerid = B.id
Where A.salary > B.salary;

*************OR************************

select e1.Name as 'Employee'
from Employee e1
where e1.Salary>(Select Salary 
              from Employee e2
              where e2.id=e1.managerid
             );
