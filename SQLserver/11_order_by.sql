-- asc: tang dan , desc: giam dan
select S.CompanyName
from Suppliers as S
order by S.CompanyName desc

select S.*
from Suppliers as S
order by S.CompanyName asc

select P.* 
from Products as P
order by P.UnitPrice desc

-- sap xep theo thu tu ho va ten dem 

select E.*
from Employees as E
order by E.LastName,E.FirstName 

-- lay ra 1 san pham co so luong ban cao nhat tu bangr Order Details
select top 1 OD.*
from [Order Details] as OD
order by OD.UnitPrice desc

select O.OrderID 
from Orders as O
order by O.OrderDate desc
