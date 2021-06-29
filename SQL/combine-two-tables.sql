https://leetcode.com/problems/combine-two-tables/

//combine-two-tables



select p.FirstName,p.LastName,a.City,a.State
from Person p
left join Address a
using(PersonId);