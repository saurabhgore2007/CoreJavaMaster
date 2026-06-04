package Day3;

import java.util.Scanner;

/* Task2
 * Private Members 
A data member Flight number of type integer 
A data member Destination of type string 
A data member Distance of type float 
A data member Fuel of type float 
A member function CALFUEL() to calculate the value of Fuel as per the following criteria 
            Distance                                                         Fuel 
            <=1000                                                            500 
            more than 1000  and <=2000                                       1100 
            more than 2000                                                   2200 
Public Members 
A function FEEDINFO() to allow user to enter values for Flight Number, Destination, Distance & 
call function CALFUEL() to calculate the quantity of Fuel 
A function SHOWINFO() to allow user to view the content of all the data members*/

class Flight{
	Scanner scan = new Scanner(System.in);
	
	private int flight;
	private String destination;
	private float distance;
	private float fuel;
	
	private void CALFUL() {
		if(distance<=1000) {
			fuel = 500;
		}
		else if(distance<=2000) {
			fuel = 1100;
		}
		else{
			fuel = 2200;
		}
	}
	
	public void FEEDINFO() {
		System.out.print("Enter Flight Number :- ");
		flight = scan.nextInt();
		System.out.print("Enter Destination :- ");
		destination = scan.next();
		System.out.print("Enter Distance :- ");
		distance = scan.nextInt();
		
		CALFUL();
	}
	
	public void show() {
		System.out.println("Flight Number : " + flight);
		System.out.println("Destination  : " + destination);
		System.out.println("Distance  : " + distance);
		System.out.println("Fuel Required : " + fuel);
	}
}

public class Program6 {
	
	public static void main(String[] args) {

		Flight f1 = new Flight();
		
		f1.FEEDINFO();
		f1.show();
	
	}

}
