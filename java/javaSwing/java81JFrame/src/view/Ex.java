package view;

import javax.swing.JFrame;

public class Ex {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		// Gắn tên
		jf.setTitle("Vi Du JFrame");
		jf.setSize(600,400);//(horizontal,vertical)
		
		// Gán vị trí hiển thị
		jf.setLocation(300, 300);
				
		// Thoát ra khỏi chương trình khi đóng cửa sổ JFrame
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.setVisible(true); // tao ra 1 window
	}
}
