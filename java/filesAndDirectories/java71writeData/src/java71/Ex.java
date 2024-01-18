import java.io.PrintWriter;

public class Ex {
	public static void main(String[] args) {
		// vi viec ghi du lieu khong phai luc nao cx ghi duoc nen phai cho vao try catch 
		try {
			// tạo ra 1 object thuộc lớp PrintWriter bằng con trỏ đối tượng

			// tự tạo ra file 
			//PrintWriter: Chủ yếu được sử dụng cho việc ghi dữ liệu văn bản, in định dạng, và có nhiều phương thức hữu ích cho việc làm việc với dữ liệu văn bản.
			PrintWriter pw = new PrintWriter("E:\\BasicLanguages\\java\\filesAndDirectories\\java71\\file.txt", "UTF-8");
			// in r xuong dong 
			pw.println("Xin chào, mình là TITV");
			// in nhung khong xuong dong 
			pw.print("Dữ liệu: ");
			pw.print(3.14);
			pw.print(' ');
			pw.print(" là số PI");
			pw.println();
			pw.println();
			//đẩy (flush) bất kỳ dữ liệu đang lưu trong bộ đệm của PrintWriter ra đích (thường là một luồng hoặc một tập tin)
			pw.flush();
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}