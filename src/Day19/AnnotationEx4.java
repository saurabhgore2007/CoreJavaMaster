package Day19;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

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

		Class<?> c = HomeController.class;
		
		Object obj = c.getConstructor().newInstance();
		
		Method[] methods = c.getDeclaredMethods();
		
		for(Method m : methods) {
			if(m.isAnnotationPresent(Url.class)) {
				
				String path = m.getDeclaredAnnotation(Url.class).value();
				
				System.out.println("\nURL : " + path);
				System.out.println("Method : " + m.getName());
			}
		}
	}

}
