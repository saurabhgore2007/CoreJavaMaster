package Day10;

import java.util.ArrayList;
import java.util.Scanner;

//Assignment: WAP to define arraylist. store 10 integers and find how many are prime numbers in arraylist

public class ArrayListEx2 {

	public static boolean prime(int num) {
		
		int count=0;

		if (num <= 1) {
            return false;
        }
		
		for(int j = 2;j<=Math.sqrt(num);j++) {
			if(num%j==0) {
				count++;	
			}
			
		}
		
		if(count !=0) {
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		ArrayList<Integer> arr = new ArrayList<Integer>();


		System.out.print("Enter number of Elements :- ");
		int n = scan.nextInt();
		
		for(int i=0;i<n;i++) {
			arr.add(scan.nextInt());
		}
				
		System.out.println("Prime Numbers are :- ");
		for(int x : arr) {
			if(prime(x)) {
				System.out.println(x);
			}
		}
		
		scan.close();
	}
}
	

