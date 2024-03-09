-- tuong tu nhu OR , cho phep check voi nhieu gia tri cung luc 

-- don hang duoc giai den cac quoc gia 
select O.ShipCountry
from Orders as O 
where O.ShipCountry in ('germany','uk','brazil')

-- don hang 0 duoc giao den cac quoc gia 
select O.ShipCountry
from Orders as O 
where O.ShipCountry not in ('germany','uk','brazil')

-- cac nhan vien khong phai la nu 
select E.TitleOfCourtesy
from Employees as E
where E.TitleOfCourtesy not in ('mrs.','ms.')