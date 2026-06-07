package Week1Challenges;

import java.util.Scanner;

/*WAP to input width and height of a rectangle and calculate the area and perimeter.  
[Area of rectangle: width*height, Perimeter of rectangle: 2*width+2*height]*/

public class Ass1Q1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		float width,height,area,perimeter;
		
		System.out.print("Enter Width :- ");
		width = scan.nextFloat();
		
		System.out.print("Enter Height :- ");
		height = scan.nextFloat();
		
		area = width*height;
		perimeter = 2*width+2*height;

		System.out.println("Enter Area Of Rectangle :- " + area);
		System.out.println("Enter Primeter Area Of Rectangle :- " + perimeter);
	}

}
