select P.*
from Products as P
where P.UnitPrice between 10 and 20

select O.*
from Orders as O
where O.OrderDate between '1996-07-01' and '1996-07-31'

select sum(O.Freight) as TotalFreight
from Orders as O
where O.OrderDate between '1996-07-01' and '1996-07-31'