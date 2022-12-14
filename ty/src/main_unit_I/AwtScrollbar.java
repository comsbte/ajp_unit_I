package main_unit_I;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AwtScrollbar {
	public static void main(String[] args) {
		Frame f = new Frame("Apply For Personal Loan");
		f.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		Label l1 = new Label("Tenure in Years");
		gbc.gridx=0;
		gbc.gridy = 0;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		f.add(l1,gbc);
		int value = 5;
		
		//Note that the actual maximum value of the scroll bar is the 
		//maximum minus the visible amount. 
		//In this example, because the maximum is 10 and the 
		//visible amount is 1, the actual maximum value is 10-1=9. 
		
		Scrollbar sbTenure = 
				new Scrollbar(Scrollbar.HORIZONTAL, value, 1, 1, 10);
		
		gbc.gridx=1;
		gbc.gridy = 0;
		gbc.ipadx = 500;
		gbc.ipady = 50;
		
		sbTenure.setUnitIncrement(1);
		sbTenure.setBlockIncrement(2);
		
		f.add(sbTenure,gbc);
		
		Label lblOutput = new Label(value+" Year");
		gbc.gridx=1;
		gbc.gridy = 1;
		gbc.ipadx = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		lblOutput.setBackground(Color.RED);
		f.add(lblOutput,gbc);
		
		sbTenure.addAdjustmentListener(new AdjustmentListener() {			
			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
				//int year = sbTenure.getValue();
				int year = e.getValue();
				lblOutput.setText(year+" year");
				if(AdjustmentEvent.BLOCK_DECREMENT ==e.getAdjustmentType())
					System.out.println("Block Decrement");
				else if(AdjustmentEvent.BLOCK_INCREMENT ==e.getAdjustmentType())
					System.out.println("Block Increment");
				else if(AdjustmentEvent.UNIT_DECREMENT ==e.getAdjustmentType())
					System.out.println("UNIT DECREMENT");
				else if(AdjustmentEvent.UNIT_INCREMENT ==e.getAdjustmentType())
					System.out.println("UNIT INCREMENT");
				else if(AdjustmentEvent.TRACK ==e.getAdjustmentType())
					System.out.println("TRACK");
			}
		});	
		
		f.setVisible(true);
		f.setSize(700, 700);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});	
	}
}
