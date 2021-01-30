import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Mobilerecharge  implements ActionListener, ItemListener{
	JButton bsubmit,back;
	Choice service1;
	
	Balance balance=new Balance();
	JLabel luser,no,service,heading,loffer,sucess;
	JTextField tuser,tno, offer;
	JFrame f1;
	Mobilerecharge(){
		
		
		 f1=new JFrame("Recharge Your Mobile");
		f1.setVisible(true);
		f1.setSize(1500,1500);
		Panel p1,p2,p3,p4,p5;
		
		p1=new Panel();
		p2=new Panel();
		p3=new Panel();
		p4=new Panel();
		p5=new Panel();
		
		Font font1=new Font("Times New Roman",Font.BOLD+Font.ITALIC,35);
		Font font2=new Font("Times New Roman",Font.BOLD,15);
		
		f1.setLayout(new BorderLayout(20,29));
		f1.add(p1,BorderLayout.CENTER);
		f1.add(p2,BorderLayout.EAST);
		f1.add(p3,BorderLayout.WEST);
		f1.add(p4,BorderLayout.SOUTH);
		f1.add(p5,BorderLayout.NORTH);
		
		p1.setLayout(new GridLayout(1,2));
		p1.setBackground(Color.BLACK);
		Panel p1a,p1b,p1b1;
		p1a=new Panel();
		p1b=new Panel();
		p1b1=new Panel();
		p1b.add(p1b1);
		p1.add(p1a);
		p1b1.setLayout(null);
		p1a.setLayout(null);
		p1b1.setBounds(100,50,500,700);
		p1b1.setBackground(new Color(234, 237, 237));
		p1.add(p1b);
		p1b.setLayout(null);
		JLabel ltext1=new JLabel(new ImageIcon("F:\\Start OF Fifth Semester\\Advance Java\\Adv Programs\\setaslogin4.jpg"),JLabel.RIGHT);
		p1a.add(ltext1);
		ltext1.setBounds(70,50,500,800);
		
		p1a.setBackground(Color.WHITE);
		
	
		p1b.setBackground(Color.white);
		heading=new JLabel("Do Your Recharge Here",JLabel.CENTER);
		heading.setFont(font1);
		luser=new JLabel("Enter Your Name :");
		no=new JLabel("Enter Your Mobile Number :");
		loffer=new JLabel("Select Recharge :");
		p1b1.setFont(font2);
		service=new JLabel("Select Service Provider :"); 
		service1=new Choice();
		service1.add("Airtel");
		service1.add("Jio");
		service1.add("Idea");
		service1.add("BSNL");
		offer=new JTextField(20);
		back=new JButton("BACK");
		bsubmit=new JButton("Submit");
		
		tuser=new JTextField(20);
		tno=new JTextField(20);
		heading.setBounds(100,100,300,60);
		luser.setBounds(100,200,200,50);
		tuser.setBounds(300,200,200,50);
		no.setBounds(100,300,200,50);
		tno.setBounds(300,300,200,50);
		service.setBounds(100,400,200,50);
		service1.setBounds(300,400,200,50);
		
		loffer.setBounds(100,500,200,50);
		offer.setBounds(300,500,200,50);
		back.setBounds(100,570,100,50);
		bsubmit.setBounds(300, 570, 100, 50);
		p1b1.add(heading);p1b1.add(luser);p1b1.add(tuser);p1b1.add(no);p1b1.add(tno);p1b1.add(service);
		p1b1.add(service1);p1b1.add(loffer);p1b1.add(offer);p1b1.add(back);p1b1.add(bsubmit);
//		JLabel limg=new JLabel(new ImageIcon("F:\\Start OF Fifth Semester\\Advance Java\\Adv Programs\\mobile2.jpg"));
//		JLabel limg1=new JLabel(new ImageIcon("F:\\Start OF Fifth Semester\\Advance Java\\Adv Programs\\mobile2.jpg"));
		bsubmit.addActionListener(this);
	//	p1a.add(limg1);
		
		tuser.addActionListener(this);
		tno.addActionListener(this);
		offer.addActionListener(this);
		back.addActionListener(this);
		//service.addComponentListener((ComponentListener) this);
		
	}
	
	WebsiteLogin websiteLogin=new WebsiteLogin("Get Name");
	
	int result;
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		String serviceprovider=service1.getSelectedItem();
		double number = Double.parseDouble(tno.getText());
		String rmobileno=tno.getText();
		int recharge = 0;

		if (!offer.getText().isEmpty() && offer.getText() != null) {
			recharge = Integer.parseInt(offer.getText());
		}

		String mobileno = "9999999999";

		double mobileno1 = Double.parseDouble(mobileno);

		if(e.getSource()==bsubmit) {
		
			if(number>mobileno1) {
				result=JOptionPane.showConfirmDialog(null,"Mobile Number should be 10 Digits ","Invalid Mobile Number",  JOptionPane.DEFAULT_OPTION);
				System.out.println(result);
				
			}
			
			if (tuser.getText().equals(websiteLogin.getSname()) && balance.getBalance() > recharge) {

				int currentbal = balance.getBalance() - recharge;
				balance.setBalance(currentbal);
				result = JOptionPane.showConfirmDialog(null, "Recharge Successfull of Rs" + recharge+"\nNumber - "+rmobileno+"\nService Provider - "+serviceprovider,
						"Recharge Details ",  JOptionPane.DEFAULT_OPTION);
				System.out.println(result);

				if (result == JOptionPane.YES_OPTION) {
					new DashBoard2();
					
				}

			} else {

				result = JOptionPane.showConfirmDialog(null, "Recharge Unsuccessful!!", "Recharge Details ",
						JOptionPane.DEFAULT_OPTION);
				System.out.println(result);
			}
		}
		if(e.getSource()==back) {
			new DashBoard2();
			
		}
		
		
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String args[]) {
		new Mobilerecharge();
	}
	
	
	
	
	
}