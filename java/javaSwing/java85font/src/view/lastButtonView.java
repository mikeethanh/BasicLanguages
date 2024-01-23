package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.lastButtonListener;
import model.lastButtonModel;

public class lastButtonView extends JFrame{
	private lastButtonModel lastButtonModel;
	private JLabel jLabel;
	public lastButtonView() {
		this.lastButtonModel = new lastButtonModel();
		
		this.init();
	}
	private void init() {
		this.setTitle("Last Button");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,300);
		
		JPanel jpanel_Center = new JPanel();
		jpanel_Center.setLayout(new GridLayout(2,2));
		
		// Tao listener
		lastButtonListener lastButtonListener = new lastButtonListener(this);
		
		// Tao font chu
		Font font = new Font("Arial", Font.BOLD, 40);
		
		JButton jButton_1 = new JButton("1");
		// Gan font chu
		jButton_1.setFont(font);
		jButton_1.addActionListener(lastButtonListener);
		
		JButton jButton_2 = new JButton("2");
		jButton_2.setFont(font);
		jButton_2.addActionListener(lastButtonListener);
		
		JButton jButton_3 = new JButton("3");
		jButton_3.setFont(font);
		jButton_3.addActionListener(lastButtonListener);
		
		JButton jButton_4 = new JButton("4");
		jButton_4.setFont(font);
		jButton_4.addActionListener(lastButtonListener);
		
		jpanel_Center.add(jButton_1);
		jpanel_Center.add(jButton_2);
		jpanel_Center.add(jButton_3);
		jpanel_Center.add(jButton_4);
		
		JPanel jpanel_Footer = new JPanel();
		jLabel = new JLabel("------");
		jLabel.setFont(font);
		jpanel_Footer.add(jLabel);
		
		this.setLayout(new BorderLayout());
		
		this.add(jpanel_Center, BorderLayout.CENTER);
		this.add(jpanel_Footer, BorderLayout.SOUTH);
		this.setVisible(true);
	}
	
	//
	public void changeTo_1() {
		this.lastButtonModel.setValue_1();
		jLabel.setText("Last button: "+this.lastButtonModel.getValue());
	}
	public void changeTo_2() {
		this.lastButtonModel.setValue_2();
		jLabel.setText("Last button: "+this.lastButtonModel.getValue());
	}
	public void changeTo_3() {
		this.lastButtonModel.setValue_3();
		jLabel.setText("Last button: "+this.lastButtonModel.getValue());
	}
	public void changeTo_4() {
		this.lastButtonModel.setValue_4();
		jLabel.setText("Last button: "+this.lastButtonModel.getValue());
	}
}