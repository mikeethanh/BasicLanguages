-- having: loc du lieu sau group by 

-- hay cho biet khach hang nao da dat nhieu hon 20 dong hang , sap sep theo thu tu tong so don hang 
-- giam dan

select  O.CustomerID, count(O.OrderID) as totalOrders
from Orders as O
group by O.CustomerID
having count(O.OrderID) > 20
order by count(O.OrderID) desc

-- hay loc ra nha cung cap san pham co tong so luong hang trong kho 30, va co trung 
-- binh don gia co gia tri duoi 50 

select P.SupplierID, sum(P.UnitsInStock), avg(P.UnitPrice)
from Products as P 
group by P.SupplierID
having sum(P.UnitsInStock) > 20 and avg(P.UnitPrice) < 50

-- hay cho viet tong so tien van chuyen cua tung thang, trong 