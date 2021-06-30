https://leetcode.com/problems/department-top-three-salaries/

//Department Top Three Salaries


Select department,Employee, salary from
(SELECT d.name as Department,e.name as Employee ,e.salary as Salary,
DENSE_RANK() over(partition by e.departmentid order by salary desc) as 'r'
from employee e
join department d
on e.departmentId=d.id) as a
where r <4;