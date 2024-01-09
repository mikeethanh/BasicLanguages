package main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
//Trong Java, Set là một interface thuộc Java Collection Framework, mà cung cấp một cách lưu trữ 
//tập hợp các phần tử duy nhất, không chứa các phần tử trùng lặp. Set không bảo đảm vị trí của các 
//phần tử, không theo thứ tự cụ thể như danh sách (List).

//Java cung cấp một số lớp triển khai cho Set như HashSet, TreeSet, LinkedHashSet. Mỗi lớp 
//này sử dụng một cách thức khác nhau để lưu trữ và quản lý dữ liệu.


//HashSet trong Java là một lớp triển khai của interface Set trong Java Collection Framework. 
//Nó sử dụng cấu trúc dữ liệu bảng băm (hash table) để lưu trữ các phần tử một cách không theo 
//thứ tự và đảm bảo rằng mọi phần tử là duy nhất

//Bảng băm (Hash Table):

//HashSet sử dụng cấu trúc dữ liệu bảng băm để lưu trữ các phần tử.
//Bảng băm là một mảng của các danh sách liên kết (hoặc các bucket), trong đó mỗi phần tử được lưu trữ ở một vị trí được tính toán dựa trên giá trị của hàm băm của nó.
//Hàm Băm (Hash Function):

//Mỗi phần tử được thêm vào HashSet được ánh xạ đến một vị trí cụ thể trong bảng băm bằng một hàm băm (hash function).
//Hàm băm đảm bảo rằng các phần tử được phân bố rải rác trong bảng băm, giúp tối ưu hiệu suất khi thực hiện thao tác thêm, xóa và tìm kiếm.
//Không cho phép các phần tử trùng lặp:

//HashSet không chứa các phần tử trùng lặp. Nếu bạn cố thêm một phần tử đã tồn tại trong HashSet, nó sẽ bị bỏ qua và không có thay đổi nào xảy ra.
//Không theo thứ tự cụ thể:

//HashSet không bảo đảm về thứ tự của các phần tử. Khi bạn duyệt qua một HashSet, không có đảm bảo rằng các phần tử sẽ được trả về theo một thứ tự cụ thể.

//rut tham trung thuong 
public class ExHashSet {
	//tu interface set klhoi tam 1 oi tuong thuoc lop HashSet
Set<String> thungPhieuDuThuong = new HashSet<String>();
	
	//constructor
	public ExHashSet() {
	}
	
	public boolean themPhieu(String giaTri) {
		return this.thungPhieuDuThuong.add(giaTri);
	}
	
	public boolean xoaPhieu(String giaTri) {
		return this.thungPhieuDuThuong.remove(giaTri);
	}
	
	public boolean kiemTraPhieuTonTai(String giaTri) {
		return this.thungPhieuDuThuong.contains(giaTri);
	}
	
	public void xoaTatCaPhieuDuThuong() {
		this.thungPhieuDuThuong.clear();
	}
	
	public int laySoLuong() {
		return this.thungPhieuDuThuong.size();
	}
	
	public String rutMotPhieu() {
		String ketQua = "";
		Random rd = new Random();
		int viTri = rd.nextInt(this.thungPhieuDuThuong.size());
		ketQua = (String) this.thungPhieuDuThuong.toArray()[viTri];
		return ketQua;
	}
	
	public void inTatCa() {
		System.out.println(Arrays.toString(this.thungPhieuDuThuong.toArray()));
	}

	public static void main(String[] args) {
		int luaChon = 0;
		Scanner sc = new Scanner(System.in);
		ExHashSet rt = new ExHashSet();
		do {
			System.out.println("--------------------------------------");
			System.out.println("MENU: ");
			System.out.println("1. Thêm mã số dự thưởng.");
			System.out.println("2. Xóa mã số dự thưởng.");
			System.out.println("3. Kiểm tra mã số dự thưởng có tồn tại hay không?");
			System.out.println("4. Xóa tất cả các phiếu dự thưởng.");
			System.out.println("5. Số lượng phiếu dự thưởng.");
			System.out.println("6. Rút thăm trúng thưởng.");
			System.out.println("7. In ra tất cả các phiếu.");
			System.out.println("0. Thoát khỏi chương trình");
			luaChon = sc.nextInt();
			sc.nextLine();
			if(luaChon==1 || luaChon==2||luaChon==3) {
				System.out.println("Nhập vào mã phiếu dự thưởng: ");
				String giaTri = sc.nextLine();
				if(luaChon==1) {
					rt.themPhieu(giaTri);
				}else if(luaChon==2) {
					rt.xoaPhieu(giaTri);
				}else {
					System.out.println("Kết quả kiểm tra: "+rt.kiemTraPhieuTonTai(giaTri));
				}
			}else if(luaChon==4) {
				rt.xoaTatCaPhieuDuThuong();
			}else if(luaChon==5) {
				System.out.println("Số lượng phiếu là: "+ rt.laySoLuong());
			}else if(luaChon==6) {
				System.out.println("Mã số trúng thưởng là: "+ rt.rutMotPhieu());
			}else if(luaChon==7) {
				System.out.println("Các mã phiếu dự thưởng là: ");
				rt.inTatCa();
			}
		}while(luaChon!=0);
	}
}
