import java.io.PrintWriter;

public class Ex {
	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter("/Users/mac/eclipse-workspace/Java_71/file.txt", "UTF-8");
			pw.println("Xin chào, mình là TITV");
			pw.print("Dữ liệu: ");
			pw.print(3.14);
			pw.print(' ');
			pw.print(" là số PI");
			pw.println();
			pw.println();
			pw.flush();
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}