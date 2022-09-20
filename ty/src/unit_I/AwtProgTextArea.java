package unit_I;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;

import listener.MyWinAdapter;

public class AwtProgTextArea {

	public static void main(String[] args) {
		Frame f = new Frame(" Text Area ");
		f.setLayout(new FlowLayout());
		TextArea ta = new TextArea("Testing",10,10,TextArea.SCROLLBARS_BOTH);
		f.add(ta);
		f.setSize(600, 400);
		f.setVisible(true);
		f.addWindowListener(new MyWinAdapter(f));
	}

}
