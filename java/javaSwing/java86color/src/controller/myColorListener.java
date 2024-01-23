package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.myColorView;

public class myColorListener implements ActionListener{
	private myColorView myColorView;
	
	
	public myColorListener(myColorView myColorView) {
		this.myColorView = myColorView;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("Red Text")) {
			this.myColorView.changeTextColor(Color.RED);
		}else if(src.equals("Yellow Text")) {
			this.myColorView.changeTextColor(Color.YELLOW);
		}else if(src.equals("Green Text")) {
			this.myColorView.changeTextColor(Color.GREEN);
		}else if(src.equals("Red Background")) {
			this.myColorView.changeBacgroundColor(Color.RED);
		}else if(src.equals("Yellow Background")) {
			this.myColorView.changeBacgroundColor(Color.YELLOW);
		}else if(src.equals("Green Background")) {
			this.myColorView.changeBacgroundColor(Color.GREEN);
		}
	}

}
