package main_unit_I;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;

public class AwtMenu2 {
	public static void createFile(Frame f,Label lblOut,String ext)
	{
		FileDialog fd = new FileDialog(f,
				"Create "+ext+" Program",FileDialog.SAVE);
		fd.setFile("*."+ext);
		fd.setVisible(true);
		String fileName = fd.getDirectory()+fd.getFile();
		File myObj = new File(fileName);
		try {
			myObj.createNewFile();
			lblOut.setText(fd.getFile()+" File Created Successfully");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Frame f = new Frame("Programming Editor");
		f.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		MenuBar mb = new MenuBar();
		Menu file = new Menu("File");
		Menu edit = new Menu("Edit");
		Menu help = new Menu("Help");
		MenuItem exit = new MenuItem("Exit");
		
		Label lblOut = new Label();
		f.add(lblOut);
		
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
		
		cpp.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				createFile(f,lblOut,"cpp");
			}
		});
		
		java.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				createFile(f,lblOut,"java");
			}
		});
		
		py.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				createFile(f,lblOut,"py");
			}
		});
		
		subMenu.add(py);
		subMenu.add(java);
		subMenu.add(cpp);
		
		f.setMenuBar(mb);
		
		MenuItem save = new MenuItem("Save");
		file.add(save);
		
		save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FileDialog fd = new FileDialog(f,
						"Create JAVA Program",FileDialog.LOAD);
				fd.setVisible(true);
				String fileName = fd.getDirectory()+fd.getFile();
				lblOut.setText(fileName);
				f.setVisible(true);
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
