package Day1;

import java.util.Scanner;

public class StudentInfo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int rollno,sub1,sub2,sub3,total,average;
		
		System.out.print("Enter Roll no :- ");
		rollno = scan.nextInt();
		System.out.println();

		System.out.print("Enter Subject 1 Marks :- ");
		sub1 = scan.nextInt();
		System.out.println();


		System.out.print("Enter Subject 2 Marks :- ");
		sub2 = scan.nextInt();
		System.out.println();


		System.out.print("Enter Subject 3 Marks :- ");
		sub3 = scan.nextInt();
		System.out.println();

		total = sub1 + sub2 + sub3;
		average = total/3;
		
		System.out.println("Roll Number :- " + rollno);
		System.out.println("Marks of Subject 1 :- " + sub1);
		System.out.println("Marks of Subject 2 :- " + sub2);
		System.out.println("Marks of Subject 3 :- " + sub3);
		System.out.println("Total Marks :- " + total);
		System.out.println("Average Marks :- " + average);


        scan.close();
	}
}
