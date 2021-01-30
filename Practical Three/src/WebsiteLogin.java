
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class WebsiteLogin extends JFrame implements ActionListener {
	JLabel heading, lregister, luser, lpass, sucess, ltext;
	JTextField tuser;
	TextField tpass;
	JButton exit, register, login;
	public static String sname;
	public static String spass;

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSpass() {
		return spass;
	}

	public void setSpass(String spass) {
		this.spass = spass;
	}

	WebsiteLogin(String getUsername) {
		// getSname();
	}

	Panel panel;
	Font f2 = new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15);
	Font f3 = new Font("Times New Roman", Font.BOLD, 15);
	JLabel ltext1;
	Panel p1, p2, p3, p4, p5;

	WebsiteLogin() {

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

		// set font
		Font font = new Font("Times New Roman", Font.BOLD + Font.ITALIC, 30);

		Panel p1a = new Panel();
		Panel p1b = new Panel();
		Panel p1a1 = new Panel();
		p1.setLayout(new GridLayout(1, 2));
		p1.add(p1a);
		p1a.setLayout(null);
		p1a.add(p1a1);
		p1.add(p1b);
		p1b.setLayout(null);
		p1a.setBackground(Color.white);
		p1b.setBackground(Color.white);
		p1a1.setBounds(0, 50, 600, 700);
		ltext1 = new JLabel(new ImageIcon("F:\\Start OF Fifth Semester\\Advance Java\\Adv Programs\\setaslogin5.jpeg"),
				JLabel.RIGHT);
		ltext = new JLabel("                   Login Here....");
		p1b.add(ltext);
		p1b.add(ltext1);

		ltext.setFont(font);

		ltext.setForeground(Color.white);
		ltext1.setBounds(0, 50, 600, 700);
		ltext.setBounds(140, 300, 600, 100);

		setVisible(true);
		setSize(1500, 1500);
		setTitle("Login Page");
		p1.add(p1a);

		Font f1 = new Font("Times New Roman", Font.BOLD, 40);
		p1a1.setLayout(null);

		heading = new JLabel("Login Into Your Account ", JLabel.CENTER);
		exit = new JButton("Back");
		register = new JButton(" Back ");
		lregister = new JLabel("Dont Have an Account ? ", JLabel.CENTER);

		luser = new JLabel(" UserName : ", JLabel.LEFT);
		lpass = new JLabel(" Password : ", JLabel.LEFT);
		tuser = new JTextField(20);
		tpass = new TextField(20);
		tpass.setEchoChar('*');
		login = new JButton(" Login ");
		tpass.setFont(new Font("ALGERIAN", Font.BOLD, 25));
		heading.setBounds(0, 50, 700, 200);
		luser.setBounds(100, 250, 200, 40);
		tuser.setBounds(250, 250, 200, 40);
		lpass.setBounds(100, 350, 150, 40);
		tpass.setBounds(250, 350, 200, 40);
		login.setBounds(180, 450, 100, 50);
		exit.setBounds(350, 450, 100, 50);
		heading.setFont(f1);
		lregister.setFont(f2);
		register.setFont(f3);
		login.setFont(f3);

		register.setBackground(Color.white);

		p1a1.add(heading);
		p1a1.add(luser);
		p1a1.add(tuser);
		p1a1.add(lpass);
		p1a1.add(tpass);
		p1a1.add(exit);

		p1a1.add(login);
		Color c12 = new Color(234, 237, 237);
		p1a1.setBackground(c12);
		login.addActionListener(this);
		exit.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public void actionPerformed(ActionEvent e) {

		int result;

		if (e.getSource() == login) {
			
			sname = tuser.getText();
			spass = tpass.getText();
			
			// sname.equals("pratik") && spass.equals("123")
			Registeration registeration = new Registeration("get regi name and pass");
			String regiName = registeration.getRegiName();
			String regiPass = registeration.getRegipass();

			if ((sname.equals(regiName) && spass.equals(regiPass))) {

				setSname(regiName);
				setSpass(regiPass);
				ltext.setText("Login Successful!!!!");
				result = JOptionPane.showConfirmDialog(null, "Login Succssful!!  " + regiName+"\n\nDo You Want to Proceed ?", "Login Details",
						JOptionPane.YES_NO_OPTION);
				System.out.println(result);

				System.out.println("Login Successful....");
				System.out.println("Correct Password and UserName");

				if (result == JOptionPane.YES_OPTION) {
					new DashBoard2();
				}
			} else if ((sname.equals("pratik") && spass.equals("123"))) {

				ltext.setText("Login Successful!!!!");

				result = JOptionPane.showConfirmDialog(null, "Login Successful!  " + sname+"\n\nDo You Want to Proceed ?", "Login Details ",
						JOptionPane.OK_OPTION);
				System.out.println(result);
				System.out.println("Login Successful....");
				System.out.println("Correct Password and UserName");

				if (result == JOptionPane.YES_OPTION) {

					new DashBoard2();
				}

			} else {
				result = JOptionPane.showConfirmDialog(null, "Login Unsuccessful!  ", "Unauthorized Credentials ",
						JOptionPane.CLOSED_OPTION);
				System.out.println(result);

				ltext.setText("Login Unsuccessful! Try Again...");
				System.out.println("Please Check your Password and UserName");
			}
		}
		if (e.getSource() == exit) {

			dispose();
			new WebsiteHome();
		}
	}

	public static void main(String agr[]) {
		new WebsiteLogin();
	}

	public String getUser() {
		// TODO Auto-generated method stub
		return null;
	}
}