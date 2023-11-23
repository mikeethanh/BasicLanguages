CREATE TABLE Persons (
HUY INIT Page 3
 ID int NOT NULL,
 LastName varchar(255) NOT NULL,
 FirstName varchar(255),
 Age int,
 UNIQUE (ID)
);
SELECT * FROM databasename.persons;
-- Để tạo UNIQUEràng buộc trên cột "Age" khi bảng đã được tạo, hãy sử dụng SQL 
sau:
ALTER TABLE Persons
ADD UNIQUE (Age);
-- Để loại bỏ một UNIQUE ràng buộc, hãy sử dụng SQL sau:
ALTER TABLE Persons
DROP INDEX Age;


-- Các UNIQUEhạn chế để đảm bảo rằng tất cả các giá trị trong một cột 
--là khác nhau.
--Cả ràng buộc UNIQUEvà PRIMARY KEYràng buộc đều đảm bảo tính duy 
--nhất cho một cột hoặc tập hợp các cột.
--Một PRIMARY KEYràng buộc tự động có một UNIQUEràng buộc.
--Tuy nhiên, bạn có thể có nhiều UNIQUEràng buộc trên mỗi bảng, 
-- nhưng chỉ có một PRIMARY KEYràng buộc cho mỗi bảng.
