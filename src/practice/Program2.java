package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee>{

    int id;
    String name;
    String department;
    double salary;

    Employee(int id,
             String name,
             String department,
             double salary){

        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary;
    }

    @Override
    public String toString(){
        return id+" "+name+" "+department+" "+salary;
    }

	@Override
	public int compareTo(Employee o) {

		return Integer.compare(this.id, o.id);
	}
        
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
	        return true;

	    if (obj == null)
	        return false;

	    if (!(obj instanceof Employee))
	        return false;

	    Employee emp = (Employee) obj;

	    return this.id == emp.id;
	}
}

public class Program2 {

	public static void main(String[] args) {

		List<Employee> list = Arrays.asList(
				new Employee(101, "Amit" ,"IT" ,55000),
				new Employee(102, "Rahul" ,"HR" ,45000),
				new Employee(103, "Virat" ,"IT" ,75000),
				new Employee(104, "Ajay" ,"Sales" ,35000),
				new Employee(105, "Saurabh" ,"IT" ,75000),
				new Employee(106, "Neha" ,"HR" ,65000)

				);
//		Print all employees.
		System.out.println("Employee Details");
		list.forEach(System.out::println);
	
//		Print employees whose salary is greater than 50000.
		System.out.println("employees whose salary is greater than 50000");
		list.stream().filter(e -> e.salary>50000).forEach(System.out::println);
		
//		Print only employee names.
		System.out.println("Print only employee names");
		list.stream().map(e -> e.name).forEach(System.out::println);

//		Print only employee departments.
		System.out.println("Print only employee departments.");
		list.stream().map(e -> e.department).forEach(System.out::println);
		
//		Increase every salary by 5000 and print.
		System.out.println("Increase every salary by 5000 and print");
		list.stream().map(e -> e.salary + 5000).forEach(System.out::println);
		
//		Sort employees by salary.
		System.out.println("Sort employees by salary.");
		list.stream().sorted((e1,e2) -> Double.compare(e1.salary, e2.salary)).forEach(System.out::println);

//		Sort employees by name.
		System.out.println("\nSort employees by name.");
		list.stream().sorted((e1,e2) -> e1.name.compareTo(e2.name)).forEach(System.out::println);
	
//		Sort employees by name.
		System.out.println("\nSort employees by name.");
		list.stream().sorted((e1,e2) -> e1.name.compareTo(e2.name)).forEach(System.out::println);

//		Sort employees by Salary then Name
		System.out.println("\nSort employees by name.");
		list.stream().sorted(Comparator.comparingDouble((Employee e) -> e.salary).thenComparing(e -> e.name)).forEach(System.out::println);

//		Sort employees by Department then Salary then Name
		System.out.println("\nSort employees by Department then Salary then Name.");
		list.stream().sorted(Comparator.comparing((Employee e )-> e.department).thenComparingDouble((Employee e) -> e.salary).thenComparing(e -> e.name)).forEach(System.out::println);

		System.out.println("\nSorted By Id using Comparable");
		Collections.sort(list);
		list.forEach(System.out::println);
		
//		Without changing Comparable,sort employees by salary.
		System.out.println("\nSorted By salary using Comparator");
		Collections.sort(list, (e1,e2) -> Double.compare(e1.salary,e2.salary));
		list.forEach(System.out::println);
		
		
	}

}
