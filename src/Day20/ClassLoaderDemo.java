package Day20;

public class ClassLoaderDemo {

	public static void main(String[] args) {

		/*
		 * Class Loader 
		 * -> Bootstrap ClassLoader 
		 * -> Platform ClassLoader 
		 * -> Application
		 * ClassLoader
		 */
		System.out.println(String.class.getClassLoader()); //BootStrap ClassLoader
		System.out.println(ClassLoaderDemo.class.getClassLoader()); //Application ClassLoader
	}

}
