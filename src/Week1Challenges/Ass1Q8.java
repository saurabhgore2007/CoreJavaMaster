package Week1Challenges;

import java.util.Scanner;

/*WAP to Ask the user to enter the number for 5 times. Calculate the Addition of those numbers 
which are divisible by 3. and Display Factorial of those numbers which are divisible by 2. i.e even.*/

public class Ass1Q8 {
	
	public static  int factorial(int num) {
		int fact = 1;
		for(int i=1;i<=num;i++) {
			fact *= i;
		}
		return fact;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		System.out.print("Enter 5 Numbers :- ");
		for(int i = 0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		
		int addition = 0;
		for(int j = 0;j<arr.length;j++) {
			if(arr[j]%3==0) {
				addition +=arr[j];
			}
			if(arr[j]%2==0) {
				System.out.println("Factorial of " + arr[j] +" is " + factorial(arr[j]));
			}
		}
		System.out.print("Addition of those numbers which are divisible by 3 is " + addition);
		scan.close();
	}
	

}
