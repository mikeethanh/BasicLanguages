-- SELECT * FROM databasename.customers;

-- Câu SELECTlệnh được sử dụng để chọn dữ liệu từ cơ sở dữ 
-- liệu.
-- Dữ liệu trả về được lưu trữ trong một bảng kết quả, được 
-- gọi là tập kết quả.

SELECT CustomerName, City, Country FROM Customers

SELECT Country FROM Customers

-- Câu SELECT DISTINCTlệnh chỉ được sử dụng để trả về các 
-- giá trị riêng biệt (khác nhau).
-- Bên trong một bảng, một cột thường chứa nhiều giá trị 
-- trùng lặp; và đôi khi bạn chỉ muốn liệt kê các giá trị khác 
-- nhau (riêng biệt)
SELECT DISTINCT Country FROM Customers;

SELECT COUNT(DISTINCT Country) FROM Customers;

SELECT COUNT(Country) FROM Customers;

-- Các WHEREkhoản được sử dụng để ghi chép lọc.
-- Nó chỉ được sử dụng để trích xuất những bản ghi đáp ứng 
-- một điều kiện cụ thể.
SELECT * FROM Customers
WHERE Country = 'Mexico';

SELECT * FROM Customers
WHERE CustomerID >= 1;

SELECT * FROM Customers
WHERE Country = 'Germany' AND City = 'Berlin';

SELECT * FROM Customers
WHERE City = 'Berlin' OR City = 'Stuttgart';

SELECT * FROM Customers
WHERE NOT Country = 'Germany';


SELECT * FROM Customers
WHERE Country = 'Germany' AND (City 
= 'Berlin' OR City = 'Stuttgart');

--Các ORDER BYtừ khóa được sử dụng để sắp xếp các kết 
-- quả-set trong tăng dần hoặc giảm dần.
-- Các ORDER BYtừ khóa sắp xếp các bản ghi trong thứ tự 
-- tăng dần theo mặc định. Để sắp xếp các bản ghi theo thứ 
-- tự giảm dần, hãy sử dụng DESCtừ khóa.
SELECT * FROM Customers
ORDER BY Country;

SELECT * FROM Customers
ORDER BY Country, CustomerName;

SELECT * FROM Customers
ORDER BY Country DESC;

SELECT * FROM Customers
ORDER BY Country ASC, CustomerName DESC

insert into customers 
(`CustomerID`,`CustomerName`,`ContactName`,`Address`,`City`,`Postal
Code`,`Country`) 
 values (20,'Ernst Handel','Roland Mendel','Kirchgasse 
6','Graz','8010','Austria') ;

SELECT CustomerName, ContactName, Address
FROM Customers
WHERE Address IS NULL;

SELECT CustomerName, ContactName, Address
FROM Customers
WHERE Address IS NOT NULL;

-- Câu UPDATElệnh được sử dụng để sửa đổi các bản ghi hiện 
--có trong một bảng.

UPDATE Customers
SET ContactName = 'Alfred Schmidt', City = 'Frankfurt'
WHERE CustomerID = 1;

UPDATE Customers
SET PostalCode = 00000
WHERE Country = 'Mexico';

UPDATE Customers
SET PostalCode = 00000;

DELETE FROM Customers WHERE CustomerName='Alfreds 
Futterkiste';
DELETE FROM Customers; -- xóa bản

SELECT * FROM Customers
LIMIT 3;-- hay LIMIT 0,3;

SELECT * FROM Customers
LIMIT 4,3;-- 3 cái bắt đầu từ cái thứ 

