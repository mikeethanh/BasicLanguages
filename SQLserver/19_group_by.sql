-- dung de nhom cac dong du lieu co cung gia tri 
-- thuong duoc dung voi cac ham: count(), max(), min(), sum(), ang()

-- hay cho viet moi khach hang dat bao nhieu don hang 
select O.CustomerID, count(O.OrderID) as totalOrders
from Orders as O
group by O.CustomerID
order by count(O.OrderID)

select P.SupplierID , AVG(p.UnitPrice)
from Products as P
group by p.SupplierID
order by AVG(p.UnitPrice)

-- hay cho biet moi the loai co bao nhieu san pham trong kho 
select  P.CategoryID , count(P.ProductID) as totalProduct
from Products as P
group by P.CategoryID

-- hay cho bieu gia van chuyen thap nhat va lon nhat theo tung thanh pho va quoc 
-- quoc gia khac nhau 

select O.ShipCountry, O.ShipCity, max(O.Freight) as maxFreight, min(O.Freight) as minFreight
from Orders as O
group by O.ShipCountry, O.ShipCity

-- hay thong ke so luong nhan vien theo tuong quoc gia khac nhau 
select count(e.EmployeeID), e.Country
from Employees as e 
group by e.Country
order by e.Country

