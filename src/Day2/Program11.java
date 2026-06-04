package Day2;

import java.util.Scanner;

/* Write a program to check whether a triangle is valid or not, when the three angles of the triangle are 
entered through the keyboard. A triangle is valid if the sum of all the three angles is equal to 180 degrees*/

public class Program11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	
		int A,B,C;
		
		System.out.print("Enter Angle A :- ");
		A = scan.nextInt();
		System.out.print("Enter Angle B :- ");
		B = scan.nextInt();
		System.out.print("Enter Angle C :- ");
		C = scan.nextInt();
		
		if((A+B+C) == 180) 
			System.out.print("The Triangle is Valid.");
		else
			System.out.print("The Triangle is Not Valid.");
		
		scan.close();
	}

}
