-- viet cau lenh sql lay ra ten cac san pham 
select [UnitPrice]
from [dbo].[Products];

select [ProductName], [UnitPrice], [QuantityPerUnit]
from [dbo].[Products];

--c1
select [ContactName], [Country]
from [dbo].[Customers]
--c2
select ContactName, Country
from dbo.Customers;


select *
from [dbo].[EmployeeTerritories];