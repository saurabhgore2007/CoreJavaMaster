package Day13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee{
	int id;
	String name;
	double salary;
	String department;
	
	public Employee() {
		
	}
	
	public Employee(int id,String name,double salary,String department) {
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

public class StreamApiEx2 {

	public static void main(String[] args) {

//		Q.1 Print in ascending order.
		List<Integer> nums = Arrays.asList(5,8,2,9,1,6);
		System.out.println("Ascending Order");
		nums.stream().sorted().forEach(System.out::println);;
		
//		Q.2 Print the same list in descending order.
		System.out.println("Descending Order");
		nums.stream().sorted((a,b) -> b-a).forEach(System.out::println);;

//		Q.3 Print alphabetically.
		List<String> studNames =Arrays.asList(
				"Saurabh",
				"Rahul",
				"Sachin",
				"Amit",
				"Shreyas");
		studNames.stream().sorted((s1,s2) -> s2.compareTo(s1)).forEach(System.out::println);

		/*
		 * Using your _Employee class, Sort by salary (ascending). Then try sorting by
		 * name (alphabetically).
		 */
	List<Employee> empList = Arrays.asList(
				
				new Employee(101,"Smith",10000,"I.T"),
				new Employee(102,"Amit",15000,"C.S"),
				new Employee(103,"Shubham",20000,"H.R"),
				new Employee(104,"John",15000,"Electronics"),
				new Employee(105,"Josh",160000,"CEO"),
				new Employee(106,"Smith",60000,"I.T")
				);
	
		empList.stream().sorted((s1,s2) -> Double.compare(s1.salary, s2.salary)).forEach(System.out::println);
		System.out.println();
		empList.stream().sorted((s1,s2) -> s1.name.compareTo(s2.name)).forEach(System.out::println);
//
		
	}

}
