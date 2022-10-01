package main_unit_I;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;

import listener.MyWinAdapter;

public class AwtProgTextArea {

	public static void main(String[] args) {
		Frame f = new Frame(" Text Area ");
	
		TextArea ta = 
				new TextArea("Text Area ONE",5,10,TextArea.SCROLLBARS_HORIZONTAL_ONLY);
		TextArea ta2 = 
				new TextArea("Text Area TWO",5,10,TextArea.SCROLLBARS_HORIZONTAL_ONLY);
		f.add(ta);
		f.add(ta2,BorderLayout.SOUTH);
		f.setSize(600, 400);
		f.setVisible(true);
		f.addWindowListener(new MyWinAdapter(f));
	}

}
