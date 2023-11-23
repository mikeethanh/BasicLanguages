-- Các CHECKhạn chế được sử dụng để giới hạn phạm vi giá trị có thể 
-- được đặt trong một cột.
-- Nếu bạn xác định một CHECKràng buộc trên một cột, nó sẽ chỉ cho 
-- phép một số giá trị nhất định cho cột này.
-- Nếu bạn xác định một CHECKràng buộc trên một bảng, nó có thể giới 
-- hạn các giá trị trong các cột nhất định dựa trên các giá trị trong các 
-- cột khác trong hàng

CREATE TABLE demo.Persons (
 ID int NOT NULL,
 LastName varchar(255) NOT NULL,
 FirstName varchar(255),
 Age int,
 CHECK (Age>=18)
);
SELECT * FROM demo.persons;
INSERT INTO demo.persons (ID, LastName, FirstName, Age)
VALUES ('1', 'Tom B', 'Stavanger', '20'); 
--  Được add
INSERT INTO demo.persons (ID, LastName, FirstName, Age)
VALUES ('1', 'Tom B', 'Stavanger', '10');
--  Lỗi
