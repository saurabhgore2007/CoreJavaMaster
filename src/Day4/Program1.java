package Day4;


/*Create a Student Class
Fields: name, rollNo, marks.
Constructor to initialize values.
Method displayDetails() to print student info.*/

class Student{

	private String name;
	private int rollNo;
	private int marks;
	
	public Student() {
		this.name = "";
		this.rollNo = 0;
		this.marks = 0;
	}
	
	public Student(String name,int rollNo,int marks) {
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}
	
	public void Display() {
		System.out.println("Name of Employee is " + name);
		System.out.println("Roll No of Employee is " + rollNo);
		System.out.println("Marks of Employee is " + marks);

		
	}
}

public class Program1 {

	public static void main(String[] args) {

		Student s1 = new Student("Smith",101,490);
		s1.Display();
	}

}
