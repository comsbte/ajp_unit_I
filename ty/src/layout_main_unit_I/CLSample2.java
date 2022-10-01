package layout_main_unit_I;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CLSample2 implements ActionListener{

		public CardLayout cl;
		public Frame f;
		public CLSample2() {
			f = new Frame();
			cl = new CardLayout();
			f.setLayout(cl);
			
			Button north = new Button("NORTH");
			Button south = new Button("SOUTH");
			Button east = new Button ("EAST");
			Button west = new Button ("WEST");
			Button center = new Button ("CENTER");
			
			f.add(north,"one");
			f.add(south,"two");
			f.add(east,"three");
			f.add(west,"four");
			f.add(center,"five");
			
			north.addActionListener(this);
			south.addActionListener(this);
			east.addActionListener(this);
			west.addActionListener(this);
			center.addActionListener(this);
			
			
			f.setVisible(true);
			f.setSize(400, 400);
			f.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					f.dispose();
				}
			});	
		}
		
		public static void main(String[] args) {
			CLSample2 gl = new CLSample2();
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("NEXT");
			cl.next(f);
		}
}
