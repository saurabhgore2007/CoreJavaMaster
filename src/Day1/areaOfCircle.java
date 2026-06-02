package Day1;

import java.util.Scanner;

public class areaOfCircle {

	public static void main(String[] args) {
		
		int radius;
		double area,circum;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter radius :- ");
		radius = scan.nextInt();
		
		area = 2*radius*radius*Math.PI;
		circum = 2*radius*Math.PI;
		System.out.println("PI = " + Math.PI);

		System.out.println("Area of Circle :- " + area);
		System.out.println("Circumference of Circle :- " + circum);

		scan.close();
	}
}
