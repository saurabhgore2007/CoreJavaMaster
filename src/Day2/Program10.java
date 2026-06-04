package Day2;

/*Any year is input through the keyboard. Write a program to determine whether the year is a leap year or 
not. (Hint: Use the % (modulus)*/

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a Year to check It is Leap or Not :- ");
		int year = scan.nextInt();
		
		if((year % 4 ==0 && year%100 != 0) || year % 400 == 0 ) {
			System.out.print(year + " is a Leap Year");

		}
		else {
			System.out.print(year + " is Not a Leap Year");
		}
	}

}
