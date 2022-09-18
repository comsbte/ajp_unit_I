package unit_I;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

import myComponent.MywinLis;  
 
/**
 * This is basic program without action for Button.
 * With null layout
 * @author arutwar
 *
 */
  
public class AwtProgram1 {  
	public AwtProgram1()  
    {  
		Frame f = new Frame("Add Calculator"); 
		
		TextField txtNum1 = new TextField();
		TextField txtNum2 = new TextField();
		Label lblNum1 = new Label("Number 1");
		Label lblNum2 = new Label("Number 2");
		
		txtNum1.setBounds(70, 40, 100, 40);
		txtNum2.setBounds(90, 90, 100, 40);
		lblNum1.setBounds(10, 40, 100, 40);
		lblNum2.setBounds(30, 90, 100, 40);
		
        Button btn=new Button("ADD");  
        btn.setBounds(80, 150, 100, 50);  
        f.add(btn);         //adding a new Button.  
        f.add(txtNum1);         //adding a new Button.
        f.add(txtNum2);         //adding a new Button.
        f.add(lblNum1);         //adding a new Button.
        f.add(lblNum2);         //adding a new Button.
        f.setSize(600, 250);        //setting size.
        f.setLocation(200,200);
        f.setTitle("AWT Program Level 1");  //setting title.  
        f.setLayout(null);   //set default layout for frame.  
        f.setVisible(true);  //set frame visibility true.
        MywinLis w = new MywinLis(f);
        f.addWindowListener(w);
    }  
  
	public static void main(String[] args) 
	{    
        AwtProgram1 awt = new AwtProgram1();   //creating a frame  
    }  
}