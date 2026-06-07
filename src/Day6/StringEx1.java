package Day6;

import java.util.Scanner;

/* WAP to input any string and count number of vowels */

public class StringEx1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str;
		String vowels = "aeiou";
		int count = 0;
		
		System.out.print("Enter String :- ");
		str = scan.next().toLowerCase();
		
		for(int i = 0;i<str.length();i++) {
			for(int j = 0;j<vowels.length();j++) {
				if(str.charAt(i) == vowels.charAt(j)) {
					count++;
				}
			}
		}
		
		System.out.print("Vowel Count in " + str + " is " +count);
		scan.close();
	}

}
