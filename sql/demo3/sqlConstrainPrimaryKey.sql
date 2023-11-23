CREATE TABLE Persons (
 ID int NOT NULL,
 LastName varchar(255) NOT NULL,
 FirstName varchar(255),
 Age int,
 PRIMARY KEY (ID)
);
-- ALTER TABLE Persons
-- ADD PRIMARY KEY (Age); => lỗi


-- Để loại bỏ một PRIMARY KEYràng buộc, hãy sử dụng SQL sau:
ALTER TABLE Persons
DROP PRIMARY KEY;

-- Các PRIMARY KEYhạn chế nhận dạng duy nhất mỗi bản ghi trong một 
--bảng.
--Khóa chính phải chứa giá trị DUY NHẤT và không được chứa giá trị 
--NULL.
--Một bảng chỉ có thể có MỘT khóa chính; và trong bảng, khóa chính 
--này có thể bao gồm một hoặc nhiều cột (trường).