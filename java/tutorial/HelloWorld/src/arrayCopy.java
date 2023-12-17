// Import cái này để sử dụng phương thức toString()
import java.util.Arrays;

public class arrayCopy {
    public static void main(String[] args) {
        int[] n1 = {1, 2, 3, 4, 5, 6};
        
        int[] n3 = new int[5];
  
        // Tạo mảng n2 có độ dài của mảng n1
        int[] n2 = new int[n1.length];
        
        // Sao chép mảng n1 sang mảng n2
        System.arraycopy(n1, 0, n2, 0, n1.length);
        System.out.println("Mảng n2 = " + Arrays.toString(n2));  
        
        // Sao chép 2 phần tử mảng n1, bắt đầu từ phần tử
        // có index là 2 đến mảng n3 (bắt đầu từ vị trí index 1)
   
        System.arraycopy(n1, 2, n3, 1, 2);
        System.out.println("Mảng n3 = " + Arrays.toString(n3));  
    }
}
