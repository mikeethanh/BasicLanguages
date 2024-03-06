-- <> not equal == !=
 
 select E.FirstName, E.LastName, E.City
 from Employees as E
 where E.City = 'London'

 select O.OrderID, O.RequiredDate , O.ShippedDate
 from Orders as O
 where O.RequiredDate < O.ShippedDate

 select OD.OrderID , OD.ProductID , OD.Discount
 from [Order Details] as OD
 where OD.Discount > 0.1
 order by OD.Discount