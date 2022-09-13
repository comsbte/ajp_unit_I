package unit_I;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;  
  
 /**
  *  In this program AwtProgram2 class implements ActionListener.
  *  
  *  This class implements actionPerformed(ActionEvent e) method.
  *  Which is used to execute when button is pressed.
  *  
  *  so this object is passed in btn.addActionListener(this);
  * @author arutwar
  *
  */
public class AwtProgram2 implements ActionListener{ 
	/**Below three objects are required in 
	 * actionPerformed(ActionEvent e)
	 * method so they are declared as class variable 
	 *  
	 */
	class InnerAdapter extends WindowAdapter {
		Frame f;
		public InnerAdapter(Frame f)
		{
			this.f = f;
		}
		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("windowClosing In Inner Class");
			f.dispose();
		}
	}
	
	TextField txtNum1;
	TextField txtNum2 ;
	MyLabel lblNum3;
	
	public AwtProgram2()  
    {  
		Frame f = new Frame();
		Color bg = new Color(0, 255, 0);
		Color fg = new Color(0, 0, 255);
		
		 txtNum1 = new TextField();
		 txtNum2 = new TextField();
		
		MyLabel lblNum1 = 
				new MyLabel("Number 1",12,1,"Courier",bg,fg);
		
		MyLabel lblNum2 = 
				new MyLabel("Number 2",12,1,"Courier",bg,fg);
		
		lblNum3 = 
				new MyLabel("",20,1,"Courier",Color.cyan,
						Color.RED);
		
		txtNum1.setBounds(70, 40, 100, 40);
		txtNum2.setBounds(70, 90, 100, 40);
		lblNum1.setBounds(10, 40, 100, 40);
		lblNum2.setBounds(10, 90, 100, 40);
		lblNum3.setBounds(80, 200, 200, 50);
        
		MyButton btn =new MyButton("ADD", 20, 1, "Courier", 
        		bg, fg);  
        
        btn.setBounds(80, 150, 100, 50);  
        btn.addActionListener(this);
        f.add(btn);         //adding a new Button.  
        f.add(txtNum1);         //adding a new Button.
        f.add(txtNum2);         //adding a new Button.
        f.add(lblNum1);         //adding a new Button.
        f.add(lblNum2);         //adding a new Button.
        f.add(lblNum3);
        f.setSize(400, 350);        //setting size.  
        f.setTitle("AWT Program Level 2");  //setting title.  
        f.setLayout(null);   //set default layout for frame.  
        f.setVisible(true);  //set frame visibility true.
        
        f.addWindowListener(new WindowAdapter() {
        	@Override
    		public void windowClosing(WindowEvent e) {
    			System.out.println(
    					"windowClosing In anonymous Class");
    			f.dispose();
    		}
		});
    }  
  
	public static void main(String[] args) 
	{    
        AwtProgram2 awt = new AwtProgram2();   //creating a frame  
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		
		int n1 = Integer.parseInt(txtNum1.getText());
		int n2 = Integer.parseInt(txtNum2.getText());
		int add = n1 +n2;
		lblNum3.setText("Addition is = "+add);
	}  
}