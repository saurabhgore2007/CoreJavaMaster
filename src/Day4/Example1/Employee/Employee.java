package Day4.Example1.Employee;

import java.util.Scanner;

public class Employee {

	public int id;
	public String name;
	public double salary;
	
	public void addEmployee() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter id :- ");
		id = scan.nextInt();
		
		System.out.println("Enter name :- ");
		name = scan.next();
		
		System.out.println("Enter salary :- ");
		salary = scan.nextDouble();
//		scan.close();
	}
	
}
