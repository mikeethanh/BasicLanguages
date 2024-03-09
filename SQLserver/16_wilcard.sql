-- wilcard: ky tu dai dien 
-- % : 1 or nhieu ki tu 
-- _  :1 ky tu 
-- [] : h[oa]t finds hot or hat 
-- ^ : h[^oa] hit, but not hot or hat 
-- - : c[a-b]t cat or cbt: dai tien cho nhung ki tu tu a -> b


-- ten lien he bat dau bang chu A  
select C.* 
from Customers as C
where C.ContactName like 'A%'

-- ten lien he bat au bang chu A va co 1 ki tu bat ki dang sau chu A\
select C.* 
from Customers as C
where C.ContactName like 'A_%'


-- don hang uoc gui den thanh pho bat dau bang L , va sau do laf u or o
select O.*
from Orders as O
where O.ShipCity like 'L[uo]%'

-- nguoc lai cau tren 
select O.*
from Orders as O
where O.ShipCity like 'L[^uo]%'