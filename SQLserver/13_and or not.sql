select P.*
from Products as P
where P.UnitsInStock < 50 or P.UnitsInStock > 100

select O.RequiredDate, O.ShippedDate, O.ShipCity
from Orders as O
where O.ShipCity = 'Brazil' and O.RequiredDate < O.ShippedDate

select P.UnitPrice, P.CategoryID
from Products as P
where P.UnitPrice >= 100 and P.CategoryID != 1