package unit_I;

import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
/**
 * This class is used by AwtProgram2 and AwtProgram3 
 * @author arutwar
 *
 */
public class MyLabel extends Label {
	/**
	 * 
	 * @param title
	 * @param fontSize
	 * @param style : 1->Itallic , 2-> Bold, other -> plain
	 * @param fontName
	 * @param backgroungColor
	 * @param foreGroundColor
	 */
	public MyLabel(String title, int fontSize, 
			 int style, String fontName, 
			 Color backgroungColor, Color foreGroundColor) {
		// TODO Auto-generated constructor stub
		
		Font myFont;
		 if(style==1)
			 myFont = new Font(fontName, Font.ITALIC,fontSize);
		 else if(style==2)
			 myFont = new Font(fontName, Font.BOLD,fontSize);
		 else
			 myFont = new Font(fontName, Font.PLAIN,fontSize);
		 
		 setFont(myFont);
		 setText(title);
		 setBackground(backgroungColor);
		 setForeground(foreGroundColor);
	}
}
