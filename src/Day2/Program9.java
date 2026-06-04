package Day2;

import java.util.Scanner;

/*  Task1
If cost price and selling price of an item is input through the keyboard, write a program to determine 
whether the seller has made profit or incurred loss. Also determine how much profit he made or loss he 
incurred.*/ 

public class Program9 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		float cost_price,sell_price,diff;
		
		System.out.print("Enter Cost Price :- ");
		cost_price = scan.nextFloat();
				
		System.out.print("Enter Selling Price :- ");
		sell_price = scan.nextFloat();
		
		diff = sell_price - cost_price;
		
		if(sell_price > cost_price) {
			System.out.println("Seller made Profit of Rs." + diff);
		}
		else if(sell_price < cost_price) {
			System.out.println("Seller made Loss of Rs." + Math.abs(diff));
		}
		else {
            System.out.println("No Profit, No Loss");
         }
		scan.close();
	}
}
