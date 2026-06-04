package Day2;

import java.util.Scanner;

/*Program to calculate factorial using while.*/

public class Program6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double num,fact = 1 ,i=1;
		
        System.out.print("Enter a non-negative integer: ");
		num = scan.nextInt();
		
		if(num < 0) {
			System.out.println("Invalid Input! Please Enter a Number.");
			return;
		}
		while(i<=num) {
			fact *= i;
			i++;
		}
		
		System.out.print("Factorial of " + num + " is " + fact);
		scan.close();
	}
}
