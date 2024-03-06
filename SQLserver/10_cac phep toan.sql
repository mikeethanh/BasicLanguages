 -- +,-,*,/,%

 --  tinh so luong hang con lai trong kho 
 -- stockRemaining = UnitsInStock - UnitsInOrders

 select P.ProductID, P.ProductName, (P.UnitsInStock - P.UnitsOnOrder) as StockRemaining
 from Products as P