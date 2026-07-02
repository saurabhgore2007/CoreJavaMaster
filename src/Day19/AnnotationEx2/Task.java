package Day19.AnnotationEx2;

import java.lang.reflect.Method;

public class Task {

	public static void main(String[] args) throws Exception{

		Class<?> c = GivenTask.class;
		
		Object obj = c.getConstructor().newInstance();
		
		Method[] methods = c.getDeclaredMethods();
		
		for(Method m : methods) {
			if(m.isAnnotationPresent(Execute.class)) {
				m.invoke(obj);
			}
		}
	}

}
