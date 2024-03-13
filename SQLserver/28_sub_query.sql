-- sub query/ nested query: truy van con , truy van lon nhau 

--sub query : la 1 cau truy van select dc viet trong mot truy van select, update 
--ínert , delete

-- suybquery hoat dong nhu mot bang ao tam thoi , no duoc su dung de trich xuat 
-- thong tin tu cac bang hoac ten du lieu khac trong cung 1 cau truy van 

--lieu le ra toan bo san phan 
select P.ProductID, P.ProductName, P.UnitPrice 
from Products as P

-- tim gia tri trung binh cua san phan 
select avg(P.UnitPrice)
from Products as P

-- loc nhung san pham co gia > gia trung binh (SUB QUERY)
select P.ProductID, P.ProductName, P.UnitPrice 
from Products as P
where P.UnitPrice > (
	select avg(P.UnitPrice)
	from Products as P
)


-- loc ra nhung khach hang co so don hang > 10
SELECT O.CustomerID, C.CompanyName, COUNT(O.OrderID) AS NumberOfOrders
FROM Orders AS O
JOIN Customers AS C ON C.CustomerID = O.CustomerID
GROUP BY O.CustomerID, C.CompanyName
HAVING COUNT(O.OrderID) > 10;

--subquery
select *
from Customers as C
where C.CustomerID in (
 select O.CustomerID
 from Orders as O
 group by O.CustomerID
 having count(O.OrderID) > 10
)

-- Tinh tong tien cho tung don hang
SELECT o.*, (
		SELECT SUM(od.Quantity*od.UnitPrice)
		FROM [dbo].[Order Details] od
		WHERE o.OrderID = od.OrderID
	) AS [Total]
FROM [dbo].[Orders] o;


-- Loc ra ten san pham va tong so don hang cua san pham
SELECT ProductName, TotalOrders
FROM 
	(SELECT p.ProductID, p.ProductName, (
				SELECT COUNT(*)
				FROM [dbo].[Order Details] od
				WHERE od.ProductID = p.ProductID
			) as [TotalOrders]
	FROM [dbo].[Products] p) AS Temp;


