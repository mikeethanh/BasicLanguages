--Window functions: tinh toan tren mot tap du lieu con cua bang du lieu (window), thay vi toan bo du lieu

--Xep hang san pham theo gia giam dan tren toan bo bang 
select P.ProductID, P.ProductName, P.CategoryID, P.UnitPrice,
		rank() over (order by P.UnitPrice desc) as Ranking
from Products as P

----Xep hang san pham theo gia giam dan tren the loai 
select P.ProductID, P.ProductName, P.CategoryID, P.UnitPrice,
		rank() over (partition by P.CategoryID order by P.UnitPrice desc) as Ranking
from Products as P

-- Chèn 20 dòng dữ liệu thực tế vào bảng
-- Tạo bảng "sinh_vien"
CREATE TABLE [sinh_vien] (
    [ma_sinh_vien] INT PRIMARY KEY,
    [ho_ten] NVARCHAR(255),
    [diem_trung_binh] DECIMAL(3, 2),
    [ma_lop_hoc] INT
);

-- Chèn 20 dòng dữ liệu thực tế vào bảng
INSERT INTO [sinh_vien] ([ma_sinh_vien], [ho_ten], [diem_trung_binh], [ma_lop_hoc])
VALUES
    (1, N'Nguyễn Văn A', 3.75, 101),
    (2, N'Trần Thị B', 3.88, 102),
    (3, N'Phạm Văn C', 3.75, 101),
    (4, N'Huỳnh Thị D', 3.92, 103),
    (5, N'Lê Văn E', 3.60, 102),
    (6, N'Ngô Thị F', 3.78, 101),
    (7, N'Trịnh Văn G', 3.65, 102),
    (8, N'Võ Thị H', 3.80, 103),
    (9, N'Đặng Văn I', 3.55, 101),
    (10, N'Hoàng Thị K', 3.95, 102),
    (11, N'Mai Thị L', 3.70, 103),
    (12, N'Lý Thị M', 3.62, 101),
    (13, N'Chu Thị N', 3.85, 102),
    (14, N'Đỗ Thị P', 3.58, 103),
    (15, N'Dương Văn Q', 3.72, 101),
    (16, N'Lâm Thị R', 3.85, 102),
    (17, N'Nguyễn Văn S', 3.68, 101),
    (18, N'Nguyễn Thị T', 3.75, 103),
    (19, N'Nguyễn Văn U', 3.93, 102),
    (20, N'Nguyễn Thị V', 3.67, 101);


-- xep hang sinh vien toan truong dua tren diem so giam dan 
select sv.ho_ten, sv.diem_trung_binh,
		rank() over (order by sv.diem_trung_binh desc) as ranking
from sinh_vien as sv

-- xep hang sinh vien theo tung lon hoc dua tren diem so giam dan 
select sv.ho_ten, sv.diem_trung_binh, sv.ma_lop_hoc,
		rank() over (partition by sv.ma_lop_hoc order by sv.diem_trung_binh desc) as ranking
from sinh_vien as sv

-- xep hang sinh vien theo tung lon hoc dua tren diem so giam dan , khong nhay hang
select sv.ho_ten, sv.diem_trung_binh, sv.ma_lop_hoc,
		dense_rank() over (partition by sv.ma_lop_hoc order by sv.diem_trung_binh desc) as ranking
from sinh_vien as sv

-- xep hang sinh vien theo tung lon hoc dua tren diem so giam dan , khong bi trung hang
select sv.ho_ten, sv.diem_trung_binh, sv.ma_lop_hoc,
		row_number() over (partition by sv.ma_lop_hoc order by sv.diem_trung_binh desc) as ranking
from sinh_vien as sv

