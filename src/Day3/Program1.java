package Day3;

import java.util.Scanner;

/* Task1
 * Define a class BOOK with the following specifications 
Private members of the class BOOK are 
BOOK NO : integer type 
BOOKTITLE : 20 characters 
PRICE  : float (price per copy) 
TOTAL_COST() : A function to calculate the total cost for N number of copies where N is passed 
to the  function as argument 
 
Public members of the class BOOK are 
INPUT()  : function to read BOOK_NO. BOOKTITLE, PRICE 
PURCHASE() : function to ask the user to input the number of copies to be purchased. It  
invokes  TOTAL_COST() and prints the total cost to be paid by the user.  
Note : You are also required to give detailed function definitions*/ 

class Book{
	Scanner scan = new Scanner(System.in);

	private int BookNo;
	private String BookTitle;
	private float price;
	
	private float Total_Cost(int n) {
		return n*price;
	}
	
	public void INPUT() {		
		System.out.print("Enter Book No. :- ");
		BookNo = scan.nextInt();
		System.out.print("Enter Book Title. :- ");
		BookTitle = scan.next();
		System.out.print("Enter Book Price. :- ");
		price = scan.nextFloat();
	}
	
	public void PURCHASE() {
		System.out.print("Enter Number of Copies To Be Purchase :- ");
		int copies = scan.nextInt();
		
		float total = Total_Cost(copies);
		System.out.println("Book No : " + BookNo);
		System.out.println("Book Title : " + BookTitle);
		System.out.println("Book Price : " + price);
		System.out.println("Number of Copies Purchased : " + copies);
		System.out.println("Total cost to be paid : " + total);
	}
}

public class Program1 {


	public static void main(String[] args) {

		Book book1 = new Book();
		Book book2 = new Book();

		book1.INPUT();
		book1.PURCHASE();
		book2.INPUT();
		book2.PURCHASE();

	}
}
