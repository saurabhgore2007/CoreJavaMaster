package Day25.OpenClosedPrinciple;

public class UPIPayment implements PaymentStrategy{

	@Override
	public void pay(double amount) {
        System.out.println("UPI Payment :- " + amount);
	}
}
