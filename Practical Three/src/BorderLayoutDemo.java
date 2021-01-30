/*Code Developed by
 * Name - Pratik Nanasaheb Pradhan
 * Enrollment No - 1810510350
 */
import java.awt.*;
public class BorderLayoutDemo extends Frame{

	Button bnorth,beast,bsouth,bwest,bcenter;
	
	BorderLayoutDemo(){
		
		setVisible(true);
		setSize(500,500);
		BorderLayout bl=new BorderLayout();	//no space in between regions
		setLayout(bl);
		beast=new Button("East");
		bnorth=new Button("North");
		bwest=new Button("West");
		bsouth=new Button("South");
		bcenter=new Button("Center");
		
		add(bnorth,BorderLayout.NORTH);	//Adds at north region
		add(bsouth,BorderLayout.SOUTH);	//Adds at South region
		add(beast,BorderLayout.EAST);	//Adds at East region
		add(bwest,BorderLayout.WEST);	//Adds at West region
		add(bcenter,BorderLayout.CENTER);//Adds at Center region
		
		
		
	}

	public static void main(String[] args) {
		new BorderLayoutDemo();
	}

}
