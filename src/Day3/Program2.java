package Day3;

import java.util.Scanner;

/*Write a method to calculate the sum of elements in an array.*/

public class Program2 {

	public static int sum(int[] arr) {
		int sum = 0;
		for(int x : arr) {
			sum += x;
		}
		return sum;
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n,total;
		System.out.print("Enter number of elements In array :- ");
		n = scan.nextInt();
		int[] array = new int[n];
		
		System.out.print("Enter Array elements :- ");
		for(int i=0;i<n;i++) {
			array[i] = scan.nextInt();
		}
		
		System.out.println("Array Elements are :- ");
		for(int x : array) {
			System.out.print(x+",");
		}
		total = sum(array);
		System.out.println("\nArray Sum :- " + total);
		scan.close();

	}
}