-- tao ot store procedure cho biet thong tin ve san pham dua tren ten cua san pham
CREATE PROCEDURE GetProductByName
	@ProductName NVARCHAR(100)
AS
BEGIN
	SELECT * FROM [dbo].[Products] P
	WHERE P.ProductName = @ProductName
END;

-- Su dung:
EXEC GetProductByName @ProductName='Chai';
EXEC GetProductByName @ProductName='Chang';
EXEC GetProductByName @ProductName='Ikura';

-- Tao mot stored procedure de tính tong doanh so bán hàng
-- cua mot nhân viên dua trên EmployeeID.
CREATE PROCEDURE GetEmployeeSalesTotal
	@EmployeeId INT
AS
BEGIN
	SELECT SUM([UnitPrice]*[Quantity]) TotalSales
	FROM [dbo].[Orders] o
	JOIN [dbo].[Order Details] od ON o.OrderID = od.OrderID
	WHERE o.EmployeeID=@EmployeeId
END

-- S? d?ng
EXEC GetEmployeeSalesTotal @EmployeeId=1;
EXEC GetEmployeeSalesTotal @EmployeeId=2;
EXEC GetEmployeeSalesTotal @EmployeeId=3;

-- Tao mot stored procedure de thêm moi khách hàng vào bang Customers.
CREATE PROCEDURE AddCustomer
	@CustomerID NVARCHAR(5),
	@CompanyName NVARCHAR(40),
	@ContactName NVARCHAR(30),
	@ContactTitle NVARCHAR(30)
AS
BEGIN
	INSERT INTO [dbo].[Customers]([CustomerID],[CompanyName],[ContactName],[ContactTitle])
	VALUES (@CustomerID, UPPER(@CompanyName), @ContactName, @ContactTitle)
END

EXEC AddCustomer @CustomerID='NEWN', @CompanyName='titv.vn', @ContactName='Tung Le',@ContactTitle='Mr.' 


-- Tao mot stored procedure e cap nhat giá cua tat
-- cho mot san pham cu the
CREATE PROCEDURE IncreasePrice
	@ProductId INT,
	@PriceIncrease DECIMAL(10,2)
AS
BEGIN
	UPDATE [dbo].[Products]
	SET UnitPrice = UnitPrice + @PriceIncrease
	WHERE [ProductID] = @ProductId
END

EXEC IncreasePrice @ProductId=1, @PriceIncrease=100;

--tra cuu danh sach cac on hang dua tren ten khach hang 
create procedure OrdersOfCustomer
	@CustomerID nchar(5)
as 
begin 
	select O.CustomerID, O.OrderID
	from Orders as O
	where O.CustomerID = @CustomerID
end

exec OrdersOfCustomer @CustomerID = 'anatr'

-- Cap nhap so luong ton kho cho 1 san pham 
create procedure updateUnitsInStock
	@ProductID int,
	@Quantity smallint
as
begin 
	update Products 
	set UnitsInStock = @Quantity
	where ProductID = @ProductID
end

exec updateUnitsInStock @ProductID = 1, @Quantity = 20

--so luong san pham thuoc 1 danh muc cu the va gioi han so luong tra ve
create procedure ProductFollowCategory
	@CategoryID int,
	@numberOfRow int
as
begin
	select top (@numberOfRow) P.ProductID, P.CategoryID 
	from Products as P
	where P.CategoryID = @CategoryID
end

exec ProductFollowCategory @CategoryID = 2, @numberOfRow = 100