package Day12;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class _Employee{
	int id;
	String name;
	double salary;
	String department;
	String token;
	
	public _Employee() {
		
	}
	
	public _Employee(int id,String name,double salary,String department) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	@Override
	public String toString() {
		return this.id + " " + this.name + " " + this.salary + " " + this.department + " " + this.token;
	}
}

public class EmpManagement {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random token = new Random();

		List<_Employee> empList = new ArrayList<_Employee>();
		
		Supplier<String> empToken = () -> "Emp" + String.valueOf(1000 + token.nextInt(9000));
		Predicate<_Employee> sal = emp -> emp.salary>5000;
		Consumer<_Employee> print = System.out::println;

		int choice;
		
		do {
		System.out.println("1. Add Employee");
		System.out.println("2. Display Employee");
		System.out.println("3. Print High Salary Employees");
		System.out.println("4. Find Employee");
		System.out.println("5. Exit");


		System.out.print("Enter Your Choice : ");
		choice = scan.nextInt();
		
		switch(choice) {
		
			case 1:	
				_Employee e = new _Employee();
				System.out.println("Enter Employee Id : ");
				e.id = scan.nextInt();
				System.out.println("Enter Employee Name : ");
				e.name = scan.next();
				System.out.println("Enter Employee Department : ");
				e.department = scan.next();
				System.out.println("Enter Employee Salary : ");
				e.salary = scan.nextDouble();
	
				e.token = empToken.get();
				empList.add(e);
				System.out.println("Employee Added Successfully");
			break;
			
			case 2:
				System.out.println("All Employee Details");
				if(empList.isEmpty()) {
				    System.out.println("There is No Employee to Show..");
				}
				else {
					empList.forEach(print);
				}
			break;
			
			case 3:
				if(empList.isEmpty()) {
				    System.out.println("No Employees Found.");
				}
				else {
				for(_Employee emp : empList) {
					if(sal.test(emp))
						System.out.println(emp);
				}
				}
			break;
			
			case 4:
				System.out.println("Enter Employee Id to Search : ");
				int id = scan.nextInt();
				Optional<_Employee> employee = searchEmp(id,empList);

				employee.ifPresent(System.out::println);

				if(employee.isEmpty()) {
				    System.out.println("Employee Not Found.");
				}
				
				
			break;
			case 5:
				System.out.println("Exiting...");
			
			}
		}while(choice!=5);

	}
	
	public static Optional<_Employee> searchEmp(int id, List<_Employee> list){
		for(_Employee emp : list) {
			if(emp.id == id) {
				return Optional.of(emp);
			}
		}
		
		return Optional.empty();
	}
}
