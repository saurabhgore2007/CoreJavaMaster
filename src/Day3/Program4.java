package Day3;

import java.util.Scanner;

/*Program to reverse an array using a method.*/


public class Program4 {

	public static void reverse(int[] arr) {
		
		int start = 0,end = arr.length -1;
		
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n;
		
		System.out.print("Enter Number of elements in Array :- ");
		n = scan.nextInt();
		
		int[] array = new int[n];
		
		System.out.print("Enter elements to Array :- ");
		for(int i=0;i<n;i++) {
			array[i] = scan.nextInt();
		}
		
		System.out.println("\nArray Elements are :- ");
		for(int x : array) {
			System.out.print(x+",");
		}
		
		reverse(array);
		System.out.println("\nReversed Array is :- ");
		for(int x : array) {
			System.out.print(x+",");
		}
		
		scan.close();
	}

}
