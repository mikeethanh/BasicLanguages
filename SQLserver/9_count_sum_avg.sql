select count(C.CustomerID) as NumberOfCustomer
from Customers as C

select sum(O.Freight)
from Orders as O

select avg(OD.Quantity)
from [Order Details] as OD
