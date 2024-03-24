SELECT *
INTO Customers_1
FROM Customers;

-- Xóa đi khách hàng 'ALFKI'
DELETE FROM [dbo].[Customers_1]
WHERE [CustomerID] LIKE 'ALFKI';



SELECT DISTINCT [Country] FROM [dbo].[Customers_1];
-- Xóa đi toàn bộ khách hàng có quốc gia
-- bắt đầu bằng 'U'
DELETE FROM [dbo].[Customers_1]
WHERE [Country] LIKE 'U%';


-- Xóa sạch 1 bảng
DELETE FROM [dbo].[Customers_1];

-- Câu hỏi:
-- DELETE FROM khác gì với TRUNCATE
--DELETE và TRUNCATE: Phân biệt chi tiết
--1. Khái niệm:

--DELETE: Là lệnh DML (Data Manipulation Language) dùng để xóa một hoặc nhiều hàng (tuple) trong một bảng dựa trên điều kiện được chỉ định.
--TRUNCATE: Là lệnh DDL (Data Definition Language) dùng để xóa toàn bộ dữ liệu trong một bảng, bao gồm cả dữ liệu trong các bảng con (child tables) nếu có.
--2. Tác động:

--DELETE:
--Xóa dữ liệu theo điều kiện, có thể chỉ xóa một phần dữ liệu.
--Ghi vào transaction log, cho phép rollback (phục hồi) dữ liệu nếu cần thiết.
--Giữ nguyên cấu trúc bảng, bao gồm các khóa chính (primary key), khóa ngoại (foreign key) và các ràng buộc (constraint).
--Ảnh hưởng đến hiệu suất xử lý, đặc biệt khi xóa lượng lớn dữ liệu.
--TRUNCATE:
--Xóa toàn bộ dữ liệu trong bảng, không có điều kiện.
--Không ghi vào transaction log, không thể rollback dữ liệu sau khi thực hiện.
--Giữ nguyên cấu trúc bảng, nhưng reset lại các giá trị identity (tự tăng) và sequence (chuỗi số tự động).
--Có hiệu suất cao hơn DELETE khi xóa lượng lớn dữ liệu.