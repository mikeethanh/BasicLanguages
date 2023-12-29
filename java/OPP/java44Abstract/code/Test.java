public class Test {
	public static void main(String[] args) {
		ToaDo td1 = new ToaDo(5, 5);
		ToaDo td2 = new ToaDo(7, 9);
		ToaDo td3 = new ToaDo(12, 1);
//		Hinh h = new Hinh(td1); => lỗi biên dịch
		//abstract khong ton tai 
        
		Hinh h1 = new Diem(td1);
        //h1 co the truy cap duoc vao cac phuong thuc cua lop hinh

        //Trong Java, khi bạn sử dụng System.out.println() để in một đối tượng, nó sẽ tự động gọi phương thức toString() 
        //của đối tượng đó để lấy chuỗi biểu diễn của đối tượng. Nếu lớp ToaDo mà h1.getToaDo() trả về không được ghi đè
        // phương thức toString(), kết quả sẽ là chuỗi ký tự có dạng TênLop@MaHexa
        System.out.println(h1.getToaDo());
		Hinh h2 = new HinhTron(td2, 10);
        
		Hinh h3 = new HinhChuNhat(td3, 5, 10);
		
        
        Hinh h4 = new HinhTron();
        ToaDo td4 = new ToaDo(12, 1);
        h4.setToaDo(td4);
        //Khi bạn gọi h4.setR(4.0), nó chỉ thực hiện trên biến h4 có kiểu Hinh, không phải HinhTron. Kết quả là, phương thức 
        //setR() trong lớp HinhTron không được sử dụng hoặc không có sẵn cho biến h4 (vì biến này được xem như là một đối tượng 
        //của lớp Hinh, không có đầy đủ các phương thức của lớp HinhTron).

		System.out.println("DT1: "+h1.tinhS());
		System.out.println("DT2: "+h2.tinhS());
		System.out.println("DT3: "+h3.tinhS());
        System.out.println("DT4: "+h4.tinhS());
	}
}