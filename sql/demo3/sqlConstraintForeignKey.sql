-- Các FOREIGN KEYhạn chế được sử dụng để ngăn chặn những hành 
-- động đó sẽ phá hủy các liên kết giữa các bảng.
-- A FOREIGN KEYlà một trường (hoặc tập hợp các trường) trong một 
-- bảng, tham chiếu đến PRIMARY KEYtrong một bảng khác.
-- Bảng có khóa ngoại được gọi là bảng con và bảng có khóa chính 
-- được gọi là bảng tham chiếu hoặc bảng cha.

CREATE TABLE databasename.Persons (
 PersonID int NOT NULL,
 LastName varchar(255) NOT NULL,
 FirstName varchar(255),
 Age int,
 PRIMARY KEY (PersonID)
 );


CREATE TABLE Orders (
 OrderID int NOT NULL,
 OrderNumber int NOT NULL,
 PersonID int,
 PRIMARY KEY (OrderID),
 FOREIGN KEY (PersonID) REFERENCES Persons(PersonID)
);

-- Cách thêm FK
SELECT * FROM databasename.orders;
-- ALTER TABLE Orders
-- ADD FOREIGN KEY (PersonID) REFERENCES Persons(PersonID);
