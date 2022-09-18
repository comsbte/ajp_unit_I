package unit_I;

import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;

import listener.ItemLisCheckBox;
import listener.ItemLisChoice;
import listener.ItemLisRadio;
import listener.MyWinAdapter;
import listener.MywinLis;
import myComponent.MyCheckbox;
import myComponent.MyFrame;
import myComponent.MyRadioButton;

public class AwtProgCheckBox {
	public static void main(String[] args) {
		MyFrame f = new MyFrame("Select CheckBox"); 
		
		MyCheckbox lang1 = new MyCheckbox("Tea", false);
		MyCheckbox lang2 = new MyCheckbox("Coffee", false);
		MyCheckbox lang3 = new MyCheckbox("Milk", false);
		
		lang1.setBounds(60,20,100,50);
		lang2.setBounds(60,50,100,50);
		lang3.setBounds(60,80,100,50);
		
		ItemLisCheckBox ic = new ItemLisCheckBox();
		
		lang1.addItemListener(ic);
		lang2.addItemListener(ic);
		lang3.addItemListener(ic);
		
		f.add(lang1);
		f.add(lang2);
		f.add(lang3);
		
	}
}
