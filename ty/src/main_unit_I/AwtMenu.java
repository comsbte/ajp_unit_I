package main_unit_I;

import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AwtMenu {
	public static void main(String[] args) {
		Frame f = new Frame("Programming Editor");
		f.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		MenuBar mb = new MenuBar();
		Menu file = new Menu("File");
		Menu edit = new Menu("Edit");
		Menu help = new Menu("Help");
		MenuItem exit = new MenuItem("Exit");
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});
		
		mb.add(file);
		mb.add(edit);
		mb.add(help);
		
		Menu subMenu = new Menu("New");
		file.add(subMenu);
		
		
		MenuItem cpp = new MenuItem("C++");
		MenuItem java = new MenuItem("Java");
		MenuItem py = new MenuItem("Python");
		
		subMenu.add(py);
		subMenu.add(java);
		subMenu.add(cpp);
		
		f.setMenuBar(mb);
		
		MenuItem save = new MenuItem("Save");
		file.add(save);
		
		save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Saved ="+e.getActionCommand());
			}
		});
		
		file.add(exit);
		
		f.setVisible(true);
		f.setSize(700, 700);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
	}
}
