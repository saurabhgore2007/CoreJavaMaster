package Day24.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class OrderService {

	private List<Observer> observers = new ArrayList<>();
	
	public void addObserver(Observer observer) {

		observers.add(observer);
	}
	
	public void notifyObservers() {
		
		for(Observer observer : observers){

            observer.update();

        }
	}
	
	public void placeOrder(){

        System.out.println("Order Placed");

        notifyObservers();

    }
}
