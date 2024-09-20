# Write your MySQL query statement below
select contest_id,ROUND(COUNT(1) * 100 / (SELECT COUNT(1) FROM Users), 2) AS percentage 
from register 
group by 1 
order by 2 desc,1