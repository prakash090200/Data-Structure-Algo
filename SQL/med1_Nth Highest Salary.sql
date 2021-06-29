https://leetcode.com/problems/nth-highest-salary/

//Nth Highest Salary



CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
 DECLARE IND INT;
  SET IND = N - 1;
  RETURN (
      # Write your MySQL query statement below.
      Select DISTINCT  Salary 
      from Employee 
      order by  Salary desc
      LIMIT ind,1
  );
END
