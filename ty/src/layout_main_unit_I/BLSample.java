package layout_main_unit_I;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

import listener.MyWinAdapter;

public class BLSample {
	public static void main(String[] args) {
		Frame f = new Frame("Border Layout Sample 1");
		Panel p = new Panel();
		
		Button north = new Button("NORTH");
		Button south = new Button("SOUTH");
		Button east = new Button ("EAST");
		Button west = new Button ("WEST");
		Button center = new Button ("CENTER");
		Button six = new Button ("SIX");
		Button seven = new Button ("SEVEN");
		
		Font myfont = new Font("Courier", Font.ITALIC,45);
		
		north.setFont(myfont);
		south.setFont(myfont);
		east.setFont(myfont);
		west.setFont(myfont);
		center.setFont(myfont);
		six.setFont(myfont);
		seven.setFont(myfont);
		
		p.add(center);
		p.add(six);
		p.add(seven);
		
		 f.add(north, BorderLayout.NORTH);
		 f.add(south, BorderLayout.SOUTH);
		 f.add(east, BorderLayout.EAST);
		 f.add(west, BorderLayout.WEST);
		 f.add(p, BorderLayout.CENTER);
		 
		 f.setVisible(true);
		 f.setSize(700, 700);
		 f.addWindowListener(new MyWinAdapter(f));
	}
}
