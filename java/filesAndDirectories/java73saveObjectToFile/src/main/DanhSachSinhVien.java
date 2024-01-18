package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.print.Doc;

//ArrayList trong Java là một lớp triển khai của interface List trong Java Collection Framework. 
//Nó cung cấp một mảng động (dynamic array), có thể mở rộng kích thước một cách tự động khi có thêm 
//phần tử được thêm vào, và có thể chứa các phần tử trùng lặp.

//ArrayList duy trì thứ tự của các phần tử mà bạn thêm vào. Các phần tử được thêm vào sau sẽ ở vị trí cuối cùng của danh sách.
//ArrayList cho phép bạn thêm các phần tử có giá trị giống nhau vào danh sách.
public class DanhSachSinhVien {
		// 1 danh sach sinh vien duoc quan ly bangg ArrayList
		// cac phan tu trong arraylist la object thuoc class SinhVien
		private ArrayList<SinhVien> danhSach;
		
		//constructor
		public DanhSachSinhVien() {
			this.danhSach = new ArrayList<SinhVien>();
		}
		
		//constructor 1 tham so 
		public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
			this.danhSach = danhSach;
		}
		
		//method
		
		// 1.	Thêm sinh viên vào danh sách.
		public void themSinhVien(SinhVien sv) {
			this.danhSach.add(sv);
		}
		
//		2.	In danh sách sinh viên ra màn hình.
		public void inDanhSachSinhVien() {
			//lap tung sinhVien trong class danhSach luu tru bang arraylist
			for (SinhVien sinhVien : danhSach) {
				//goi den ham toString
				System.out.println(sinhVien);
			}
		}
		
//		3.	Kiểm tra danh sách có rỗng hay không.
		public boolean kiemTraDanhSachRong() {
			//su dung ham isEmpty() co san trong arrayList
			
			// this la tro den object duoc tao thuoc class
			// danhSach la chi den collection arrayList duoc dat ten la danhSach
			return this.danhSach.isEmpty();
		}
		
//		4.	Lấy ra số lượng sinh viên trong danh sách.
		public int laySoLuongSinhVien() {
			return this.danhSach.size();
		}
		
//		5.	Làm rỗng danh sách sinh viên.
		public void lamRongDanhSach() {
			this.danhSach.removeAll(danhSach);
		}
		
//		6.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.
		public boolean kiemTraTonTai(SinhVien sv) {
			//dung ham constains check xem 1 sv co ton tai trong danhsach hay k 
			return this.danhSach.contains(sv);
		}
		
//		7.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.
		public boolean xoaSinhVien(SinhVien sv) {
			return this.danhSach.remove(sv);
		}
		
//		8.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.
		public void timSinhVien(String ten) {
			//for each
			for (SinhVien sinhVien : danhSach) {
				//lay ra ho ra ten cua 1 object sinh vien 
				//sau do lay ra index of ten cua sinh vien do
				if(sinhVien.getHoVaTen().indexOf(ten)>=0) {
					System.out.println(sinhVien);
				}
			}
		}
//		9.	Xuất ra danh sách sinh viên có điểm từ cao đến thấp.
		public void sapXepSinhVienGiamDanTheoDiem() {
			//truyen vao 1 comparator , 1 interface trongg java
			Collections.sort(this.danhSach, new Comparator<SinhVien>() {
				//ghi de phuong thuc compare trong interface Comparator
				@Override
				public int compare(SinhVien sv1, SinhVien sv2) {
					if(sv1.getDiemTrungBinh()<sv2.getDiemTrungBinh()) {
						return 1;
					}else if(sv1.getDiemTrungBinh()>sv2.getDiemTrungBinh()) {
						return -1;
					}else {
						return 0;
					}
				}
			});
		}
		
		//10. Ghi xuong file
		public void ghiDuLieuXuongFile(File file) {
			try {
				OutputStream os = new FileOutputStream(file);
				ObjectOutputStream oos =new ObjectOutputStream(os);
				
				for (SinhVien sinhVien : danhSach) {
					oos.writeObject(sinhVien);
				}
				
				oos.flush();
				oos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}

		//11. Doc tu file
		public void docDuLieuTuFile(File f) {
			try {
				InputStream is = new FileInputStream(f);
				ObjectInputStream ois =new ObjectInputStream(is);
				SinhVien sv = null;
				while(true) {
					Object oj = ois.readObject();
					if(oj==null) {
						break;
					}
					if(oj!=null) {
						sv = (SinhVien) oj;
						this.danhSach.add(sv);
					}
				}
				ois.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}