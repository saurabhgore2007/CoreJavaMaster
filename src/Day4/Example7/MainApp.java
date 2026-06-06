package Day4.Example7;

public class MainApp {

	public static void main(String[] args) {

		BankAccount acc1 = new BankAccount();
		
		acc1.deposite(100);
		System.out.println(acc1);
		
		acc1.withdraw(50);
		System.out.println(acc1);

	}

}
