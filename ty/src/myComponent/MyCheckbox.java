package myComponent;

import java.awt.Checkbox;

public class MyCheckbox extends Checkbox{
	public MyCheckbox(String label, Boolean state) {
		setLabel(label);
		setState(state);
	}
	
}
