package Day6;

import java.util.Scanner;

/* Assignment : WAP to input any String. 
 * Count and print total number of capital alphabates,small alphabates, digits and special characters including symbols, space etc.  */

public class StringEx2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	
		String str;
		int capital = 0,small = 0,digits = 0,spacial = 0;
		
		System.out.print("Enter String :- ");
		str = scan.nextLine();

		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(ch>='A' && ch<='Z')
				capital++;
			else if(ch>='a' && ch<='z')
				small++;
			else if(ch>='0' && ch<='9')
				digits++;
			else
				spacial++;
		}
		
		System.out.println("Capital Alphabates Count : " + capital);
		System.out.println("Small Alphabates Count : " + small);
		System.out.println("Digit Alphabates Count : " + digits);
		System.out.println("Spacial Alphabates Count : " + spacial);
		
		scan.close();
	}

}
