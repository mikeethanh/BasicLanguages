package Ex;

public class test {
	public static void main(String[] args) {
		student sv1 =new student(150, "Tran Van Thanh", "Lop 1", 9);
		student sv2 =new student(100, "Nguyen Thi Thanh Hoa", "Lop 2", 8);
		student sv3 =new student(199, "Nguyen Van An", "Lop 2", 8);
		
		System.out.println(sv1.compareTo(sv2));
		System.out.println(sv3.compareTo(sv1));
	}
}
