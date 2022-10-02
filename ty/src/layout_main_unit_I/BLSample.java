package layout_main_unit_I;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;

import listener.MyWinAdapter;

public class BLSample {
	public static void main(String[] args) {
		Frame f = new Frame("Border Layout Sample 1");
		f.setLayout (new BorderLayout());
		
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
		
		 f.add(north, BorderLayout.NORTH);
		 f.add(south, BorderLayout.SOUTH);
		 f.add(east, BorderLayout.EAST);
		 f.add(west, BorderLayout.WEST);
		 f.add(center, BorderLayout.CENTER);
		 
		 f.setVisible(true);
		 f.setSize(700, 700);
		 f.addWindowListener(new MyWinAdapter(f));
	}
}
