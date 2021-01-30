
public class Balance  {

	public static int balance=5000;
	Balance(){}
	Balance(int bal){
		setBalance(bal);
		
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void printbal() {
		  DashBoard2 dashBoard1=new DashBoard2();
		  dashBoard1.mybal.setText("Balance is :"+Integer.toString(balance));
	}
	
	
}
