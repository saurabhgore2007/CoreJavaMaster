package Day20;

class Student {

    int age = 20;

}

public class StackHeapDemo {

	public static void main(String[] args) {

		 Student s = new Student();

	     System.out.println(s.age);
	     
	     /*
	     Stack
	     -------
	     s

	     Heap
	     -------
	     Student Object
	     age = 20 
	     */
	}

}
