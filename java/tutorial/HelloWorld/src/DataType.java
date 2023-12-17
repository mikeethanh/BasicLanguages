public class DataType {
    public static void main(String[] args) {
        boolean result = true;
        //Kiểu dữ liệu byte có thể có giá trị từ -128 đến 127.
        //Kiểu byte được sử dụng để thay thế kiểu int để tiết kiệm bộ nhớ nếu dữ liệu nằm trong khoảng từ [-121, 127].

        byte bytes = 12;

        //Kiểu dữ liệu short có thể chứa giá trị từ -32768 đến 32767.
        //Kiểu short được sử dụng để thay thế kiểu int để tiết kiệm bộ nhớ nếu dữ liệu nằm trong khoảng từ [-32768, 32767].
        short nhietDo= -200;

        //\b là Backspace
        //\t là tab
        //\n là một dòng mới
        //\r là return
        char giaTriChar = 'g';
        char themDongMoi = '\n';
        String giaTriString = "Lập trình Java";

        System.out.println(nhietDo);
        System.out.println(result);
        System.out.println(bytes);
        System.out.println(giaTriChar);
        System.out.println(themDongMoi);
        System.out.println(giaTriString);
    }

}
