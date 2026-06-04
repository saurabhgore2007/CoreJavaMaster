package Day2;

import java.util.Scanner;

/*Program to create a simple calculator using switch Statement.*/

public class Program8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num1,num2;
		char ch;
		
		System.out.print("Enter Values and Operator in Format x operator y :- ");
		num1 = sc.nextInt();
		ch = sc.next().charAt(0);
		num2 = sc.nextInt();		
				
		switch(ch) {
			    
			case '+':
				System.out.println("Addition of " + num1 + " + " + num2 + " is " + (num1 + num2));
			break;
			case '-':
				System.out.println("Subtraction of " + num1 + " - " + num2 + " is " + (num1 - num2));
			break;
			case '*':
				System.out.println("Multiplication of " + num1 + " * " + num2 + " is " + (num1 * num2));
			break;
			case '/':
				if (num2 != 0)
			        System.out.println("Division of " + num1 + " / " + num2 + " is " + (num1 / num2));
			    else
			        System.out.println("Error: Division by zero!");			break;
			case '%':
				System.out.println("Modulus of " + num1 + " % " + num2 + " is " + (num1 % num2));
			break;
			default:
				System.out.println("Invalid Input!Please Enter Valid Operator");
			
			}
		
		sc.close();
	}
}
