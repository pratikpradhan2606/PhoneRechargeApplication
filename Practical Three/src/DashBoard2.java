import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class DashBoard2 extends WebsiteLogin implements ActionListener {

	Panel panel;
	JButton brecharge, bbalance,blogout,blank1,blank2,donate;
	JTextArea message;
	JLabel user=new JLabel();
	JLabel heading,showbalance,mybal;
	JLabel tusername=new JLabel("");
	JTextField tamt=new JTextField(10);
	JLabel checkbal,amount, news;
	
	Mobilerecharge mb=null;
	

	DashBoard2(){
		
		
		Frame f1=new Frame();	

		panel=new Panel();
		f1.add(panel);
		f1.setLayout(null);
		panel.setBounds(400,70,500,50);
		
		Font fcr=new Font("Times New Roman",Font.BOLD+Font.ITALIC,25);
		Font fnews=new Font("ALGERIAN",Font.BOLD+Font.ITALIC,27);
		Font fheading=new Font("Times New Roman",Font.BOLD+Font.ITALIC,30);
		Font fbuttons=new Font("Times New Roman",Font.BOLD+Font.ITALIC,15);
		
		brecharge=new JButton("MOBILE RECHARGE");
		bbalance=new JButton("BALANCE");
		blogout=new JButton("LOGOUT");
		blank1=new JButton("");
		blank2=new JButton("EXIT");
		checkbal=new JLabel("Balance is:");
		
		//Donation Block
		
		Panel pdonate=new Panel();
		pdonate.setLayout(null);

		donate=new JButton("Donate");
		//To display message about donation
		message=new JTextArea(300,100);
		amount=new JLabel("If You Wish Please Donate Amount :",JLabel.LEFT);
		news=new JLabel("Donate For Nation,One Day Nation will Donate For You!!!",JLabel.CENTER);
		f1.add(pdonate);
		pdonate.setBounds(450,180,900,500);

		Color b=new Color(30,0,10,200);
		pdonate.setBackground(b);
		pdonate.add(message);
		pdonate.add(news);
		pdonate.add(amount);
		pdonate.add(tamt);
		news.setBounds(0,0,900,50);
		
		message.setBounds(20,80,450,300);
	
		news.setFont(fnews);
		
		news.setForeground(Color.WHITE);
		
		
		//Heading section 
		
		heading=new JLabel("Welcome To SkyLimit Site",JLabel.CENTER);
		panel.add(heading);
		heading.setForeground(Color.BLACK);
		heading.setBounds(0,0,500,60);
		heading.setFont(fnews);
		

		tusername.setText(username);
		f1.add(tusername);
		JLabel loginuser=new JLabel("Logined User:");
		f1.add(loginuser);
		loginuser.setForeground(Color.white);
		loginuser.setBounds(1100,30,200,40);
		tusername.setBounds(1250,30,200,40);
		tusername.setForeground(Color.white);
		tusername.setFont(fcr);
	

		
		//setBackground color for label and button 
		setBackGroundColor();	
		donate.setFont(fbuttons);
		bbalance.setFont(fbuttons);
		blogout.setFont(fbuttons);
		blank2.setFont(fbuttons);
		brecharge.setFont(fbuttons);

		
		panel.setLayout(null);
		loginuser.setFont(fcr);
		f1.add(bbalance);
		f1.add(luser);
//		luser.setBounds(10,10,100,100);
		pdonate.add(donate);
		f1.add(brecharge);
		donate.setBounds(700,400,150,50);
		amount.setBounds(0,400,500,50);
		tamt.setBounds(500,400,150,50);
		donate.setFont(fheading);
		tamt.setFont(fheading);
		amount.setFont(fheading);
		amount.setForeground(Color.WHITE);
		
		f1.add(blogout);
		f1.add(blank2);
		
		bbalance.setBounds(100,300,200,50);
		brecharge.setBounds(100,400,200,50);
		blogout.setBounds(100,500,200,50);
		blank2.setBounds(100,600,200,50);
	
		JLabel limg=new JLabel(new ImageIcon("F:\\Start OF Fifth Semester\\Advance Java\\Adv Programs\\placeimage.jpg"));

		Font f10=new Font("Times New Roman",Font.BOLD+Font.ITALIC,20);
	
		
		
		panel.add(limg);
		panel.add(checkbal);
		checkbal.setBounds(200,200,200,100);


		//Register Event
		setListeners();
		

		
		//Sector Center
		panel.setBackground(Color.BLACK);
		mybal=new JLabel(" ");
		mybal.setForeground(Color.white);
		panel.add(mybal);
		mybal.setFont(f10);
		mybal.setFont(fheading);
		mybal.setBounds(200,300,100,100);
		//new WebsiteLogin();

		//-----------------------------------------------------------------------
		f1.setVisible(true);
		f1.setSize(1500,1000);
		f1.setTitle("SkyLimit.in DashBoard");
		panel.setBackground(Color.white);
		
		JLabel img1=new JLabel(new ImageIcon("F:\\Start OF Fifth Semester\\Advance Java\\Adv Programs\\donation4.jpg"));
		pdonate.add(img1);
		img1.setBounds(420,80,460,300);
		
		JLabel img2=new JLabel(new ImageIcon("F:\\Start OF Fifth Semester\\Advance Java\\Adv Programs\\finald4.jpg"),JLabel.RIGHT);
		img2.setBounds(0,0,1900,1100);
		pdonate.add(img2);
		message.setText("\n\t        Please Read Once\n\n\nDue to this COVID-19 Situation wolrd is under critical situtaion.. \nSome peoples are dealing with their poverty Some are under dipression \n       We are the part of NGO who try to help the needy people by just\n          helping them with giving some needful resources.....\n       we will request you , if possible please donate something\n       from yourself it is like you try to help others everything\n          in this world will help you in your difficult time\n          And you want to be the part of OUR NGO please \n          contact us we will always welcome you Thank You .....\n           Please Donate the Amount in Below Section...... \n \t         Thank You !!");
		message.setFont(fbuttons);
		message.setForeground(Color.white);
		message.setBackground(new Color(1,1,1,(float)0.01));
		
		
		JLabel img=new JLabel(new ImageIcon("F:\\Start OF Fifth Semester\\Advance Java\\Adv Programs\\wallpaper5.jpg"),JLabel.RIGHT);
		img.setBounds(0,0,1930,1230);
		f1.add(img);
		f1.setBackground(Color.black);
		
		message.setEditable(false);
	}



	private void setListeners() {
		blank1.addActionListener(this);
		bbalance.addActionListener(this);
		blogout.addActionListener(this);
		brecharge.addActionListener(this);
		blank2.addActionListener(this);
		tamt.addActionListener(this);
		donate.addActionListener(this);
		
	}



	private void setBackGroundColor() {
		brecharge.setBackground(Color.white);
		bbalance.setBackground(Color.white);
		blank1.setBackground(Color.white);
		blank2.setBackground(Color.white);
		donate.setBackground(Color.white);
		
		blogout.setBackground(Color.white);	
		brecharge.setForeground(Color.black);
		donate.setForeground(Color.black);
		bbalance.setForeground(Color.black);
		blogout.setForeground(Color.black);	
		blank1.setForeground(Color.black);	
		blank2.setForeground(Color.black);
	}
	
	
	
	Balance balance=new Balance();
	WebsiteLogin websiteLogin=new WebsiteLogin("Get Name");
	String username=websiteLogin.getSname();
	
	public void actionPerformed(ActionEvent e){
			//Do Donation
		if(e.getSource()==donate) {
			
			if(tamt!=null) {
				
				
				int amount = Integer.parseInt(tamt.getText());

				if (balance.getBalance() > amount) {

					int currentbal = balance.getBalance() - amount;
					int result=JOptionPane.showConfirmDialog(null,"Thank You So Much For Donating","Donation Successful ", JOptionPane.DEFAULT_OPTION);
					System.out.println(result);
					
					balance.setBalance(currentbal);
					news.setForeground(Color.YELLOW);
					news.setText("Thank You So Much For Donating!!");

				} else {

					news.setText("You are not Having Sufficient Balance!!");
					news.setForeground(Color.RED);
				}
			}
		}
		//Check balance
		if(e.getSource()==bbalance) {
	
			Balance balance=new Balance();
			balance.printbal();
			int result=JOptionPane.showConfirmDialog(null,"Your Balance is "+Integer.toString(balance.getBalance()),"Balance Details ", JOptionPane.DEFAULT_OPTION);
			System.out.println(result);
			
		}
		
		//Logout will bring you to homepage
		if(e.getSource()==blogout) {
			
				
				int	result=JOptionPane.showConfirmDialog(null,"Do You Want to Log Out  "+websiteLogin.getSname(),"LogOut ", JOptionPane.YES_OPTION);
				System.out.println(result);
			if(result==JOptionPane.YES_OPTION)
			{
				new WebsiteHome();
				setVisible(false);
			}	
			
		}
		//Exit From Application
		if(e.getSource()==blank2) {
			dispose();
			
				luser.setText(websiteLogin.getSname());
				int	result=JOptionPane.showConfirmDialog(null,websiteLogin.getSname()+" Thanks For Visiting\n\tSkyLimit.in !!  ","You Are Leaving ", JOptionPane.DEFAULT_OPTION);
				System.out.println(result);
				if(result==JOptionPane.OK_OPTION) {
					setVisible(false);
					System.exit(1);
				}
		}
		if(e.getSource()==brecharge) {
			new Mobilerecharge();
		}
		
			
	}
	
	
public static void main(String args[]) {
		new DashBoard2();
	}
	
}