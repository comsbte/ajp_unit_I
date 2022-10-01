package layout_main_unit_I;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;

import listener.MyWinAdapter;

public class FLSample {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setLayout (new FlowLayout(FlowLayout.TRAILING,0,0));
		Button north = new Button("NORTH");
		Button south = new Button("SOUTH");
		Button east = new Button ("EAST");
		Button west = new Button ("WEST");
		Button center = new Button ("CENTER");
		Font myfont = new Font("Courier", Font.ITALIC,45);
		
		north.setFont(myfont);
		south.setFont(myfont);
		east.setFont(myfont);
		west.setFont(myfont);
		center.setFont(myfont);
		
		 f.add(north);
		 f.add(south);
		 f.add(east);
		 f.add(west);
		 f.add(center);
		 
		 f.setVisible(true);
		 f.setSize(700, 700);
		 f.addWindowListener(new MyWinAdapter(f));
	}
}
