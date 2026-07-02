package Day19;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Employee {
	
	public String name;	
	private int age = 18;
	
	public Employee() {
	    }
    public void study() {
        System.out.println("Studying...");
    }

    public void greet(String name) {
    	this.name = name;
        System.out.println("Hello " + name);
    }

    public int add(int a, int b) {
        return a + b;
    }
}

public class ReflectionEx2 {

	public static void main(String[] args) throws Exception{

		/*
		 * Employee s = new Employee();
		 * 
		 * s.study(); s.greet("Saurabh");
		 * 
		 * System.out.println(s.add(10,20));
		 */
		
		//Get Class
		Class<?> c = Employee.class;
		
		//Create Object
		Object obj = c.getConstructor().newInstance();
		
		//get methods
		Method[] methods = c.getMethods();
		
		for(Method m : methods){

		    System.out.println(m.getName());

		}
		
		//get method by name
		Method m1 = c.getMethod("study");
		m1.invoke(obj);
		
		//get method by with parameters
		Method m2 = c.getMethod("greet", String.class);
		m2.invoke(obj, "Saurabh");
		
		//method returning value
		Method m = c.getMethod("add", int.class, int.class);

		Object result = m.invoke(obj,10,20);

		System.out.println(result);
		
		//Get a Public Field
		Field f = c.getField("name");
		//Read Field Value
		Object value = f.get(obj);
		
		System.out.println(value);
		
		//Modify public Field
		f.set(obj, "Rahul");
		System.out.println(f.get(obj));
		
		//Access Private Fields
		Field field = c.getDeclaredField("age");
		field.setAccessible(true);
		
		System.out.println(field.get(obj));
	}

}
