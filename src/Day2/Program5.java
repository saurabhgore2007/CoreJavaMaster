package Day2;

import java.util.Scanner;

/*Program to print a multiplication table (1–10) using for loop.*/

public class Program5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		System.out.print("Enter Number For Multiplication Table :- ");
		int num = scan.nextInt();
		
		System.out.println("Multiplication table of " + num);
		
		for(int i = 1; i <= 10 ; i++) {
			System.out.println(num*i);
		}
		
		scan.close();
	}
}
