-- Các DEFAULThạn chế được sử dụng để đặt một giá trị mặc định cho 
-- một cột.
-- Giá trị mặc định sẽ được thêm vào tất cả các bản ghi mới, nếu 
-- không có giá trị nào khác được chỉ định.

CREATE TABLE Persons (
 ID int NOT NULL,
 LastName varchar(255) NOT NULL,
 FirstName varchar(255),
 Age int,
 City varchar(255) DEFAULT 'Sandnes'
);

INSERT INTO demo.persons (ID, LastName, FirstName, Age)
VALUES ('1', 'Tom B', 'Stavanger', '20');
--  Thiếu cột city nhưng city sẽ mặc định để là sadnes

-- Để tạo DEFAULTràng buộc trên cột "Thành phố" khi bảng đã được 
-- tạo, hãy sử dụng SQL sau:
-- MySQL:
ALTER TABLE Persons
ALTER City SET DEFAULT 'Sandnes';

-- Để loại bỏ một DEFAULTràng buộc, hãy sử dụng SQL sau:
-- MySQL:
ALTER TABLE Persons
ALTER City DROP DEFAULT;