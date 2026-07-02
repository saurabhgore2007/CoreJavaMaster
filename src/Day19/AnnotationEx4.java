package Day19;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.Scanner;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Url {

    String value();

}

class HomeController {

	public HomeController() {}
	
    @Url("/home")
    public void home() {
        System.out.println("Home Page");
    }

    @Url("/about")
    public void about() {
        System.out.println("About Page");
    }

}

public class AnnotationEx4 {

	public static void main(String[] args) throws Exception{

		Scanner scan = new Scanner(System.in);
		String req = "";
		boolean found = false;
		
		System.out.print("Enter Request :- ");
		req += scan.next();
		
		Class<?> c = HomeController.class;
		
		Object obj = c.getConstructor().newInstance();
		
		Method[] methods = c.getDeclaredMethods();
		
		for(Method m : methods) {
			if(m.isAnnotationPresent(Url.class)) {
				
				Url url = m.getAnnotation(Url.class);
				if(url.value().equals(req)) {
					found = true;
					System.out.println("Request : " + url.value());
					m.invoke(obj);
					System.out.println("-------------------");
				}
			}
		}
		if (!found) {
		    System.out.println("404 - Page Not Found");
		}
	}

}
