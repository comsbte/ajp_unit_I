package main_unit_I;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AwtFileDialog {
	public static void main(String[] args) {
		Frame f = new Frame("Programming Editor");
		f.setLayout(new FlowLayout());
		
		Button b = new Button("Open DialogBox");
		f.add(b);
		
		Dialog d = new Dialog(f,"Find ODD Even",false);
		d.setLayout(new FlowLayout());
		
		TextField txtNumber = new TextField(10);
		d.add(txtNumber);
		
		Button btnEnter = new Button("Enter");
		d.add(btnEnter);
		
		btnEnter.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(txtNumber.getText());
				if(num%2==0) {
					System.out.println(num+ " Number is Even");
				}
				else {
					System.out.println(num+ " Number is ODD");
				}
			}
		});
		
		d.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				d.dispose();
			}
		});
		
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				d.setSize(200, 200);
				d.setVisible(true);
			}
		});
		
		f.setVisible(true);
		f.setSize(700, 700);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
	}
}
