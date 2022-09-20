package myComponent;

import java.awt.Frame;

import listener.MyWinAdapter;

public class MyFrame extends Frame{
	public MyFrame(String title) {
		setSize(600, 400);        //setting size.
        setLocation(200,200);
        setTitle(title);  //setting title.  
        setLayout(null);   //set default layout for frame.  
        setVisible(true);  //set frame visibility true.
        addWindowListener(new MyWinAdapter(this));
	}
}
