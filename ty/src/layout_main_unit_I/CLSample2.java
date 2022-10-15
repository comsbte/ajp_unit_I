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
			f = new Frame("Sample Cardlayout");
			cl = new CardLayout();
			f.setLayout(cl);
			
			Button first = new Button("first");
			Button second = new Button("second");
			Button third = new Button ("third");
			Button fourth = new Button ("fourth");
			Button fifth = new Button ("fifth");
			
			f.add(first,"one");
			f.add(second,"two");
			f.add(third,"three");
			f.add(fourth,"four");
			f.add(fifth,"five");
			
			first.addActionListener(this);
			second.addActionListener(this);
			third.addActionListener(this);
			fourth.addActionListener(this);
			fifth.addActionListener(this);
			
			
			f.setVisible(true);
			f.setSize(400, 400);
			f.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					f.dispose();
				}
			});	
		}
		
		public static void main(String[] args) {
			CLSample2 cls = new CLSample2();
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("NEXT");
			cl.next(f);
		}
}
