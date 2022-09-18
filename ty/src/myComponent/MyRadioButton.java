package myComponent;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;

public class MyRadioButton extends Checkbox{
	public MyRadioButton(String label, Boolean state,CheckboxGroup chbg) {
		setLabel(label);
		setState(state);
		setCheckboxGroup(chbg);
	}

}
