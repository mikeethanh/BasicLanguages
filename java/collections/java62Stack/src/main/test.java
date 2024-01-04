package main;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class test {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//khoi tao 1 stack kieu String
		Stack<String> stackChuoi = new Stack<String>();
		
		// stackChuoi.push("giatri") => đưa giá trị vào stack
		// stackChuoi.pop() => lấy giá trị ra, xóa khỏi stack
		// stackChuoi.peek() => lấy giá trị ra, nhưng không xóa khỏi stack
		// stackChuoi.clear(); => xóa tất cả phần tử trong stack
		// stackChuoi.contains("giatri")=> xác định giá trị có tồn tại trong stack hay không
		// stackChuoi.size() => độ lớn của stack
		
		// Ví dụ đảo ngược chuỗi
		System.out.println("Nhập vào chuỗi: ");
		String s = sc.nextLine();
		// TITV
		for(int i=0; i <s.length();i++) {
			stackChuoi.push(s.charAt(i)+"");
		}
		System.out.println("Chuoi dao nguoc");
		for(int i=0; i <s.length();i++) {
			System.out.println(stackChuoi.pop());
		}
		
		//vi du chuyen tu he than phan sanh he nhi phan
		System.out.println("Nhập 1 số nguyên dương từ bàn phím");
		int x = sc.nextInt();
		Stack<String> stackSoDu = new Stack<String>();
		while(x>0) {
			int soDu = x%2;
			System.out.println(soDu);
			stackSoDu.push(soDu+"");
			x = x/2;
		}
		System.out.println("Số nhị phân là:");
		int n = stackSoDu.size();
		for(int i=0; i<n;i++) {
			System.out.println(stackSoDu.pop());
		}
	}
}