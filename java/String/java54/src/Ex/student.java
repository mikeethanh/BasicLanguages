package Ex;

public class student implements Comparable<student> {
	private int  MaSv;
	private String hoVaTen;
	private String tenLop;
	private double diemTB;
	
	public student(int maSv, String hoVaTen, String tenLop, double diemTB) {
		
		this.MaSv = maSv;
		this.hoVaTen = hoVaTen;
		this.tenLop = tenLop;
		this.diemTB = diemTB;
	}

	public int getMaSv() {
		return MaSv;
	}

	public void setMaSv(int maSv) {
		MaSv = maSv;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public double getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}
	
	// function gget last name to compare 
	public String getName() {
		String s = this.hoVaTen.trim();
		s = s.trim(); // ham cat khoang trang o hai dau
		//neu ten co khoang trang 
		if(s.indexOf(" ") >= 0) {
			// lay ra vi tri cuoi cungg cua khang trang roi cut chuoi 
			int index = s.lastIndexOf(" ");
			return s.substring(index+1);
		}else {
			return s ;
		}
	}
	
	@Override
	public int compareTo(student o) {
		// <0
		// >0
		// = 0
		//dua tren so sanh ten 
		String tenThis = this.getName();
		String ten0 = o.getName();
		return tenThis.compareTo(ten0);
	}
	
	
}
