package unit_I;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
/**
 * This class is used by AwtProgram2 and AwtProgram3 
 * @author arutwar
 *
 */
public class MyButton extends Button{
	/**
	 * 
	 * @param title
	 * @param fontSize
	 * @param style : 1->Itallic , 2-> Bold, other -> plain
	 * @param fontName
	 * @param backgroungColor
	 * @param foreGroundColor
	 */
	 public MyButton(String title, int fontSize, 
			 int style, String fontName, 
			 Color backgroungColor, Color foreGroundColor) {
		
		 Font myFont;
		 if(style==1)
			 myFont = new Font(fontName, Font.ITALIC,fontSize);
		 else if(style==2)
			 myFont = new Font(fontName, Font.BOLD,fontSize);
		 else
			 myFont = new Font(fontName, Font.PLAIN,fontSize);
		 
		 setFont(myFont);
		 setLabel(title);
		 setBackground(backgroungColor);
		 setForeground(foreGroundColor);
	}
}
