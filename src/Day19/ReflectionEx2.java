package Day19;

import java.lang.reflect.Method;

class Employee {
	
	 public Employee() {
	    }
    public void study() {
        System.out.println("Studying...");
    }

    public void greet(String name) {
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
		
		Class<?> c = Employee.class;
		
		Object obj = c.getConstructor().newInstance();
		
		Method[] methods = c.getMethods();
		
		for(Method m : methods){

		    System.out.println(m.getName());

		}
		
		Method m1 = c.getMethod("study");
		m1.invoke(obj);
		
		Method m2 = c.getMethod("greet", String.class);
		m2.invoke(obj, "Saurabh");
		
		Method m = c.getMethod("add", int.class, int.class);

		Object result = m.invoke(obj,10,20);

		System.out.println(result);
	}

}
