/* Write your PL/SQL query statement below */
select a.id from weather a,weather b where a.recorddate-1=b.recorddate and a.temperature>b.temperature;