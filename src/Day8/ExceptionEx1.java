package Day8;

import java.util.Scanner;

public class ExceptionEx1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num,diviser;
		
		System.out.print("Enter a Number :- ");
		num = scan.nextInt();
		
		System.out.print("Enter a Diviser :- ");
		diviser = scan.nextInt();
		
		try {
			float ans = num/diviser;
			System.out.println("division is : " + ans);
		}
		catch(ArithmeticException ex) {
			System.out.println("Cannot Divide By Zero");
		}

		System.out.println("\nAll lines in a programming successfully interpreted");
		scan.close();
	}

}
