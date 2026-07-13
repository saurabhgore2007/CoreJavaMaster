package Day25.OpenClosedPrinciple;

public class WalletPayment implements PaymentStrategy{

	@Override
	public void pay(double amount) {
        System.out.println("Wallet Payment :- " + amount);
	}
}
