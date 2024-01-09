package main;

import java.io.File;
import java.util.Scanner;

public class Ex {
	//khai báo một biến có tên là file thuộc kiểu File
	File file;

	public Ex(String tenFile) {
		this.file = new File(tenFile);
	}

	public boolean kiemTraThucThi() {
		// Kiểm tra file có thể thực thi
		return this.file.canExecute();
	}

	public boolean kiemTraDoc() {
		// Kiểm tra file có thể đọc
		return this.file.canRead();
	}

	public boolean kiemTraGhi() {
		// Kiểm tra file có thể ghi
		return this.file.canWrite();
	}

	public void inDuongDan() {
		//in ra duong dan den file 
		System.out.println(this.file.getAbsolutePath());
	}

	public void inTen() {
		//in ra ten file
		System.out.println(this.file.getName());
	}

	public void kiemTraLaThuMucHoacTapTin() {
			//ham kiem tra la thu muc 
		if (this.file.isDirectory()) {
			System.out.println("Đây là thư mục");
			//ham kiem tra la tep tin
		} else if (this.file.isFile()) {
			System.out.println("Đây là tập tin");
		}
	}

	public void inDanhSachCacFileCon() {
		//neu la thu muc thi moi in ra uoc cac file con 
		if (this.file.isDirectory()) {
			System.out.println("Các tập tin con/ thư mục con là:");
			//lay ra duoc cac ten file o trong thu muc sau do luu vao mang
			File[] mangCon = this.file.listFiles();
			for (File file : mangCon) {
				System.out.println(file.getAbsolutePath());
			}
		} else if (this.file.isFile()) {
			System.out.println("Đây là tập tin, không có dữ liệu con bên trong.");
		}
	}

	public void inCayThuMuc() {
		this.inChiTietCayThucMuc(this.file, 1);
	}

	public void inChiTietCayThucMuc(File f, int bac) {
//		System.out.print("|");
		for (int i = 0; i < bac; i++) {
			System.out.print("\t");
		}
		System.out.print("|__");
		System.out.println(f.getName());
		if (f.canRead()&&f.isDirectory()) {
			File[] mangCon = f.listFiles();
			for (File fx : mangCon) {
				inChiTietCayThucMuc(fx, bac + 1);
			}
		}
		
	}
	
	public static void main(String[] args) {
		//trong Java tạo một đối tượng Scanner để đọc dữ liệu từ luồng nhập (input stream), 
		//thường là luồng nhập từ bàn phím (System.in).
		Scanner sc = new Scanner(System.in);
		int luaChon = 0;
		System.out.println("Nhập tên file: ");
		String tenFile = sc.nextLine();
		Ex vdf = new Ex(tenFile);

		do {
			System.out.println("MENU ---------- ");
			System.out.println("1. Kiểm tra file có thể thực thi: ");
			System.out.println("2. Kiểm tra file có thể đọc: ");
			System.out.println("3. Kiểm tra file có thể ghi: ");
			System.out.println("4. In đường dẫn: ");
			System.out.println("5. In tên file: ");
			System.out.println("6. Kiểm tra file là thư mục hoặc tập tin: ");
			System.out.println("7. In ra danh sách các file con: ");
			System.out.println("8. In ra cây thư mục: ");
			System.out.println("0. Thoát chương trình.");
			luaChon = sc.nextInt();
			switch (luaChon) {
			case 1:
				System.out.println(vdf.kiemTraThucThi());
				break;
			case 2:
				System.out.println(vdf.kiemTraDoc());
				break;
			case 3:
				System.out.println(vdf.kiemTraGhi());
				break;
			case 4:
				vdf.inDuongDan();
				break;
			case 5:
				vdf.inTen();
				break;
			case 6:
				vdf.kiemTraLaThuMucHoacTapTin();
				break;
			case 7:
				vdf.inDanhSachCacFileCon();
				break;
			case 8:
				vdf.inCayThuMuc();
				break;
			default:
				break;
			}

			sc.nextLine();
		} while (luaChon != 0);
	}
}
