/*Code Developed by
 * Name - Pratik Nanasaheb Pradhan
 * Enrollment No - 1810510350
 */

import java.awt.*;
public class DemoGridLayout extends Frame {

	DemoGridLayout(){
		super("Grid 5*5");
		setVisible(true);
		setSize(500,500);
		Button b1[]=new Button[25];
		GridLayout gl=new GridLayout(5,5);
		setLayout(gl);
		int k=1;
		for(int i=0;i<b1.length;i++) {
			//Converts int to string and initializes each button
			b1[i]=new Button(Integer.toString(k));	
			add(b1[i]);
			if(i%2==0) {
				b1[i].setBackground(Color.black);
				b1[i].setForeground(Color.WHITE);
				
			}else {
				b1[i].setBackground(Color.WHITE);
				
			}
			k++;
		}
		
	}
	
	
	public static void main(String[] args) {
		new DemoGridLayout();
	}

}
