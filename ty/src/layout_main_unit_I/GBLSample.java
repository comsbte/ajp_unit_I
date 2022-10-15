package layout_main_unit_I;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GBLSample { 
	
	public static void main(String[] args) {
		Frame f = new Frame("Login Form");
		GridBagLayout gbl = new GridBagLayout();
		f.setLayout(gbl);
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		Button b1 = new Button("Button1");
		gbc.gridx = 0;
		gbc.gridy =0 ;
		
		gbc.ipadx = 40;
		gbc.ipady = 10;
		f.add(b1,gbc);
		
		Button b2 = new Button("Button2");
		gbc.gridx = 1;
		gbc.gridy =0 ;
		f.add(b2,gbc);
		
		Button b3 = new Button("Button3");
		gbc.gridx = 2;
		gbc.gridy =0 ;
		
		f.add(b3,gbc);
		
		Button b4 = new Button("Button4");
		gbc.gridx = 1;
		gbc.gridy =1 ;
		gbc.gridwidth = 2 ;
		gbc.ipady = 40;
		gbc.anchor = GridBagConstraints.WEST;
		//gbc.fill = GridBagConstraints.HORIZONTAL;
		//gbc.insets = new Insets(40, 0, 0, 0);
		f.add(b4,gbc);
		
		Button b5 = new Button("Button5");
		gbc.gridx = 4;
		gbc.gridy =0 ;
		gbc.gridheight = 2 ;
		gbc.ipady = 0;
		gbc.fill = GridBagConstraints.VERTICAL;
		
		f.add(b5,gbc);
		
		f.setExtendedState(Frame.MAXIMIZED_BOTH);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});	
	}
}
