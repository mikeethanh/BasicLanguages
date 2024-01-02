package java.String.java49String.code;
import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Nhập vào chuỗi: ");
		s = sc.nextLine();
		System.out.println("------");

		// Hàm length() => lấy độ dài chuỗi
		System.out.println(s.length());
		int doDai = s.length();        

		// Hàm charAt(vi tri) => lấy ra 1 ký tự tại vị trí
		System.out.println(s.charAt(4));
        
        //Ham getChars(vi tri bat dau , vi tri ket thuc , mang luu tru di lieu , vi tri bat dau cua mang ma minh muon luu )
        char[] arrayChar = new char[50];
        s.getChars(2, 4, arrayChar, 0);
        for (int i = 0 ; i < arrayChar.length;i++) {
            System.out.println("Char" + 1 +" is : "+arrayChar[i]);
        }
        //GetByte
		byte[] arrayBytes = s.getBytes();
		for (byte b : arrayBytes) {
			System.out.println(b);
        }
    }
}
