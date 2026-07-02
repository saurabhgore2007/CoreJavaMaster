package Day19.AnnotationEx;


/*@Retention(RetentionPolicy.RUNTIME)
@interface Author {
	String name();
	int version() default 1;
}
*/


public class AnnotationExample {

	public static void main(String[] args) {

		Class<?>[] classes = {
				Student.class,
				Employee.class
		};
		
		 for (Class<?> c : classes) {
			 if(c.isAnnotationPresent(Author.class)) {
				 
				 	Author author = c.getAnnotation(Author.class);
				 
				 	System.out.println("Class Name : " + c.getSimpleName());
	                System.out.println("Author     : " + author.name());
	                System.out.println("Version    : " + author.version());

	                System.out.println("-------------------------");
			 }
		 }
	}

}
