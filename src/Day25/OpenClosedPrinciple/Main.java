package Day25.OpenClosedPrinciple;

public class Main {

	public static void main(String[] args) {

		PaymentStrategy strategy = new UPIPayment();
		
		PaymentService service = new PaymentService(strategy);
		
		service.process(10000);
	}

}
