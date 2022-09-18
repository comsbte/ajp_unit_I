package unit_I;

import listener.ItemLisCheckBox;
import myComponent.MyCheckbox;
import myComponent.MyFrame;

public class AwtProgCheckBox {
	public static void main(String[] args) {
		MyFrame f = new MyFrame("Select CheckBox"); 
		
		MyCheckbox lang1 = new MyCheckbox("Database", false);
		MyCheckbox lang2 = new MyCheckbox("Data Structure", false);
		MyCheckbox lang3 = new MyCheckbox("OS", false);
		
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
