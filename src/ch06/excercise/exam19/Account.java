package ch06.excercise.exam19;

public class Account {
	private int balance;
	
	public Account() {}
	           
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		if(balance < 0) {
			return;
		} else if(balance > 1000000) {
			return;
		}
		this.balance = balance;
	};
	
	
	
	
}
