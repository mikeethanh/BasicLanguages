import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        // Tạo đối tượng input
        Scanner input = new Scanner(System.in);

        // Xuất ra thông báo cho người dùng nhập dữ liệu
        System.out.print("Nhập vào một số nguyên: ");

        // Lấy dữ liệu người dùng vừa nhập
        // Gán vào biến soNguyen
        int soNguyen = input.nextInt();

        // In dữ liệu vừa lấy được ra màn hình
        System.out.println("Số bạn vừa nhập là: " + soNguyen);

        // Lấy số float từ người dùng
        System.out.print("Nhập số Float: ");
        float soFloat = input.nextFloat();
        System.out.println("Số Float bạn vừa nhập là: " + soFloat);
        
        // Lấy số double từ người dùng
        System.out.print("Nhập số double: ");
        double soDouble = input.nextDouble();
        System.out.println("Số Double bạn vừa nhập là: " + soDouble);
        
        // Lấy chuỗi từ người dùng
        System.out.print("Nhập vào một chuỗi: ");
        String chuoiString = input.next();
        System.out.println("Chuỗi bạn vừa nhập là: " + chuoiString);
    }
}
