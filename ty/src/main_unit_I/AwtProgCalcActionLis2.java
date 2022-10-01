package main_unit_I;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextField;

import listener.BtnClick;
import listener.MywinLis;
import myComponent.MyButton;
import myComponent.MyLabel;  
  
/**
 * In This Class , BtnClick class is used as action Listener.
 * So output label and two textfield objects are passed 
 * as constructor parameter.
 * 
 */
public class AwtProgCalcActionLis2{  
	
	public AwtProgCalcActionLis2()  
    {  
		Frame f = new Frame();
		Color bg = new Color(0, 255, 0);
		Color fg = new Color(0, 0, 255);
		
		TextField txtNum1 = new TextField();
		TextField txtNum2 = new TextField();
		
		txtNum1.setText("1");
		txtNum2.setText("1");
		
		MyLabel lblNum1 = 
				new MyLabel("Number 1",12,1,"Courier",bg,fg);
		
		MyLabel lblNum2 = 
				new MyLabel("Number 2",12,1,"Courier",bg,fg);
		
		MyLabel lblNum3 = 
				new MyLabel("",20,1,"Courier",Color.cyan,
						Color.RED);
		
		txtNum1.setBounds(100, 40, 100, 40);
		txtNum2.setBounds(100, 90, 100, 40);
		
		lblNum1.setBounds(10, 40, 100, 40);
		lblNum2.setBounds(10, 90, 100, 40);
		lblNum3.setBounds(80, 200, 100, 50);
        
		MyButton btn =new MyButton("ADD", 20, 1, "Courier", 
        		bg, fg);  
        
        btn.setBounds(80, 150, 100, 50);
        
        btn.addActionListener(new BtnClick(txtNum1,txtNum2,lblNum3));
        
        f.add(btn);         //adding a new Button.  
        f.add(txtNum1);         //adding a new Button.
        f.add(txtNum2);         //adding a new Button.
        f.add(lblNum1);         //adding a new Button.
        f.add(lblNum2);         //adding a new Button.
        f.add(lblNum3);
        f.setSize(400, 350);        //setting size.  
        f.setTitle("AWT Program Level 3");  //setting title.  
        f.setLayout(null);   //set default layout for frame.  
        f.setVisible(true);  //set frame visibility true.
        
        f.addWindowListener(new MywinLis(f));
    }  
  
	public static void main(String[] args) 
	{    
        AwtProgCalcActionLis2 awt = new AwtProgCalcActionLis2();   //creating a frame  
    }

	
}