https://leetcode.com/problems/customers-who-never-order/submissions/

//Customers Who Never Order



//Best
Select c.name as Customers
from customers c
left join orders o
on c.id=o.customerid
where o.id is NULL;

********************

Select c.name as Customers
from customers c
where not exists(Select id from orders o where o.customerId=c.id);