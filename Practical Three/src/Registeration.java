import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Registeration  extends JFrame implements ActionListener
{
	JLabel heading,luser,lpass,sucess,ltext,lgender,lcity;
	Checkbox male,female;
	CheckboxGroup cbg;
	JTextField tuser,tno,tcity;
	TextField tpass;
	JButton exit,register1;
	String sname,spass;
	Panel panel;
	Font f2=new Font("Times New Roman",Font.BOLD|Font.ITALIC,15);
	Font f3=new Font("Times New Roman",Font.BOLD,15);
	
	public static String regiName;
	public static String regipass;
	public static String getRegiName() {
		return regiName;
	}
	public static void setRegiName(String regiName) {
		Registeration.regiName = regiName;
	}
	public static String getRegipass() {
		return regipass;
	}
	public static void setRegipass(String regipass) {
		Registeration.regipass = regipass;
	}

	
	Registeration(String getname){
		
	}
	
	Registeration(){
		
		Panel p1, p2, p3, p4, p5;

		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		p4 = new Panel();
		p5 = new Panel();
	
		setLayout(new BorderLayout(20, 29));
		add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.EAST);
		add(p3, BorderLayout.WEST);
		add(p4, BorderLayout.SOUTH);
		add(p5, BorderLayout.NORTH);
		Panel p1a = new Panel();
		Panel p1a1 = new Panel();

		Panel p1b = new Panel();
		p1.setLayout(new GridLayout(1, 2));
		p1.add(p1a);
		p1a.setLayout(null);
		p1a.add(p1a1);
		p1a1.setLayout(null);
		JLabel img = new JLabel(
				(new ImageIcon("F:\\Start OF Fifth Semester\\Advance Java\\Adv Programs\\registration1.jpg")));
		img.setBounds(0, 150, 700, 400);
		p1b.add(img);
		p1.add(p1b);
		p1b.setLayout(null);
		p1a1.setBackground(Color.white);
		p1b.setBackground(Color.WHITE);

		ltext = new JLabel("Register Here");
		p1b.add(ltext);

		Font font = new Font("Times New Roman", Font.BOLD + Font.ITALIC, 30);
		ltext.setFont(font);

		ltext.setForeground(Color.white);
		ltext.setBounds(150, 300, 500, 100);

		setVisible(true);
		setSize(1500, 1500);
		setTitle("Home Page");
		p1.add(p1a);
		p1a1.setBounds(15,20,620, 630);
		p1a1.setBackground(new Color(234, 237, 237));
	
		p1a.setLayout(null);

		heading = new JLabel("       Register To SkyLimit.in", JLabel.LEFT);
		exit = new JButton("Back");
		
		cbg=new CheckboxGroup();
		luser = new JLabel("Enter UserName : ", JLabel.LEFT);
		lpass = new JLabel("Enter Password : ", JLabel.LEFT);
		JLabel no = new JLabel("Enter Mobile No: ", JLabel.LEFT);
		male=new Checkbox("Male",false,cbg);
		female=new Checkbox("Female",false,cbg);
		tuser = new JTextField(20);
		lgender=new JLabel("Select Gender: ",JLabel.LEFT);
		tpass = new TextField(10);
		tpass.setEchoChar('*');
		tpass.setFont(new Font("ALGERIAN", Font.BOLD, 20));
		JTextField tf1 = new JTextField(20);
		register1 = new JButton(" Register Here ");
		register1.setBackground(Color.white);

		lcity=new JLabel(" Enter City: ",JLabel.LEFT);
		tcity=new JTextField(20);
	//	p1a1.add(tf1);
		tno = new JTextField(10);
		
		p1a1.add(no);
		p1a1.add(tno);
		heading.setBounds(40, 0, 600, 100);
		luser.setBounds(120, 120, 200, 40);
		tuser.setBounds(270, 120, 200, 40);
		lpass.setBounds(120, 220, 100, 40);
		tpass.setBounds(270, 220, 200, 40);
		no.setBounds(120, 320, 200, 40);
		tno.setBounds(270, 320, 200, 40);
		lgender.setBounds(120,420,100,40);
		male.setBounds(270, 420, 50, 40);
		female.setBounds(370,420,70,40);
		lcity.setBounds(120,500,100,40);
		tcity.setBounds(270,500,200,40);
		register1.setBounds(120,580, 150, 50);
		exit.setBounds(320, 580, 150, 50);
		heading.setFont(new Font("ALGERIAN", Font.BOLD, 30));
		register1.setFont(f3);
	
		heading.setForeground(Color.BLACK);
		exit.setBackground(Color.WHITE);
		
	
		
		p1a1.add(heading);
		p1a1.add(luser);
		p1a1.add(tuser);
		p1a1.add(lpass);
		p1a1.add(tpass);
		p1a1.add(lgender);
		p1a1.add(male);
		p1a1.add(female);
		p1a1.add(lcity);
		p1a1.add(tcity);
		
		
		p1a1.add(exit);
		p1a1.add(register1);

		register1.addActionListener(this);
		exit.addActionListener(this);
		tno.addActionListener(this);
		p1.setBackground(Color.white);
		p1a.setBackground(Color.white);
		register1.setBackground(Color.white);
	}
	public void actionPerformed(ActionEvent e){	
		setRegiName(regiName);
		setRegipass(regipass);
		String sname=tuser.getText();
		String spass=tpass.getText();
		setRegiName(sname);
		setRegipass(spass);
		
		if(e.getSource()==exit){
			new WebsiteHome();
		}	
		
		if(e.getSource()==register1){
		
				if (!sname.isEmpty() && sname != null && !spass.isEmpty()) {
					WebsiteLogin websiteLogin=new WebsiteLogin("Get Name");
					websiteLogin.setSname(sname);
					
					
					int result=JOptionPane.showConfirmDialog(null,"Wow Registration Successful!!! ","Great!!", JOptionPane.YES_NO_OPTION);
					System.out.println(result);
					if(result==JOptionPane.YES_OPTION) 
					new WebsiteLogin();
				} else {
					int result=JOptionPane.showConfirmDialog(null,"Registration Unsuccessful!! Try Again","Failed", JOptionPane.CLOSED_OPTION);
					System.out.println(result);
				}

		}
		
		
	

	}
	public static void main(String args[]) {
		new Registeration();
	}
}