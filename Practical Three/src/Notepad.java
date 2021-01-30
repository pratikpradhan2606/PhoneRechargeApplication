import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Notepad extends Frame implements ActionListener {
		
		Menu m1,m2,m3,m4;
		MenuItem m11,m12,m21,m22,m23;
		JTextArea ta;
		MenuBar mb;
		Notepad(){
			
			
			super("Notepad");
			setVisible(true);
			setSize(500,500);
		//	setDefaultCloseOption(EXIT_ON_CLOSE);
		 mb=new MenuBar();
			setMenuBar(mb);
			m1=new Menu("File");
			m2=new Menu("Edit");
			m3=new Menu("Format");
		
			ta = new JTextArea(5,5);
			add(ta);
			mb.add(m1);
			mb.add(m2);
			
			mb.add(m3);
			
			m11=new MenuItem("New");
			m12=new MenuItem("Open");
			
			m1.add(m11);
			m1.add(m12);
			
			m21=new MenuItem("Cut");
			m22=new MenuItem("Copy");
			m23=new MenuItem("Paste");
			
			m2.add(m21);
			m2.add(m22);
			m2.add(m23);
			
			m21.addActionListener(this);
			m22.addActionListener(this);
			m23.addActionListener(this);
		}
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==m11) {
				int result=JOptionPane.showConfirmDialog(this,"Save??");
				System.out.println(result);
				
			}
			if(e.getSource()==m21) {
				ta.cut();
			}
			if(e.getSource()==m22) {
				ta.paste();
			}
		}
		public static void main(String args[]) {
			new Notepad();
		}
}
