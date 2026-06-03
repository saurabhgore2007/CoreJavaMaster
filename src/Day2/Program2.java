package Day2;

import java.util.Scanner;

// Input price and qty, calculate bill amount with discount of 5.00% if price is greater than or equal to 50 


public class Program2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		float price = 0.0f ,qty = 0.0f;
		float total;
		
		System.out.print("Enter price :- ");
		price = scan.nextFloat();
		
		System.out.print("Enter Quantity :- ");
		qty = scan.nextFloat();
		
		total = price*qty;
		
		if(total >= 50.00) {
			total -= 5.00f/100*total;
		}
		
		System.out.print("Total :- " + total);

		scan.close();
	}
}
