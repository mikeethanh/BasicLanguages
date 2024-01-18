package main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Ex {
	public static void main(String[] args) {
		try {
			File file = new File("E:\\BasicLanguages\\java\\filesAndDirectories\\java73\\test.java");
			//Trong Java, OutputStream là một abstract class trong gói java.io thuộc Java I/O (Input/Output) API. 
			//OutputStream cung cấp một cơ sở chung cho các lớp con để thực hiện ghi dữ liệu xuống các nguồn xuất (output sources), 
			//như tệp tin, mảng byte, luồng (stream), hoặc các nguồn xuất khác.

			//FileOutputStream(file): Tạo một đối tượng FileOutputStream với tham số là một đối tượng File được truyền vào (biến file). 
			//FileOutputStream là một lớp trong Java I/O được sử dụng để tạo một luồng đầu ra để ghi dữ liệu vào tệp tin.
			OutputStream os = new FileOutputStream(file);
			ObjectOutputStream oos =new ObjectOutputStream(os);
			
			SinhVien st = new SinhVien("001", "TITV", 2000, 10);
			oos.writeObject(st);
			
			//đọc object tù file
			InputStream is = new FileInputStream(file);
			ObjectInputStream ois =new ObjectInputStream(is);
			
			SinhVien st = (SinhVien) ois.readObject();

			
			System.out.println(st.getDiemTrungBinh());
			System.out.println(st);
			ois.close();


			//oos.flush(); là một lệnh trong Java I/O (Input/Output) được sử dụng để đẩy tất cả dữ liệu đã được lưu trong bộ đệm (buffer) 
			//của ObjectOutputStream xuống luồng đầu ra mà nó đang quản lý. Điều này đảm bảo rằng mọi dữ liệu đã được ghi sẽ được đưa xuống
			// nguồn dữ liệu thực tế (ví dụ: tệp tin) và không còn nằm trong bộ đệm nữa.
			oos.flush();
			oos.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
}