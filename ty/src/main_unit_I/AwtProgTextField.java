package main_unit_I;

import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import myComponent.MyFrame;

public class AwtProgTextField {
	public static void main(String[] args) {
		MyFrame f = new MyFrame("TextField");
		
		TextField tf1 = new TextField("0");
		TextField tf2 = new TextField("0");
		TextField tf3 = new TextField("0");
		TextField tf4 = new TextField("0");
		TextField tf5 = new TextField("0");
		TextField tf6 = new TextField("0");

		int htxt = 20, wtxt =100;
		int xtxt=100, ytxt=60;
		
		tf1.setBounds(xtxt, ytxt = ytxt+20, wtxt, htxt);
		tf2.setBounds(xtxt, ytxt =ytxt+20, wtxt, htxt);
		tf3.setBounds(xtxt, ytxt =ytxt+20, wtxt, htxt);
		tf4.setBounds(xtxt, ytxt =ytxt+20, wtxt, htxt);
		tf5.setBounds(xtxt, ytxt =ytxt+20, wtxt, htxt);
		tf6.setBounds(xtxt, ytxt =ytxt+20, wtxt, htxt);

		
		Button btn = new Button("ADD");
		btn.setBounds(xtxt , ytxt=ytxt+20, wtxt,htxt);
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int q1 = Integer.parseInt(tf1.getText());
				int q2 = Integer.parseInt(tf2.getText());
				int q3 = Integer.parseInt(tf3.getText());
				int q4 = Integer.parseInt(tf4.getText());
				int q5 = Integer.parseInt(tf5.getText());
				int q6 = Integer.parseInt(tf6.getText());
				int total = q1+q2+q3+q4+q5+q6;
				
				System.out.println("Total Marks ="+total);
			}
		});
		
		f.add(tf1);
		f.add(tf2);
		f.add(tf3);
		f.add(tf4);
		f.add(tf5);
		f.add(tf6);
		f.add(btn);
		
	}

}
