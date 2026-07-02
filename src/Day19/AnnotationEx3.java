package Day19;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface Log {

}

class UserService {

	public UserService() { }
    @Log
    public void login() {
        System.out.println("Login Successful");
    }

    public void logout() {
        System.out.println("Logout Successful");
    }

    @Log
    public void register() {
        System.out.println("Registration Successful");
    }

}

public class AnnotationEx3 {

	public static void main(String[] args) throws Exception{

		Class<?> c = UserService.class;
		
		Object obj = c.getConstructor().newInstance();
		
		Method[] methods = c.getDeclaredMethods();
		
		for(Method m : methods) {
			if(m.isAnnotationPresent(Log.class)) {
				
				System.out.println("Executing : " + m.getName());
				m.invoke(obj);
				System.out.println("----------------");
			}
		}
	}

}
