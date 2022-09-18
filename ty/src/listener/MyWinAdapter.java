package listener;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWinAdapter extends WindowAdapter {
	Frame f;
	public MyWinAdapter(Frame f)
	{
		this.f = f;
	}
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing");
		f.dispose();
	}
}
