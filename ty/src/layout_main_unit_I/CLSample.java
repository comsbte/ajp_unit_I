package layout_main_unit_I;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CLSample implements ActionListener{
	public CardLayout cl;
	public Frame f;
	
	public static void main(String[] args) {
		CLSample cls = new CLSample();
		//Cannot Access Non static Data Members or 
		//Member function inside Static Method
		//hence required gl.f and gl.cl every time
		
		cls.f = new Frame("Sample Cardlayout"); 
		cls.cl = new CardLayout();
		cls.f.setLayout(cls.cl);
		
		Button first = new Button("first");
		Button second = new Button("second");
		Button third = new Button ("third");
		Button fourth = new Button ("fourth");
		Button fifth = new Button ("fifth");
		
		cls.f.add(first,"one");
		cls.f.add(second,"two");
		cls.f.add(third,"three");
		cls.f.add(fourth,"four");
		cls.f.add(fifth,"five");
		
		first.addActionListener(cls);
		second.addActionListener(cls);
		third.addActionListener(cls);
		fourth.addActionListener(cls);
		fifth.addActionListener(cls);
		
		
		cls.f.setVisible(true);
		cls.f.setSize(400, 400);
		cls.f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				cls.f.dispose();
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("NEXT");
		cl.next(f);
	}
}
