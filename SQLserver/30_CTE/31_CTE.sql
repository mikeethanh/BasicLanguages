--common table expression
with short_e as (
	select e.EmployeeID, e.LastName, e.FirstName
	from Employees as e
)
select * 
from short_e

--lay ra thong tin ve cac san pham co cung the loai voi mot san pham cu the 
select p.CategoryID, p.ProductName
from Products as p
where p.CategoryID = (
	select p.CategoryID
	from Products as p
	where ProductName = 'Chai'
)

select * 
from Products
--c2: su dung sub query + join
select  P.CategoryID, P.ProductName
from Products as P
join (
		select CategoryID
		from Products
		where ProductName = 'Chai'
) as subquery
on P.CategoryID = subquery.CategoryID

--c3: su dung CTE
with ProuctCategory as (
	select P.CategoryID
	from Products as P
	where P.ProductName = 'Chai'
)
select P.ProductName, P.CategoryID
from Products as P
join ProuctCategory as PC
on PC.CategoryID = P.CategoryID

-- lay thong tin ve don hang , cung voi tong gia ti don hang va 
-- tong gia tri don hang so voi phi giao hang
with totalPrice as (
	select OD.OrderID,sum(OD.Quantity * OD.UnitPrice) as totalPricePerOrders
	from [Order Details] as OD
	group by OrderID
)

select O.OrderID, O.Freight, TP.totalPricePerOrders, (TP.totalPricePerOrders/O.Freight) as ratio
from Orders as O
join totalPrice as TP
on TP.OrderID = O.OrderID
