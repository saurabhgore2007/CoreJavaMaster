package Day2;

import java.util.Scanner;

/*Program to print Fibonacci series using do–while.*/

public class Program7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int f1=0,f2=1,count = 1;

		System.out.print("Enter a Number :- ");
		int num = scan.nextInt();
		
		System.out.print("Fibonacci Series Of " + num + "\n");

		System.out.print(0);

		do {
			int temp = f1 + f2;
			f1 = f2;
			f2 = temp;
			System.out.print(" " + f1);

            count++;
		}
		while(count<=num-1);
		
		scan.close();

	}

}
