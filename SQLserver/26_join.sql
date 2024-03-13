-- inner join or join: tra ve tat ca cac hang khi co it nhat 1 gia tri o 2 bang 

-- su dung inner join tu bang product va bang categories , in ra cac thong tin 
-- ma the loai , ten the loai , ma san phan , ten san pham 

select C.CategoryID, C.CategoryName, P.ProductID, P.ProductName 
from Products as P 
inner join Categories as C
on P.CategoryID = C.CategoryID ;

-- su dung inner join tu bang product va bang categories , in ra cac thong tin 
-- ma the loai , ten the loai , so luong san pham theo tung the loai 

select C.CategoryID, C.CategoryName, count(P.ProductID) as totalProduct
from Products as P
join Categories as C
on P.CategoryID = C.CategoryID
group by C.CategoryID, C.CategoryName

-- hay lay ra thong tin sau day :
-- ma don hang , ten cong ty khach hang 

select O.OrderID, C.CompanyName
from Customers as C 
join Orders as O
on O.CustomerID = C.CustomerID


--LEFT JOIN OR LEFT OUTER JOIN: tra lai tat cac cac dong ben trai , va cac ong dung voi dien kieu tu ben phai 

-- su dung left join de lay ra cac categories ma khong duoc su dung trong cac san phm
--tu bang product va categories , hay dua ra cac thong tin sau day: 
-- ma the loai 
-- ten the loai 
-- ten san pham 

select C.CategoryID, C.CategoryName, count(P.ProductName) 
from Categories as C
left join Products as P
on P.CategoryID = C.CategoryID 
group by C.CategoryID, C.CategoryName

-- right join : tra lai tat ca cac hang tu bang ben phai , va cac dong thoa man dieu kieu ben trai

-- full join : tra ve tat ca cac dong dung voi 1 or nhieu bang 

