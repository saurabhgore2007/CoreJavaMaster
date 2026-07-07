package Day22;

interface Animal{
	
	default void eat() {

        before();

        System.out.println("Eating");

        after();

    }

    default void drink() {

        before();

        System.out.println("Drinking");

        after();

    }

    private void before() {

        System.out.println("Wash Hands");

    }

    private void after() {

        System.out.println("Drink Water");

    }

}

class Dog implements Animal{

	
}

public class PrivateMethodsInterfaces {

	public static void main(String[] args) {

		Dog d = new Dog();
		
		d.eat();
		d.drink();
		
		
	}

}
