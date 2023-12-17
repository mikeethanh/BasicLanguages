// Để sử dụng Phương thức toString() và copyOfRange()
import java.util.Arrays;

public class copyofrange {
    public static void main(String[] args) {
      
        int[] mangNguon = {1, 2, 3, 4, 5};
        
        // Sao chép mảng nguồn đến mảng đích 1
        int[] mangDich1 = Arrays.copyOfRange(mangNguon, 0, mangNguon.length);      
        System.out.println("Mảng mangDich1 = " + Arrays.toString(mangDich1)); 
        
        // Sao chép mảng nguồn đến mảng đích 2
        // từ index bằng 2 đến index bằng 4 (Không bao gồm ví trí index 4)
        // Có nghĩa là chỉ sao chép giá trị 3, 4 trong mảng nguồn
        int[] mangDich2 = Arrays.copyOfRange(mangNguon, 2, 4); 
        System.out.println("Mảng mangDich2 = " + Arrays.toString(mangDich2));   
    }
}
