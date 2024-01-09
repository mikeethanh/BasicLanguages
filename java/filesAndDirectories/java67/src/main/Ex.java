package main;

import java.io.File;
import java.io.IOException;

public class Ex {
	public static void main(String[] args) { 
		// luu y : 
		 // ms Windows: \ => \\ 
		
		File folder1 = new File("/Users/mac/eclipse-workspace/Java_67");
		File folder2 = new File("E:\\BasicLanguages\\java\\collections\\java61ArrayList\\src\\main");
		//check xem co ton tai folder hay khong (exists() ) tra ve true or false
		System.out.println("Kiểm tra folder1 có tồn tại hay không: "+ folder1.exists());
		System.out.println("Kiểm tra folder2 có tồn tại hay không: "+ folder2.exists());
		
		// Tạo thư mục
		// Phương thức mkdir() => Tạo 1 thư mục
		File d1 = new File("E:\\BasicLanguages\\java\\filesAndDirectories\\java67\\Directory_1");
		//tao ra thu muc Directory_1
		d1.mkdir();
		
		// Phương thức mkdirs() => Tạo nhiều thư mục cùng lúc
		File d2 = new File("E:\\BasicLanguages\\java\\filesAndDirectories\\java67\\Directory_1\\Directory_2\\Directory_3\\Directory_4");
		//tao ra hang loat thu muc khac nhau 
		d2.mkdirs();
		
		// Tạo tập tin (có phần mở rộng: .exe, .txt, .doc, .xls .....)
		File file1 = new File("E:\\BasicLanguages\\java\\filesAndDirectories\\java67\\Directory_1\\ViDu1.txt");
		File file2 = new File("E:\\BasicLanguages\\java\\filesAndDirectories\\java67\\Directory_1\\ViDu2.txt");
		try {
			//tao ra 1 file
			file1.createNewFile();
			file2.createNewFile();
		} catch (IOException e) {
			// Không có quyền tạo tập tin
			// Ổ cứng bị đầy
			// Đường dẫn sai
			e.printStackTrace();
		}
	}
}
