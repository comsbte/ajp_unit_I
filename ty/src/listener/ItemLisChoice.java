package listener;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemLisChoice implements ItemListener{

	@Override
	public void itemStateChanged(ItemEvent e) {
		//System.out.println(e.paramString());
		String ch = (String)e.getItem();
		System.out.println("I am good at "+ch);
	}

}
