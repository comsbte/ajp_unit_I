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
		gl.f = new Frame();
		 gl.cl = new CardLayout();
		gl.f.setLayout(gl.cl);
		
		Button north = new Button("NORTH");
		Button south = new Button("SOUTH");
		Button east = new Button ("EAST");
		Button west = new Button ("WEST");
		Button center = new Button ("CENTER");
		
		gl.f.add(north,"one");
		gl.f.add(south,"two");
		gl.f.add(east,"three");
		gl.f.add(west,"four");
		gl.f.add(center,"five");
		
		north.addActionListener(gl);
		south.addActionListener(gl);
		east.addActionListener(gl);
		west.addActionListener(gl);
		center.addActionListener(gl);
		
		
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
