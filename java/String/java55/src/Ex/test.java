package Ex;

import java.util.Arrays;
public class test {
	public static int[] reverse(int[] x) {
		//copy mang 
		int[] rs = new int[x.length];
		int index=0;
		for(int i=x.length-1; i>=0; i--) {
			rs[index]=x[i];
			index++;
		}
		return rs;
	}
	
	public static void main(String[] args) {
		int[] a = new int[] { 1, 8, 2, 6, 4, 3, 7, 9 };
		int[] b = new int[15];

		// sử dụng phương thức toString
		System.out.println("a ban đầu: " + Arrays.toString(a));

		// Hàm sắp xếp tăng dần
		Arrays.sort(a);
		System.out.println("a sau khi sắp xếp: " + Arrays.toString(a));

		// Hàm tìm kiếm
		// tìm kiếm trong mảng a số 4 , -1 
		//trả về inđex
		System.out.println(Arrays.binarySearch(a, 4));
		System.out.println(Arrays.binarySearch(a, -1));

		// Hàm điền giá trị
		// dien gia tri trong mang b thanh so 5
		Arrays.fill(b, 5);
		System.out.println("b sau khi điền giá trị: " + Arrays.toString(b));

		// Hàm sắp xếp giảm dần
		Arrays.sort(a);
		a = test.reverse(a);
		System.out.println("a sau khi sắp xếp giảm dần: " + Arrays.toString(a));
	}
}
