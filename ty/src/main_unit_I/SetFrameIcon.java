package main_unit_I;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SetFrameIcon {
	public static void main(String[] args) {
		Frame f = new Frame("Test");
		
		MyButton2 obj = new MyButton2();
		Font font1 = new Font("Serif", Font.PLAIN,48);
		Image i = Toolkit.getDefaultToolkit().getImage("C:\\Users\\arutwar\\Pictures\\logo_msbte.png");
		f.setIconImage(i);
		f.setSize(400, 400);
		obj.setFont(font1);
		f.add(obj);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
		
		f.setVisible(true);
	}
}

class MyButton2 extends Button
{
	public MyButton2() {
		// TODO Auto-generated constructor stub
		setLabel("ADDITION");
	}
}