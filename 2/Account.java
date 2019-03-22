/*
*@author Chelsea Piccirilli
*Lab 2
*Spring 2019
*/

public class Account{
	double balance = 0.00;
	String owner = "";
	int acctNo = 0;


	public void Account(double bal, String owner, int acctno){
		balance = bal;
		owner = owner;
		acctNo = acctno;
	}


	public void Account(){
	}

	public void set_balance(double bal){
		balance = bal;
	}

	public void set_owner(String owner){
		owner = owner;
	}

	public void set_acctNo(int acctno){
		acctNo = acctno;
	}

	public int get_acctNo(){
		return acctNo;
	}

	public String get_owner(){
		return owner;
	}

	public double get_balance(){
		return balance;
	}

	public void deposit(double quantity){
		balance += quantity;
	}

	public void withdraw(double quantity){
		balance-= quantity;
	}

	public void display(){
		System.out.println("Balance: " + balance);
		System.out.println("Owner: " + owner);
		System.out.println("Account #: " + acctNo);

	}

	public static void main(String[] args){

		Account a1;
		a1 = new Account();
		a1.Account(500.00, "Frank", 2222);
		a1.deposit(100.00);
		a1.withdraw(900.00);
		a1.display();
	}
}//End class