-- Truy van de quy 

--fibo
with fibo (prev_n,n) as (
	--init 
	select 
		0 as prev_n,
		1 as n 
	union all
	-- recursive
	select 
		n as prev_n,
		prev_n +  n as n 
	from fibo
	 
)
select *
from fibo
option (MAXRECURSION 5)
--0 1 1 2 3 5 8 ...

-- su dung truy van de quy dde tao mot cay cau truc quan ly cua nhan vien trong bang 
-- 'Employees' trong do "ReportTo" cho la ma cua nguoi quan ly

declare @EmployeeID int
set @EmployeeID = 2 ; 

with e_cte as (
	--init
	select e.EmployeeID, (e.FirstName + ' ' + e.LastName) as Name
	,e.ReportsTo as managerID,0 as Level
	from Employees as e
	where e.EmployeeID = @EmployeeID

	union all
	select  e1.EmployeeID, (e1.FirstName + ' ' + e1.LastName) as Name
	,e1.ReportsTo as managerID,Level + 1 as Level
	from Employees as e1
	join e_cte on e1.ReportsTo = e_cte.EmployeeID
	--recursive
)

select * 
from e_cte
option (maxrecursion 5)