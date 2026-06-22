package Day13;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamAPIEx4 {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(10,20,30,40);
		int sum = nums.stream().reduce(0, Integer::sum);
		System.out.println("Sum :- "+sum);
		
		List<Integer> numbers = Arrays.asList(2,3,4);
		int prod = numbers.stream().reduce(1, Math::multiplyExact);
		System.out.println("Product :- "+ prod);

		List<String> line = Arrays.asList("Java","8","Streams");
		String join = line.stream().reduce("", (s1,s2) -> s1+" "+s2);
		System.out.println("Join line :- "+ join);
		
		List<Employee> empList = Arrays.asList(
				
				new Employee(101,"Smith",10000,"I.T"),
				new Employee(102,"Amit",15000,"C.S"),
				new Employee(103,"Shubham",20000,"H.R"),
				new Employee(104,"John",15000,"Electronics"),
				new Employee(105,"Josh",160000,"CEO"),
				new Employee(106,"Smith",60000,"I.T")
				);

		//Reduce
		Optional<Employee> minSal = empList.stream().reduce((e1,e2) -> e1.salary<e2.salary?e1:e2);
		minSal.ifPresent(System.out::println);
		
		//collect
		List<Employee> highSalary = empList.stream().filter(e -> e.salary > 50000).collect(Collectors.toList());
		System.out.println(highSalary);
		
		List<String> names = empList.stream().map(e -> e.name).collect(Collectors.toList());
		System.out.println("Names :- " + names);
		
		List<String> depts = empList.stream().map(e -> e.department).distinct().collect(Collectors.toList());
		System.out.println("Departments" + depts);

		Set<String> dept = empList.stream().map(e -> e.department).collect(Collectors.toSet());
		System.out.println("Set of Dept :- " + dept);

		String name = empList.stream().map(e -> e.name).collect(Collectors.joining(", "));
		System.out.println("Concatenated Name :- " + name);
		
		double avg = empList.stream().collect(Collectors.averagingDouble(e -> e.salary));
		System.out.println("Average :- " + avg);

		double salSum = empList.stream().collect(Collectors.summingDouble(e -> e.salary));
		System.out.println("Salary Sum :- " + salSum);
		
		double count = empList.stream().collect(Collectors.counting());
		System.out.println("Employee Count :- " + count);

		Map<String,List<Employee>> map = empList.stream().collect(Collectors.groupingBy(e -> e.department));
		
		for(String _dept : map.keySet()) {
			System.out.println(_dept);
			for(Employee item:map.get(_dept))
			{
				System.out.println(item);
			}
		}
		
		//flatMap
		List<List<Integer>> list = Arrays.asList(
			    Arrays.asList(1,2),
			    Arrays.asList(3,4),
			    Arrays.asList(5,6)
			);
		list.stream().flatMap(l -> l.stream()).forEach(System.out::println);
		
		//Collectors.mapping()
		Map<String, List<String>> maping =
			    empList.stream()
			           .collect(Collectors.groupingBy(
			               e -> e.department,
			               Collectors.mapping(
			                   e -> e.name,
			                   Collectors.toList()
			               )
			           ));
		System.out.println(maping);

		//summarizingDouble()
		DoubleSummaryStatistics stats =empList.stream().collect(Collectors.summarizingDouble(e -> e.salary));
		System.out.println(stats);
		
		//partitioningBy()
		Map<Boolean, List<Employee>> maped = empList.stream().collect(Collectors.partitioningBy(e -> e.salary > 50000));
		
		
		for(Boolean key:maped.keySet()) {
			System.out.println(key);
			for(Employee emp:maped.get(key))
			{
				System.out.println(emp);
			}
		}
	}

}
