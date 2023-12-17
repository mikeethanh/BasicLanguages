public class mangdachieu {
    public static void main(String[] args) {
        // Khởi tạo mảng 3 chiều
        int[][][] mang3Chieu = {
            {
                {2, 3, 4},
                {3, 4, 3, 5},
                {3},
            },

            {
                {1, 2, 3, 4},
                {5, 5}
            }

        };

        // In tất cả các phần tử trong mảng 3D
        // Sử dụng vòng lặp for each

        for (int[][] mang2Chieu: mang3Chieu) {
            for (int[] mangCon: mang2Chieu) {
                for (int giaTri: mangCon) {
                    System.out.println(giaTri);
                }
            }
        }
    }
}
