package Ex;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        // Chuỗi ban đầu
        String s ="Xin chào các bạn, tui là Peter!";

        // Tách chuỗi s thành mảng các chuỗi con dựa trên khoảng trắng " "
        String[] a = s.split(" ");
        System.out.println(Arrays.toString(a));

        // Tách chuỗi s thành mảng các chuỗi con dựa trên dấu phẩy ","
        String[] b = s.split(",");
        System.out.println(Arrays.toString(b));

        // Tách chuỗi s2 thành mảng các chuỗi con dựa trên dấu chấm "." hoặc dấu phẩy ","
        String s2 = "Xin chào, mình là Peter. Mình là lập trình viên!";
        String[] c = s2.split("\\.|\\,");
        System.out.println(Arrays.toString(c));

        // Tách chuỗi s3 thành mảng các chuỗi con dựa trên khoảng trắng " "
        String s3 = "Nguyen Van A";
        String[] d= s3.split(" ");
        System.out.println(Arrays.toString(d));

        // In ra tên cuối cùng từ mảng d
        System.out.println("Tên: " + d[d.length - 1]);
    }
}

 