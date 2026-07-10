package Day24.ObserverPattern;

public class EmailObserver implements Observer {

	@Override
	public void update() {

        System.out.println("Email Sent");

	}
}
