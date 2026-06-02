package Day1;

import java.util.Scanner;

public class add {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1 , num2, addition;
		
		System.out.print("Enter First Number :- ");
		num1 = scan.nextInt();
		
		System.out.print("Enter Second Number :- ");
		num2 = scan.nextInt();
		
		addition = num1 + num2;
		
		System.out.println("Addition Of " + num1 + " + " + num2 + " = " + addition);
		scan.close();
	}
}
