https://leetcode.com/problems/trips-and-users/

//Trips and Users

select
  request_at as Day,
  round(
sum(status = 'cancelled_by_driver' or 
    status = 'cancelled_by_client')/count(id), 2) as 'Cancellation Rate'
from trips
where
  request_at between '2013-10-01' and '2013-10-03' and
  client_id not in (select users_id from users where banned = 'Yes') and
  driver_id not in (select users_id from users where banned = 'Yes')
group by request_at;