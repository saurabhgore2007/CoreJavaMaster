package Day2;

import java.util.Scanner;

/* Program to find the largest of 3 numbers using if–else.*/

public class Program1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1,num2,num3;
		
		System.out.print("Enter First Number :- ");
		num1 = scan.nextInt();
		
		System.out.print("Enter Second Number :- ");
		num2 = scan.nextInt();
		
		System.out.print("Enter Third Number :- ");
		num3 = scan.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println(num1 + " is Largest than " + num2 + " and " + num3);
		}
		else if(num2 > num1 && num2 > num3) {
			System.out.println(num2 + " is Largest than " + num1 + " and " + num3);
		}
		else {
			System.out.println(num3 + " is Largest that " + num1 + " and " + num2);
		}
		
		scan.close();
	}
}
