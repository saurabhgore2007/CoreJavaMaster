package Day2;

import java.util.Scanner;

/*Input an alphabet and check whether it is vowel or consonant.*/ 

public class Program4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		char ch;
		
		System.out.print("Enter a character :- ");
		ch = scan.next().charAt(0);
		
		ch = Character.toLowerCase(ch);
		
		if(ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ) 
			System.out.println(ch + " is Vowel.");
		
		else if (ch >= 'a' && ch <= 'z') 
            System.out.println(ch + " is a Consonant.");
		
		else 
			System.out.println("Invalid Input! Enter an Alphabate.");

		
		scan.close();
	}
}
