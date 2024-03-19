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
	where ProductName = ''
)

--c2: su dung sub query + join

