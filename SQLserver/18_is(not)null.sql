-- lay ra tat ca cac don hang chua duoc giao hang 
select O.ShippedDate 
from Orders as O
where O.ShippedDate is null

select C.Region
from Customers as C
where C.Region is not null