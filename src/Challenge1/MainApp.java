package Challenge1;

import Challenge1.Roles.Person;
import Challenge1.Roles.Professor;
import Challenge1.Roles.Staff;
import Challenge1.Roles.Student;

public class MainApp {

	public static void main(String[] args) {
		
		Person[] person = new Person[3];
		
		Student s = new Student();
		Professor p = new Professor();
		Staff staff = new Staff();
		
		s.setId(101);
		s.setName("Amit");
		s.setAge(20);
		s.setSemister(4);
		s.setFeesPaid(20000);
		
		p.setId(201);
		p.setAge(30);
		p.setName("Smith");
		p.setSalary(50000);
		p.setPublications(10);
					
		staff.setId(301);
		staff.setAge(40);
		staff.setName("John");
		staff.setSalary(10000);
		staff.setDepartment("C.S");
		
		person[0] = s;
		person[1] = p;
		person[2] = staff;
		
		for(Person people : person) {
			
		    people.displayDetails();
		}
		
		System.out.println(person[0].getCount());

	}
}
