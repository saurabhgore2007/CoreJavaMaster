package Day19;

import java.lang.reflect.Constructor;

class Student {

    private String name;
    private int age;

    public Student() {
        this.name = "Unknown";
        this.age = 0;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}

public class ReflectionEx1 {

	public static void main(String[] args) throws Exception{
		
		//get class object
		Class<?> c = Student.class;

		/*
		 * System.out.println(c.getName()); System.out.println(c.getSimpleName());
		 * System.out.println(c.getSuperclass());
		 */
		
		//Get Constructors
		Constructor<?>[] constructors = c.getDeclaredConstructors();
		
		for(Constructor<?> con : constructors) {
		    System.out.println(con);
		}
		
		Constructor<?> con = c.getConstructor(String.class,int.class);
		Object obj = con.newInstance("Saurabh", 23);
		System.out.println(obj);
	}

}
