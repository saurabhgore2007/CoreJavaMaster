package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class _Employee{
	int id;
	String name;
	double salary;
	String department;
	
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
		return this.id + " " + this.name + " " + this.salary + " " + this.department ;
	}
}

public class Program3 {

	public static void main(String[] args) {

		List<_Employee> empList = Arrays.asList(
				
				new _Employee(101,"Smith",10000,"I.T"),
				new _Employee(102,"Amit",15000,"C.S"),
				new _Employee(103,"Ajit",15000,"H.R"),
				new _Employee(104,"John",15000,"Electronics"),
				new _Employee(105,"Josh",160000,"CEO"),
				new _Employee(106,"Smith",60000,"I.T")
				);
		
		//1.Group employees by department.
		Map<String,List<_Employee>> byDept = empList.stream().collect(Collectors.groupingBy(e -> e.department));
		System.out.println("\nDepartment Wise Employee's");
		for(String dept: byDept.keySet()) {
			System.out.println(dept);
			System.out.println("---------------");
			for(_Employee emp:byDept.get(dept)) {
				System.out.println(emp);
			}
		}
		
		//2.Find the highest-paid employee.
		Optional<_Employee> highest = empList.stream().max((e1,e2) -> Double.compare(e1.salary, e2.salary));
		System.out.println("\nHighest-paid employee.");
		highest.ifPresent(System.out::print);
		
		//3.Partition employees by salary.
		Map<Boolean,List<_Employee>> part = empList.stream().collect(Collectors.partitioningBy(e -> e.salary>30000));
		System.out.println("\nPartition employees by salary.");
		for(Boolean is: part.keySet()) {
			System.out.println(is);
			System.out.println("---------------");
			for(_Employee emp:part.get(is)) {
				System.out.println(emp);
			}
		}

		
		//4.Sort by salary and then by name.
		List<_Employee> sorted = empList.stream().sorted(Comparator.comparingDouble((_Employee e) -> e.salary).thenComparing((_Employee e) -> e.name)).toList();
		System.out.println("\nSort by salary and then by name.");
		sorted.forEach(System.out::println);
	
		//5.Collect only employee names into a list.
		List<String> names = empList.stream().map(e -> e.name).collect(Collectors.toList());
		System.out.println("\nCollect only employee names into a list.");
		names.forEach(System.out::println);
		
		//6.Join all employee names into one string.
		String name = empList.stream().map(e -> e.name).collect(Collectors.joining(" "));
		System.out.println("\nJoin all employee names into one string.");
		System.out.println("Name :- " + name);

		//7.Filter employees by department.
		System.out.println("\nFilter employees by department.");
		empList.stream().filter(e -> e.department.equals("I.T")).forEach(System.out::println);;
	}
}
