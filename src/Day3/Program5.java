package Day3;

import java.util.Scanner;

/*Program to calculate factorial using recursion.*/

public class Program5 {
	
	public static int factorial(int num) {
		
		if(num==0 || num==1) {
			return 1;
		}
		return num*factorial(num - 1);
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num,fact;
		
		System.out.print("Enter a Number :- ");
		num = scan.nextInt();
		
		fact = factorial(num);
		System.out.print("Factorial of " + num + " is " + fact);

		scan.close();
	}

}
