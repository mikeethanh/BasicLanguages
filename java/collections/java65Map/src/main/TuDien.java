package main;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TuDien {
    //Map <Key , Value>
    private Map<String, String> data = new TreeMap<String,String> (); 

    public String add(String key, String value) {
        return this.data.put(key, value);
    }

    public String remove(String key) {
        //nếu từ khoá mất đi thì value cx mất di
        return this.data.remove(key);
    }

    public String getWord(String key) {
        //dung ham get co the lay ra duoc value 
        String yNghia = this.data.get(key);
        return yNghia ;
    }

    public void print() {
        //ham keySet giup lay tat ca cac key ra 
        //goi interface Set
        Set<String> words = this.data.keySet();
        //chuyen doi cau truc du lieu cua words thanh mang 
        // chuyen doi mang thanh chuoi 
        System.out.println(Arrays.toString(words.toArray()));
    }

    public int sizeDic() {
        return this.data.size();
    }

    public void remove() {
        this.data.clear();
    }

    public static void main(String[] args) {
		TuDien tuDien = new TuDien();
		int luaChon =0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("---------------");
			System.out.println("MENU ");
			System.out.println("Tra từ điển Anh - Việt:\n"
					+ "1. Thêm từ (Từ khóa, Ý nghĩa)\n"
					+ "2. Xóa từ\n"
					+ "3. Tìm ý nghĩa của từ khóa ⇒ Tra từ\n"
					+ "4. In ra danh sách từ khóa\n"
					+ "5. Lấy số lượng từ\n"
					+ "6. Xóa tất cả các từ khóa\n"
					+ "0. Thoát khỏi chương trình\n"
					+ "");
			luaChon = sc.nextInt(); sc.nextLine();
			if(luaChon==1) {
				System.out.println("Nhập vào từ khóa: ");
				String tuKhoa = sc.nextLine();
				System.out.println("Nhập vào ý nghĩa: ");
				String yNghia = sc.nextLine();
				tuDien.add(tuKhoa, yNghia);
			}else if(luaChon==2 || luaChon==3) {
				System.out.println("Nhập vào từ khóa: ");
				String tuKhoa = sc.nextLine();
				if(luaChon==2) {
					tuDien.remove(tuKhoa);
				}else {
					System.out.println("Ý nghĩa là: "+ tuDien.getWord(tuKhoa));
				}
			}else if(luaChon==4) {
				tuDien.print();
			}else if(luaChon==5) {
				System.out.println("Số lượng từ khóa là: "+tuDien.sizeDic());
			}else if(luaChon==6) {
				tuDien.remove();
			}
		}while(luaChon!=0);
	}
}
