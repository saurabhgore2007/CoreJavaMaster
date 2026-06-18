package Day12;

import java.util.function.Consumer;

class Employee {

    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {

        this.id = id;
        this.name = name;
        this.salary = salary;

    }

    @Override
    public String toString() {

        return id + " " + name + " " + salary;

    }
}

public class ConsumerEx {

	public static void main(String[] args) {

		Employee e1 = new Employee(101, "Saurabh", 50000);

		Employee e2 = new Employee(102, "Rahul", 70000);

		Employee e3 = new Employee(103, "Amit", 45000);
		
		Consumer<Employee> printEmp = emp -> System.out.println(emp);
		Consumer<Employee> printEmpSal = emp -> System.out.println(emp.salary);
		
		Consumer<Employee> bonus = emp -> System.out.println("Id : " + emp.id +" Bonus : "+ (emp.salary + 5000));


		printEmp.accept(e1);
		printEmp.accept(e2);
		printEmp.accept(e3);
		
		printEmpSal.accept(e1);

		
		bonus.accept(e3);

	}

}
