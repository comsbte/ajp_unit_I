package unit_I;

import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;

import listener.MywinLis;
import myComponent.MyCheckbox;

public class AwtProgram4 {
	public static void main(String[] args) {
		Frame f = new Frame("Select Choice"); 
		MyCheckbox cMale = new MyCheckbox("Male", true);
		MyCheckbox cFemale = new MyCheckbox("Female", true);
		cMale.setBounds(60,20,100,50);
		cFemale.setBounds(60,50,100,50);
		CheckboxGroup cbg = new CheckboxGroup();
		cMale.setCheckboxGroup(cbg);
		cFemale.setCheckboxGroup(cbg);
		
		Choice choice = new Choice();
		choice.add("Java");
		choice.add("C++");
		choice.add("C");
		
		choice.setBounds(60,100, 100, 200);
		
		f.add(cMale);
		f.add(cFemale);
		f.add(choice);
		
		f.setSize(600, 250);        //setting size.
        f.setLocation(200,200);
        f.setTitle("AWT Program Level 1");  //setting title.  
        f.setLayout(null);   //set default layout for frame.  
        f.setVisible(true);  //set frame visibility true.
        MywinLis w = new MywinLis(f);
        f.addWindowListener(w);
	}
}
