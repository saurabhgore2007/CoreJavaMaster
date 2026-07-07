package Day22;

record Student(int id, String name, String course) {
	
	public Student{
		if(id < 0) {
			throw new IllegalArgumentException("Id must be greater than 0");
		}
		
		if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }

        if (course == null || course.isBlank()) {
            throw new IllegalArgumentException("Course cannot be empty");
        }

        System.out.println("Student Record Created Successfully.");
	}
	
	public void display() {
        System.out.println("Student : " + name + " | Course : " + course);
    }

    @Override
    public boolean equals(Object obj) {

        System.out.println("Custom equals() Executed");

        if (this == obj)
            return true;

        if (!(obj instanceof Student other))
            return false;

        // Compare only id
        return this.id == other.id;
    }
}

public class RecordExample {

	public static void main(String[] args) {

		 Student s1 = new Student(1, "Rahul", "Java");

	     Student s2 = new Student(1, "Saurabh", "Spring Boot");

	     Student s3 = new Student(2, "Amit", "React");
	     
	     System.out.println();

	     System.out.println("Id      : " + s1.id());
	     System.out.println("Name    : " + s1.name());
	     System.out.println("Course  : " + s1.course());	     
	     
	     s1.display();
	     System.out.println();
	     System.out.println(s1);
	     System.out.println();
	     
	     System.out.println(s1.equals(s2));

	     System.out.println(s1.equals(s3));

	     System.out.println();
	      
	     System.out.println(s1.hashCode());
	     System.out.println(s2.hashCode());
	     System.out.println(s3.hashCode());

	}

}
