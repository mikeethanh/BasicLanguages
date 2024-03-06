-- gioi han so luong dong duoc tra ve khi goi cau lenh SELECT

select top 5 *
from Customers

--30%
select top 30 percent *
from Employees;

--
select distinct top 5 CustomerID
from Orders

select distinct top 3 CategoryID
from Products;