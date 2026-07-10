package Day24.ObserverPattern;

public class InventoryObserver implements Observer {

    @Override
    public void update() {

        System.out.println("Inventory Updated");

    }
}