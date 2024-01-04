package main;

import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue {
	public static void main(String[] args) {
		Queue<String> danhSachSV = new PriorityQueue<String>();
		
		danhSachSV.offer("TITV 1");
		danhSachSV.offer("Nguyen Van B");
		danhSachSV.offer("Nguyen Van A");
		danhSachSV.offer("TITV 2");
		
		while(true) {
			String ten = danhSachSV.poll();  // => lấy ra và xóa
			if(ten==null) {
				break;
			}
			//peek => lấy ra nhưng không xóa.
			System.out.println(ten);
		}
	}
}
