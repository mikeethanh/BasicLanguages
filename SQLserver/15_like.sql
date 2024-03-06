-- % : dang sau chu A co 0 , 1 hoac nhieu cu tu deu okla
select C.*
from Customers as C
where C.Country like 'A%'

select O.*
from Orders as O
where O.ShipCity like '%a%'

-- _ : chi 1 ki tu dang sau hoac dang truoc ki tu can tim
select O.*
from Orders as O
where O.ShipCountry like 'u_'

select O.*
from Orders as O
where O.ShipCountry like 'u%'
