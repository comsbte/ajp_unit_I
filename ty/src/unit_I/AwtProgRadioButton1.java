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

public class AwtProgRadioButton1 {
	public static void main(String[] args) {
		MyFrame f = new MyFrame("Select Choice"); 
		
		MyCheckbox cMale = new MyCheckbox("Male", true);
		MyCheckbox cFemale = new MyCheckbox("Female", true);
		cMale.setBounds(60,20,100,50);
		cFemale.setBounds(60,50,100,50);
		
		CheckboxGroup cbg = new CheckboxGroup();
		cMale.setCheckboxGroup(cbg);
		cFemale.setCheckboxGroup(cbg);
		
		cMale.addItemListener(new ItemLisRadio());
		cFemale.addItemListener(new ItemLisRadio());
		
			
		f.add(cMale);
		f.add(cFemale);
		
	}
}
