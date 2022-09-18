package listener;

import java.awt.Checkbox;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemLisCheckBox implements ItemListener{
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		 
		//System.out.println(e.paramString());
		String ch = (String)e.getItem();
		if(e.getStateChange()==e.SELECTED) {
			System.out.println("I want "+ch);
		}
		else {
			System.out.println("I don't want "+ch);
		}
	}

}
