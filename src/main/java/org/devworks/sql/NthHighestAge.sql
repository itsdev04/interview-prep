--Nth highest age
select max(age) from customers where age < (select max(age) from customers);

select distinct age from customers order by age desc limit 2 -- numbers
offset 1; -- n-1: Skips the top n-1 records.
