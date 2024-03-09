-- union / union all: ket hop cac ket qua 


-- tu bang detail hay liet ke cac don hang tu 100 -> 200
select OD.OrderID
from [Order Details] as OD
where od.UnitPrice between 100 and 200
-- res = 22

-- dua ra tat ca don hang co so luong bang 10 
select OD.OrderID
from [Order Details] as OD
where od.Quantity in (10,20)
-- res = 433

-- ket hop giua 1 va 2 
select OD.OrderID
from [Order Details] as OD
where od.UnitPrice between 100 and 200 and od.Quantity in (10,20)
-- res = 7 

-- ket hop lai nhung sua lai thanh OR
select OD.OrderID
from [Order Details] as OD
where od.UnitPrice between 100 and 200 or od.Quantity in (10,20)
-- res - (433+22-7)448 (co the trong 1 don 2 thoa man 2 dieu kien nen duoc xuat hien 2 lan )

-- su dung DISTINCT
select distinct OD.OrderID
from [Order Details] as OD
where od.UnitPrice between 100 and 200 or od.Quantity in (10,20)
-- res = 360

-- union : 
-- duoc su ung de ket hop nhieu truy van lai voi nhau 
-- moi cau lenh ben trong phai co cung so luong cot 
-- cac cot phai co kieu du lieu tuong tu 
-- cac cot trong moi cau lenh cung phai theo cung thu tu 

-- 
select OD.OrderID
from [Order Details] as OD
where od.UnitPrice between 100 and 200
union 
select OD.OrderID
from [Order Details] as OD
where od.Quantity in (10,20)
-- res = 360


select OD.OrderID
from [Order Details] as OD
where od.UnitPrice between 100 and 200
union all
select OD.OrderID
from [Order Details] as OD
where od.Quantity in (10,20)
-- res = 455

-- hay liet ke toan bo cac thanh pho va quoc gia ton tai trong 2 tables voi 2 tinh huong 
-- UNION va UNION ALL
select distinct country 
from Suppliers
union 
select distinct country
from Customers

-- 
select distinct country 
from Suppliers
union all
select distinct country
from Customers