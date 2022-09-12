package unit_I;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;

public class SetFrameIcon {
	public static void main(String[] args) {
		Frame f = new Frame("Test");
		f.setVisible(true);
		MyButton2 obj = new MyButton2();
		Font font1 = new Font("Serif", Font.PLAIN,48);
		Image i = Toolkit.getDefaultToolkit().getImage("C:\\Users\\arutwar\\Pictures\\logo_msbte.png");
		f.setIconImage(i);
		obj.setFont(font1);
		f.add(obj);
	}
}

class MyButton2 extends Button
{
	public MyButton2() {
		// TODO Auto-generated constructor stub
		setLabel("ADDITION");
	}
}