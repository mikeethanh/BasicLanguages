import java.util.Arrays;

public class copyMang2Chieu {
    public static void main(String[] args) {

        int[][] mangNguon = {
            {2, 3, 4}, 
            {3, 4, 3, 5},
            {3},
        };

        int[][] mangDich = new int[mangNguon.length][];

        for (int i = 0; i < mangNguon.length; ++i) {

            // Phân bổ không gian cho mỗi hàng của mảng đích
            mangDich[i] = new int[mangNguon[i].length];
            System.arraycopy(mangNguon[i], 0, mangDich[i], 0, mangDich[i].length);
        }

        // Hiển thị mảng đích
        System.out.println(Arrays.deepToString(mangDich));      
    }
}
