public class operator {
    public static void main(String[] args) {
        
        //instanceof operator
        String test = "abcxyz";
        boolean result;
        result = test instanceof String;

        //Toán tử Ternary (hay còn gọi là toán tử 3 ngôi)
        //bienKetQua = BieuTHucDieuKien ? bieuThuc1 : bieuThuc2
        int tuoi = 18;
        String ketQua;
        
        ketQua = (tuoi >= 18) ? "Được xem phim 18+" : "Chưa được xem phim 18+";
        System.out.println(ketQua);



        System.out.println(result);
    }
}
