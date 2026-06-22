package Day13;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task1 {

	public static void main(String[] args) {

		List<Employee> empList = Arrays.asList(
				
				new Employee(101,"Smith",10000,"I.T"),
				new Employee(102,"Amit",15000,"C.S"),
				new Employee(103,"Shubham",20000,"H.R"),
				new Employee(104,"John",15000,"Electronics"),
				new Employee(105,"Josh",160000,"CEO"),
				new Employee(106,"Smith",60000,"I.T")
				);

		//1.Print the first 2 employees.
		System.out.println("1.Print the first 2 employees.");
		empList.stream().limit(2).forEach(System.out::println);
		
		//2.Skip the first employee and print the rest.
		System.out.println("\n2.Skip the first employee and print the rest.");
		empList.stream().skip(1).forEach(System.out::println);

		//3.Count employees whose salary is greater than 50000.
		System.out.println("\n3.Count employees whose salary is greater than 50000.");
		long count = empList.stream().filter(e -> e.salary > 50000).count();
		System.out.println(count);

		//4.Check if any employee belongs to the "IT" department.
		System.out.println("\n4.Check if any employee belongs to the \"IT\" department.");
		boolean result = empList.stream().anyMatch(e -> e.department.equals("I.T"));
		System.out.println(result);

		//5.Check if all employees have salary greater than 30000.
		System.out.println("\n5.Check if all employees have salary greater than 30000.");
		boolean result1 = empList.stream().allMatch(e -> e.salary > 30000);
		System.out.println(result1);

		//6.Find the employee with the highest salary using max().
		System.out.println("\n6.Find the employee with the highest salary using max().");
		Optional<Employee> maxSal = empList.stream().max((e1,e2) -> Double.compare(e1.salary, e2.salary));
		System.out.println(maxSal.orElse(new Employee()));
		
		//6.Find the employee with the highest salary using max().
		System.out.println("\n6.Find the employee with the highest salary using max().");
		Optional<Employee> minSal = empList.stream().min((e1,e2) -> Double.compare(e1.salary, e2.salary));
		System.out.println(minSal.orElse(new Employee()));

	}

}
