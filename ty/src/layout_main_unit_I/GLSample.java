package layout_main_unit_I;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

import listener.MyWinAdapter;
import myComponent.MyButton;
import myComponent.MyLabel;

public class GLSample {

	public static void main(String[] args) {
		int fsize =20; 
		Frame f = new Frame("GridLayout Sample");
		f.setLayout (new BorderLayout());//9
		MyLabel output = new MyLabel("Ouput", 80);

		f.add(output,BorderLayout.NORTH);
		
		Panel p = new Panel(new GridLayout(3,4));
		
		MyButton b2 = new MyButton("7",fsize);
		MyButton b3 = new MyButton ("8",fsize);
		MyButton b4 = new MyButton ("9",fsize);
		MyButton b5 = new MyButton ("X",fsize);
		MyButton b6 = new MyButton ("4",fsize);
		MyButton b7 = new MyButton ("5",fsize);
		MyButton b8 = new MyButton ("6",fsize);
		MyButton b9 = new MyButton ("-",fsize);
		MyButton b10 = new MyButton ("1",fsize);
		MyButton b11 = new MyButton ("2",fsize);
		MyButton b12 = new MyButton ("3",fsize);
		MyButton b13 = new MyButton ("+",fsize);
		
		
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(b10);
		p.add(b11);
		p.add(b12);
		p.add(b13);
		
		f.add(p,BorderLayout.CENTER);
		
		 f.setVisible(true);
		 f.setSize(700, 700);
		 f.addWindowListener(new MyWinAdapter(f));
	}

}
