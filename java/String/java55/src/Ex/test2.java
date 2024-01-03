package Ex;

import java.util.Arrays;

public class test2 {
	public static void main(String[] args) {
		student sv1 =new student(150, "Tran Van Thanh", "Lop 1", 9);
		student sv2 =new student(100, "Nguyen Thi Thanh Hoa", "Lop 2", 8);
		student sv3 =new student(199, "Nguyen Van An", "Lop 2", 8);
		student sv4 =new student(199, "Nguyen Van Binh", "Lop 2", 8);
		// mang luu cac phan tu la cac object
		student[] a_sv = new student[]{sv1, sv2, sv3};
		
		System.out.println("Ban đầu: "+Arrays.toString(a_sv));
		
		// Hàm sắp xếp
		Arrays.sort(a_sv);
		System.out.println("Sau khi sắp xếp: "+Arrays.toString(a_sv));
		
		
		// Tìm kiếm
		System.out.println("Tìm kiếm An: "+ Arrays.binarySearch(a_sv, sv1));
		System.out.println("Tìm kiếm Binh: "+ Arrays.binarySearch(a_sv, sv4));
	}
}
