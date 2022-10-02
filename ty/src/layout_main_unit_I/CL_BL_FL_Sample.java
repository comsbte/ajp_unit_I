package layout_main_unit_I;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import myComponent.MyButton;
import myComponent.MyLabel;

public class CL_BL_FL_Sample {

	public static void main(String[] args) {
		Frame f = new Frame("CL BL FL layout combine use");
		int fontSize = 20;
		
		MyLabel lNorth = new MyLabel("Motivation Quotes (NORTH)",fontSize+10);
		lNorth.setAlignment(Label.CENTER);
		lNorth.setBackground(Color.GREEN);
		
		Panel pCenter = new Panel();
		CardLayout cl = new CardLayout();
		pCenter.setLayout(cl);
		pCenter.setBackground(Color.CYAN);
		
		
		MyLabel l1 = new MyLabel("1) Nothing is impossible.",fontSize);
		MyLabel l2 = new MyLabel("2) The bad news is time flies. The good news is you're the pilot.",fontSize);
		MyLabel l3 = new MyLabel("3) There is nothing impossible to they who will try.",fontSize);
		MyLabel l4 = new MyLabel("4) You define your own life. ",fontSize);
		MyLabel l5 = new MyLabel("5) Don't let other people write your script.",fontSize);
		MyLabel l6 = new MyLabel("6) You are never too old to set another goal or to dream a new dream.",fontSize);
		
		pCenter.add("1",l1);
		pCenter.add("2",l2);
		pCenter.add("3",l3);
		pCenter.add("4",l4);
		pCenter.add("5",l5);
		pCenter.add("6",l6);
		
		Panel pSouth = new Panel(new FlowLayout());
		pSouth.setBackground(Color.ORANGE);
		
		MyButton btnNext = new MyButton("NEXT",fontSize);
		MyButton btnPrev = new MyButton("Prev",fontSize);
		MyButton btnFirst = new MyButton("First",fontSize);
		MyButton btnLast = new MyButton("Last",fontSize);
		
		btnNext.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.next(pCenter);
			}
		});
		
		btnPrev.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.previous(pCenter);
			}
		});
		
		btnFirst.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.first(pCenter);
			}
		});
		
		btnLast.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.last(pCenter);
			}
		});
		
		pSouth.add(btnFirst);
		pSouth.add(btnNext);
		pSouth.add(btnPrev);
		pSouth.add(btnLast);
		
		f.add(pCenter,BorderLayout.CENTER);
		f.add(lNorth,BorderLayout.NORTH);
		f.add(pSouth,BorderLayout.SOUTH);
		
		f.setVisible(true);
		f.setExtendedState(Frame.MAXIMIZED_BOTH);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});	
	}

}
