package Day4.Example1;

import Day4.Example1.Employee.Employee;

public class MainApp {

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		emp1.addEmployee();
		
        Employee emp2 = new Employee();
		emp2.addEmployee();
		
		System.out.println("Details Of Emoplyee 1");
		System.out.println("Id :- " + emp1.id);
		System.out.println("Name :- " + emp1.name);
		System.out.println("Salary :- " + emp1.salary);
		
		System.out.println("\nDetails Of Emoplyee 2");
		System.out.println("Id :- " + emp2.id);
		System.out.println("Name :- " + emp2.name);
		System.out.println("Salary :- " + emp2.salary);

	}

}
