https://leetcode.com/problems/not-boring-movies/submissions/

// Not Boring Movies

select id,movie,description,rating 
from cinema
where description <> 'boring'
and mod(id,2)<>0
order by rating desc;