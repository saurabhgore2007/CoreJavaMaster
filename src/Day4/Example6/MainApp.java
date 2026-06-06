package Day4.Example6;

import Day4.Example6.Greet.GreetingMessage;

public class MainApp {

	public static void main(String[] args) {

		//calling Child class default Constructor as well as Parent class Default Constructor
			GreetingMessage g1 = new GreetingMessage();
			System.out.println(g1);
				
			GreetingMessage g2 = new GreetingMessage("Excellent");
			System.out.println(g2);
				
			GreetingMessage g3 = new GreetingMessage("Fantastic", "Hello Java");
			System.out.println(g3);
	}

}
