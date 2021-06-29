https://leetcode.com/problems/department-highest-salary/submissions/

//Department Highest Salary

SELECT
    Department,
    Employee,
    Salary
FROM
(SELECT
    d.Name AS Department,
    e.Name AS Employee,
    e.Salary,
    DENSE_RANK() OVER(PARTITION BY DepartmentId ORDER BY Salary DESC) AS 'rnk'
FROM Employee e
JOIN Department d
ON e.DepartmentId = d.Id)as a
WHERE rnk = 1;