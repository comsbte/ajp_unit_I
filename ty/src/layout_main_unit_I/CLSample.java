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
		CLSample gl = new CLSample();
		//Cannot Access Non static Data Members or 
		//Member function inside Static Method
		//hence required gl.f and gl.cl every time
		
		gl.f = new Frame(); 
		gl.cl = new CardLayout();
		gl.f.setLayout(gl.cl);
		
		Button first = new Button("first");
		Button second = new Button("second");
		Button third = new Button ("third");
		Button fourth = new Button ("fourth");
		Button fifth = new Button ("fifth");
		
		gl.f.add(first,"one");
		gl.f.add(second,"two");
		gl.f.add(third,"three");
		gl.f.add(fourth,"four");
		gl.f.add(fifth,"five");
		
		first.addActionListener(gl);
		second.addActionListener(gl);
		third.addActionListener(gl);
		fourth.addActionListener(gl);
		fifth.addActionListener(gl);
		
		
		gl.f.setVisible(true);
		gl.f.setSize(400, 400);
		gl.f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				gl.f.dispose();
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("NEXT");
		cl.next(f);
	}
}
