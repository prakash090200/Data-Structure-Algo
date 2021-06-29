https://leetcode.com/problems/second-highest-salary/submissions/

//second-highest-salary

Select max(salary) as 'SecondHighestSalary'
from Employee
where salary (Select max(Salary) from Employee);