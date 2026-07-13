package Day25.OpenClosedPrinciple;

public class PaymentService {

	private PaymentStrategy strategy;
	
	public PaymentService(PaymentStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void process(double amount) {
		strategy.pay(amount);
	}
}
