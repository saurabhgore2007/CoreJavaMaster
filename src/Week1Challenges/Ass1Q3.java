package Week1Challenges;

import java.util.Scanner;

/*WAP to input inches from the user and convert it into yards, feet.*/

public class Ass1Q3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		float inch,yard,feet;
		
		System.out.print("Enter Inch :- ");
		inch = scan.nextFloat();
		
		yard = inch*0.027f;
		feet = inch*0.083f;
		
		System.out.println(inch + " Inch = " + yard + " Yards");
		System.out.println(inch + " Inch = " + feet + " Feet");

		scan.close();
	}

}
