package main;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
	public static void main(String[] args) {
		Queue<String> danhSachSV = new LinkedList<String>();
		
		danhSachSV.offer("TITV 1");
		danhSachSV.offer("Nguyen Van A");
		danhSachSV.offer("Nguyen Van B");
		danhSachSV.offer("TITV 2");
		
		while(true) {
			//poll la lay ra va xoa 
			String ten = danhSachSV.poll();  // peek=> lấy ra và xóa
			if(ten==null) {
				break;
			}
			//peek => lấy ra nhưng không xóa.
			System.out.println(ten);
		}
		
	}

}
