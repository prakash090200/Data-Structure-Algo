https://leetcode.com/problems/rising-temperature/submissions/

//Rising Temperature

Select w2.id AS id
From Weather w1  
Join (select id, date_sub(recordDate,interval 1 day) as recordDate, Temperature         from Weather) as w2
ON w2.recordDate=w1.recordDate
WHERE w2.Temperature > w1.Temperature;
