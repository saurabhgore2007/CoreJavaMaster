package Day4.Example7;

public class BankAccount {

	private long accountNumber;
	private double balance;
	
	public BankAccount() {
		accountNumber = (long)(Math.random()*100);
		balance = 0;
	}
	
	public void deposite(double amt) {
		balance += amt;
		System.out.println(amt + " Deposited Successfully.");
	}
	
    public void withdraw(double amt) {
    	balance -= amt;
		System.out.println(amt + " Withdraw Successfully.");
	}
    
    @Override
    public String toString() {
    	return "Account Number :" + accountNumber + "\nBalance is " + balance;
    }
}
