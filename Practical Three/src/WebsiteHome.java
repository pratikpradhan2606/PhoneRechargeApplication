
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class WebsiteHome extends JFrame implements ActionListener{

	Panel panel,pcenter,pcenter2;
	JLabel heading,llogin,lregister,west1,west2,west3;
	
	JButton exit,login,register;

	Font f2=new Font("Times New Roman",Font.BOLD|Font.ITALIC,15);
	Font f3=new Font("Times New Roman",Font.BOLD,15);
	Color c12=new Color(234, 237, 237 );
	Color c3=new Color(0, 255, 0, 0 );
    
	
		WebsiteHome(){
		
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setVisible(true);
			setSize(1500, 1500);
			setTitle("Home Page");
			panel = new Panel();
			pcenter = new Panel();
			pcenter2 = new Panel();

			add(panel);

			Font f1 = new Font("Times New Roman", Font.BOLD + Font.ITALIC, 30);

			panel.setLayout(null);
			pcenter.setLayout(null);
			pcenter2.setLayout(null);
			pcenter.setBounds(500, 250, 400, 300);
			pcenter2.setBounds(0, 0, 1500, 1500);

			panel.add(pcenter);
			panel.add(pcenter2);

			heading = new JLabel("Welcome To SkyLimit.in", JLabel.CENTER);
			exit = new JButton("Exit");
			login = new JButton(" Login ");
			register = new JButton(" Register ");
			llogin = new JLabel("Already Have an Account ? ", JLabel.CENTER);
			lregister = new JLabel("Don't Have an Account ? ", JLabel.CENTER);

			JLabel img1 = new JLabel(
					new ImageIcon("F:\\Start OF Fifth Semester\\Advance Java\\Adv Programs\\final5.jpg"), JLabel.RIGHT);
			JLabel img = new JLabel(
					new ImageIcon("F:\\Start OF Fifth Semester\\Advance Java\\Adv Programs\\final3.jpg"), JLabel.RIGHT);

			heading.setBounds(0, 50, 400, 100);
			exit.setBounds(200, 400, 100, 40);
			login.setBounds(50, 230, 100, 50);
			llogin.setBounds(0, 160, 200, 40);
			register.setBounds(250, 230, 100, 50);
			lregister.setBounds(200, 160, 200, 40);

			// Set Font
			heading.setFont(f1);
			llogin.setFont(f2);
			lregister.setFont(f2);
			login.setFont(f3);
			register.setFont(f3);

			heading.setForeground(Color.black);

			// set background
			exit.setBackground(Color.WHITE);

			login.setBackground(c12);
			register.setBackground(c12);
			panel.setBackground(c3);
			pcenter.setBackground(c3);

			pcenter.add(heading);
			pcenter.add(exit);
			pcenter.add(login);
			pcenter.add(llogin);
			pcenter.add(register);
			pcenter.add(lregister);
			pcenter.add(img1);
			pcenter2.add(img);

			exit.addActionListener(this);
			login.addActionListener(this);
			register.addActionListener(this);

			img1.setBounds(0, 0, 400, 300);
			img.setBounds(0, 0, 1400, 800);
		}

		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == exit) {
				System.exit(1);
				dispose();
			}
			if (e.getSource() == login) {
				login.setBackground(Color.GRAY);
				new WebsiteLogin();
				dispose();
			}
			if (e.getSource() == register) {
				new Registeration();
				dispose();
			}

		}

		public static void main(String args[]) {

			new WebsiteHome();
		}

}