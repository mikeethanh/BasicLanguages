public class test {
    public static void main(String[] args) {
		System.out.println("Kiểm tra");
		ConNguoi cn = new ConNguoi("TITV" , 2021);
//		cn.an();
//		cn.uong();
//		cn.ngu();
		
		HocSinh hs = new HocSinh("TITV", 2021, "Lớp 1", "Trường 1");
		hs.an();
		hs.uong();
		hs.ngu();
		hs.lamBaiTap();
	}
}
