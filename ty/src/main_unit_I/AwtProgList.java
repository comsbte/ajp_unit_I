package main_unit_I;

import myComponent.MyFrame;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class AwtProgList {
	
	public static void main(String[] args) {
		MyFrame f = new MyFrame("List Program");
		f.setLayout(new FlowLayout());
		List l = new List(4,true);
		l.add("Dhule");
		l.add("Nanded");
		l.add("Mumbai",0);
		l.add("Pune",1);
		l.add("Nagpur");
		l.add("Nashik",3);
		l.add("Jalgaon");
		l.add("Aurangabad",2);
		l.setBounds(60, 100, 100, 100);
		
		l.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("You double clicked ="+e.getActionCommand());
			}
		});
		
		l.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				Integer s = (Integer)e.getItem();
				if(e.getStateChange()==e.SELECTED) {
					System.out.println("You selected ="+s
							+" index"+
							" that is "+l.getItem(s));
				}
				else {
					System.out.println("You deselected ="
				+s+" index"+
							" that is "+l.getItem(s));
				}
			}
		});
		
		f.add(l);
		
		Button btn = new Button("Get All Centers");
		btn.setBounds(180, 100, 100, 50);
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Total Selected center="+l.getSelectedItems().length);
				String[] str = l.getSelectedItems();
				System.out.println("Selected Centers are :");
				for (String string : str) {
					System.out.println(string);					
				}
			}
		});
		
		f.add(btn);
	}
}
