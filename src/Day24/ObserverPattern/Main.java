package Day24.ObserverPattern;

public class Main {

	public static void main(String[] args) {

		 OrderService service = new OrderService();

	        service.addObserver(new EmailObserver());

	        service.addObserver(new SMSObserver());

	        service.addObserver(new InventoryObserver());

	        service.placeOrder();
	}

}
