package layout_main_unit_I;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;

import listener.MyWinAdapter;

public class FLSample {
	public static void main(String[] args) {
		Frame f = new Frame("Flowlayout Sample");
		
		FlowLayout fl = new FlowLayout(FlowLayout.CENTER,80,40);
		f.setLayout (fl);
		
		Button north = new Button("Button1");
		Button south = new Button("Button2");
		Button east = new Button ("Button3");
		Button west = new Button ("Button4");
		Button center = new Button ("Button5");
		
		Font myfont = new Font("Courier", Font.ITALIC,45);
		
		north.setFont(myfont);
		south.setFont(myfont);
		east.setFont(myfont);
		west.setFont(myfont);
		center.setFont(myfont);
		
		 f.add(north);//1
		 f.add(south);
		 f.add(east);
		 f.add(west);
		 f.add(center);
		 
		 f.setVisible(true);
		 f.setSize(700, 700);
		 f.addWindowListener(new MyWinAdapter(f));
	}
}
