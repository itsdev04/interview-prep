
select status, count(status) as occurences
from shippings
group by status
having occurences > 1;