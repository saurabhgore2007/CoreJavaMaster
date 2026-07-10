package Day24.ObserverPattern;

public class SMSObserver implements Observer {

    @Override
    public void update() {

        System.out.println("SMS Sent");

    }
}
