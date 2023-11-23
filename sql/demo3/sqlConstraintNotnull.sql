-- SELECT * FROM databasename.persons;

-- truncate table databasename.persons

-- insert into databasename.persons (PersonID,LastName,FirstName,Address,City) 
-- values ('1','Erichens','Staven','Lon Don','England')

-- SELECT * FROM databasename.persons;

alter table databasename.persons
modify PersonID int NOT NULL

-- Các NOT NULLhạn chế thực thi một cột để không chấp nhận giá trị 
-- NULL.
-- Điều này bắt buộc trường luôn chứa giá trị, có nghĩa là bạn không 
-- thể chèn bản ghi mới hoặc cập nhật bản ghi mà không thêm giá trị 
-- vào trường này