package Week1Challenges;

import java.util.Scanner;

/*Write a menu driven program to perform 1. Add Book [Book No, Book Name, Book price],2. 
Display Book 3. Search Book 4. Exit. */

class Book{
	private int BookNo;
	private String BookName;
	private float BookPrice;
	
	public int getBookNo() {
		return BookNo;
	}
	public void setBookNo(int bookNo) {
		BookNo = bookNo;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public float getBookPrice() {
		return BookPrice;
	}
	public void setBookPrice(float bookPrice) {
		BookPrice = bookPrice;
	}
	
	public void display() {
		System.out.println("\nBook No :- " + this.BookNo);
		System.out.println("Book Name :- " + this.BookName);
		System.out.println("Book Price :- " + this.BookPrice);

	}
}

public class Ass1Q6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Book books[] = new Book[20];
		int choice,count=-1;

		do{
		System.out.println("\n1.Add Book [Book No, Book Name, Book price]");
		System.out.println("2.Display Book");
		System.out.println("3.Search Book");
		System.out.println("4.Exit");
		
		System.out.print("Enter Your Choice :- ");
		choice = scan.nextInt();
		
		
		switch(choice) {
		
		case 1:
			if(count < books.length-1) {
				
				Book book = new Book();
				count++;
				System.out.print("\nEnter Book No :-");
				book.setBookNo(scan.nextInt());
				System.out.print("\nEnter Book Name :- ");
				book.setBookName(scan.next());
				System.out.print("\nEnter Book Price :-");
				book.setBookPrice(scan.nextFloat());
				books[count] = book;
				System.out.print("\nBook Added Successfully");
			}
			else {
				System.out.print("You hit cart limit");
			}
		break;
		
		case 2:
			if(count == -1) {
		        System.out.println("No books added yet!");
		    } else {
		        for(int i = 0; i <= count; i++) {  
		            books[i].display();
		            System.out.println("----------------");
		        }
		    }
		    break;
		case 3:
			System.out.print("Enter Book No to Search :-");
			int searchNo = scan.nextInt();
			
			for(Book b : books) {
                if(searchNo==b.getBookNo()) {
                    b.display();
                    break;
                }
                else {
                System.out.println("Book Not Found!");
                }
            }
		break;
		case 4:
			System.out.println("Exiting...");
		break;
		default:
			System.out.println("Invalid Choice!");
		}
		}while(choice!=4);

		scan.close();
	}
}
