--View (lược đồ) là một bảng ảo được tạo ra từ một hoặc nhiều bảng khác. View không chứa dữ
--liệu thực tế, mà chỉ là một "lăng kính" để nhìn vào dữ liệu trong các bảng gốc.
CREATE VIEW MothlySales AS
SELECT 
  YEAR([OrderDate]) as "Năm",
  MONTH([OrderDate]) as "Tháng",
  COUNT([OrderID]) as "Số lượng đơn hàng"
FROM
  [dbo].[Orders]
GROUP BY YEAR([OrderDate]), MONTH([OrderDate]);

select *
from MothlySales


-- tao view tu bang khach hang va don hang 
create view CustomerOrders as 
	select O.OrderID, C.CustomerID
	from Orders as O
	join Customers as C
	on O.CustomerID = C.CustomerID