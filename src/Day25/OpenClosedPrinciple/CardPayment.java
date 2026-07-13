package Day25.OpenClosedPrinciple;

public class CardPayment implements PaymentStrategy{

	@Override
	public void pay(double amount) {
        System.out.println("Card Payment :- " + amount);
	}
	
}
