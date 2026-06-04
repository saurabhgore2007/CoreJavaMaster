package Day2;

import java.util.Scanner;

/*Input a  number and display whether it is Odd or Even.*/  
public class Program3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
				
		System.out.print("Enter a Number :- ");
		int num = scan.nextInt();
		
		
		if(num % 2 == 0) 
			System.out.println(num + " is Even");
		else 
			System.out.println(num + " is Odd");
		
		
		scan.close();
	}
}
