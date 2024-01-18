
package main;

import java.io.BufferedReader;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Ex {
	public static void main(String[] args) {
		/* Cach 1 */
		File f = new File("E:\\BasicLanguages\\java\\filesAndDirectories\\java72\\file.txt");
		try {
			BufferedReader br = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8); // BufferedReader: Là một lớp trong Java được sử dụng để đọc dữ liệu văn bản từ một nguồn đầu vào, như tệp tin.
			String line = null;                                                              //Đối tượng StandardCharsets.UTF_8 định nghĩa mã hóa ký tự UTF-8, được sử dụng để đọc và ghi các ký tự Unicode từ và vào tệp tin
			while(true) {
				line = br.readLine();
				if(line==null) {
					break;
				}else {
					System.out.println(line);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/* Cach 2 */
		File f2 = new File("E:\\BasicLanguages\\java\\filesAndDirectories\\java72\\file.txt");
		try {
			//List là một interface thuộc gói java.util được sử dụng để lưu trữ một tập hợp các phần tử theo thứ tự
			List<String> allText = Files.readAllLines(f2.toPath(), StandardCharsets.UTF_8);
			for (String line : allText) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}