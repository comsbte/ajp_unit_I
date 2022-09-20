package unit_I;

import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import myComponent.MyFrame;

public class AwtProgTextField2 {
	public static void main(String[] args) {
		
		MyFrame f = new MyFrame("TextFiled ");
		
		TextField t = new TextField("Admin");
		t.setBounds(60,80,100,20);
		t.setEditable(false);
		
		TextField tpass = new TextField();
		tpass.setBounds(60,100,100,20);
		tpass.setEchoChar('*');
		
		
		Button btn = new Button("Login");
		Button btn2 = new Button("Show Selected Password");
		Button btn3 = new Button("Select All Password");
		Label lblOutput = new Label();

		btn.setBounds(80,140,60,30);
		lblOutput.setBounds(60,180, 250, 20);
		btn2.setBounds(80,220,200,30);
		btn3.setBounds(80,250,200,30);
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String pass = tpass.getText();
				if(pass.equals("Admin@123")) {
					lblOutput.setText("Login Successfully");
				}
				else {
					lblOutput.setText("Please Enter Correct Password");
				}
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lblOutput.setText(tpass.getSelectedText());
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tpass.select(0, tpass.getText().length());
			}
		});
		
		f.add(lblOutput);
		f.add(tpass);
		f.add(t);
		f.add(btn);
		f.add(btn2);
		f.add(btn3);
		
		
	}
}
