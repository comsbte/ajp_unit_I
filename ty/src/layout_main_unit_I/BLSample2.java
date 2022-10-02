package layout_main_unit_I;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JLabel;

public class BLSample2 {
	
	public BLSample2() {
		Frame f = new Frame();
		Font myfont = new Font("Courier", Font.ITALIC,35);
		
		Label lNorth = new Label("Shortcut Menu Under Menubar Component (Added To Panel)");
		
		//Swing Component JLabel used for newline 
		JLabel lWest = new JLabel("<html>ty<br>JRE System Library<br>src<br>listener</html>");
		lWest.setVerticalAlignment(JLabel.TOP);
		
		TextArea txtProgCenter = new TextArea(
				"public class Sample{ public static void main(String[] args) {}}", 
				2, 2, TextArea.SCROLLBARS_BOTH);
		txtProgCenter.setFont(myfont);
		
		Label consoleOutSouth = new Label("Console output Displayed here");
		consoleOutSouth.setFont(myfont);
		
		f.add(lNorth,BorderLayout.NORTH);
		f.add(lWest,BorderLayout.WEST);
		f.add(txtProgCenter,BorderLayout.CENTER);
		f.add(consoleOutSouth,BorderLayout.SOUTH);
		
		
		f.setExtendedState(Frame.MAXIMIZED_BOTH);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});	
	}
	
	public static void main(String[] args) {
		BLSample2 s = new BLSample2();
	}
	

}

