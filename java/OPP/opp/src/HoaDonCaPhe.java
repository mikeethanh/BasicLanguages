public class HoaDonCaPhe {
	private String tenLoaiCaPhe;
	private double giaTien1Kg;
	private double khoiLuong;

	public HoaDonCaPhe(String ten, double gia, double kl) {
		this.tenLoaiCaPhe = ten;
		this.giaTien1Kg = gia;
		this.khoiLuong = kl;
	}

	public double tinhTongTien() {
		return this.giaTien1Kg * this.khoiLuong;
	}

	public boolean kiemTraKhoiLuongLonHon(double kl) {
//		if (this.khoiLuong > kl) {
//			return true;
//		}else {
//			return false;
//		}

		return this.khoiLuong > kl;
	}

	public boolean kiemTraTongTienLonHon500K() {
		return this.tinhTongTien() > 500000;
	}

	public double giamGia(double x) {
		if (this.tinhTongTien() > 500000) {
			return (x / 100) * this.tinhTongTien();
		} else {
			return 0;
		}
	}
	
	public double giaSauKhiGiam(double x) {
		return this.tinhTongTien() - this.giamGia(x);
	}

	public static void main(String[] args) {
		HoaDonCaPhe hd = new HoaDonCaPhe("Trung Nguyen", 100000, 1.5);
		HoaDonCaPhe hd2 = new HoaDonCaPhe("Trung Nguyen", 100000, 5.5);
		System.out.println("Tong tien Hd: " + hd.tinhTongTien());
		System.out.println("Tong tien Hd2: " + hd2.tinhTongTien());
		System.out.println("Kiem tra khoi luong > 2kg "+ hd.kiemTraKhoiLuongLonHon(2));
		System.out.println("Kiem tra khoi luong > 1kg "+ hd.kiemTraKhoiLuongLonHon(1));
		System.out.println("Kiem tra tong tien > 500k "+ hd.kiemTraTongTienLonHon500K());
		System.out.println("Giam gia cua Hd: "+ hd.giamGia(10));
		System.out.println("Giam gia cua Hd2: "+ hd2.giamGia(10));
		System.out.println("Sau giam gia cua Hd: "+ hd.giaSauKhiGiam(10));
		System.out.println("Sau giam gia cua Hd2: "+ hd2.giaSauKhiGiam(10));
	}
}
