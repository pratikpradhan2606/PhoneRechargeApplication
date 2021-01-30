/*Code Developed by
 * Name - Pratik Nanasaheb Pradhan
 * Enrollment No - 1810510350
 */
import java.awt.*;
public class Button0to9 extends Frame {

	Button0to9(){
		super("Button 0 to 9");
		setVisible(true);
		setSize(500,500);Button b1[]=new Button[10];
		GridLayout gl=new GridLayout(4,3);
		setLayout(gl);
		
		for(int i=0;i<b1.length;i++) {
			//Converts int to string and initializes each button
			b1[i]=new Button(Integer.toString(i));	
			add(b1[i]);
			if(i%2==0) {
				b1[i].setBackground(Color.BLUE);
				b1[i].setForeground(Color.WHITE);
				
			}else {
				b1[i].setBackground(Color.YELLOW);
				
			}
		}
		
		
	}
	public static void main(String[] args) {
			new Button0to9();

	}

}

