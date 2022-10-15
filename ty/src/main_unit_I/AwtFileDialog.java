package main_unit_I;

import java.awt.Button;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AwtFileDialog {

	public static void main(String[] args) {
		Frame f = new Frame("Open OR Save File Using FileDialog");
		f.setLayout(new FlowLayout());
		
		
		FileDialog fds = new FileDialog(f,"Save MY File",FileDialog.SAVE);
		FileDialog fdl = new FileDialog(f,"Open MY Image",FileDialog.LOAD);
		
		Button bl = new Button("Open MY File");
		bl.setFont(new Font("Courier", Font.ITALIC, 40));
		f.add(bl);
		
		Button bs = new Button("Save MY File");
		bs.setFont(new Font("Courier", Font.ITALIC, 40));
		f.add(bs);
		
		Label loutput = new Label("Output HERE");
		loutput.setFont(new Font("Courier", Font.ITALIC, 20));
		
		bl.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fdl.setVisible(true);
				String file = fdl.getFile();
				String dir = fdl.getDirectory();
				
				loutput.setText(dir+" "+file);
				f.setVisible(true);
			}
		});
		
		bs.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fds.setVisible(true);
				String file = fds.getFile();
				String dir = fds.getDirectory();
				
				loutput.setText(dir+" "+file);
				f.setVisible(true);
			}
		});
		
		
		f.add(loutput);
		
		f.setVisible(true);
		f.setSize(700, 700);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
	}

}
