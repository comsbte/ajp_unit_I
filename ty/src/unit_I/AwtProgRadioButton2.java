package unit_I;

import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;

import listener.ItemLisCheckBox;
import listener.ItemLisRadio;
import listener.MyWinAdapter;
import listener.MywinLis;
import myComponent.MyCheckbox;
import myComponent.MyFrame;
import myComponent.MyRadioButton;

public class AwtProgRadioButton2 {
	public static void main(String[] args) {
		MyFrame f = new MyFrame("Select Choice"); 
		CheckboxGroup cbg = new CheckboxGroup();
		
		MyRadioButton cMale = new MyRadioButton("Male", true,cbg);
		MyRadioButton cFemale = new MyRadioButton("Female", true,cbg);
		
		cMale.setBounds(60,20,100,50);
		cFemale.setBounds(60,50,100,50);
		
		cMale.addItemListener(new ItemLisRadio());
		cFemale.addItemListener(new ItemLisRadio());
		
			
		f.add(cMale);
		f.add(cFemale);
		
	}
}
