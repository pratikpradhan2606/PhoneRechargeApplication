/*Code Developed by
 * Name - Pratik Nanasaheb Pradhan
 * Enrollment No - 1810510350
 */
import java.awt.*;
import javax.swing.*;
public class GridLayoutDemo {
	JButton button[];
	GridLayout gl;
	GridLayoutDemo(){
		Frame f1=new Frame("GridLayout Demo");
		f1.setVisible(true);
		f1.setSize(400,200);
		//GridLayout Adds COmponents with fix size
		gl=new GridLayout(3,2,10,10);
		f1.setLayout(gl);
		button=new JButton[5];
		int k=1;
		for(int i=0;i<button.length;i++) {
			button[i]=new JButton("Button "+Integer.toString(k));
			f1.add(button[i]);
			k++;
		}
		
		
		
	}
	
	public static void main(String[] args) {
		new GridLayoutDemo();
	}

}
