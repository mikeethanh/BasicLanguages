-- tim min , max cua moi column
select min(P.UnitPrice) as MinPrice
from Products as P;

--lay ra ngay dat hang gan day nhat 
select max(O.OrderDate)
from Orders as O