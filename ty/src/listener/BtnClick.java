package listener;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import myComponent.MyLabel;
/**
 * This class is used by AwtProgram3
 * @author arutwar
 *
 */
public class BtnClick implements ActionListener{
	TextField txtNum1;
	TextField txtNum2 ;
	MyLabel lblNum3;
	public BtnClick(TextField t1, TextField t2,MyLabel l3) {
		// TODO Auto-generated constructor stub
		txtNum1 = t1;
		txtNum2 = t2;
		lblNum3 = l3;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		int n1 = Integer.parseInt(txtNum1.getText());
		int n2 = Integer.parseInt(txtNum2.getText());
		int add = n1 +n2;
		lblNum3.setText(" "+add);
	}  

}
