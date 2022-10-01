package main_unit_I;

import java.awt.Button;
import java.awt.Choice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import listener.ItemLisChoice;
import myComponent.MyFrame;

public class AwtProgChoice {
	public static void main(String[] args) {
		MyFrame f = new MyFrame("Choice Sample");
		
		Choice choice = new Choice();
		choice.add("Java");
		choice.add("C++");
		choice.add("C");
		
		choice.addItemListener(new ItemLisChoice());
		
		Button btn = new Button("Get Info");
		btn.setBounds(60,150, 100, 50);
		
		btn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("I am learning "+
						choice.getSelectedItem());
				
				int index = choice.getSelectedIndex();
				
				System.out.println("I am learning "+
						choice.getItem(index)+" languege");
			}
		});
		
		choice.setBounds(60,100, 100, 200);
		
		f.add(choice);
		f.add(btn);
	}
}
