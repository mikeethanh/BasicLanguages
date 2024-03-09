-- day, month, year
-- lay ra du lieu ngay, thang , nam

-- tinh so luong don dat hang cua tung khach hang trong nam 1997 cua tung khach hang 

select O.CustomerID, year(O.OrderDate) as YearOrder, count(O.OrderID) as TotalOrders
from Orders as O
where  year(O.OrderDate) = 1997 
group by O.CustomerID, year(O.OrderDate)
order by count(O.OrderID)

-- hay loc ra tat ca cac don hang vao thang 5 nam 1997
select O.CustomerID, year(O.OrderDate) as YearOrder, month(O.OrderDate) as MonthOrders ,count(O.OrderID) as TotalOrders
from Orders as O
where  year(O.OrderDate) = 1997 and month(O.OrderDate) = 5
group by O.CustomerID, year(O.OrderDate), month(O.OrderDate)
order by count(O.OrderID)

-- 
select O.CustomerID, year(O.OrderDate) as YearOrder, month(O.OrderDate) as MonthOrders ,count(O.OrderID) as TotalOrders
from Orders as O
where  year(O.OrderDate) = 1998 
group by O.CustomerID, year(O.OrderDate), month(O.OrderDate)
order by month(O.OrderDate)
