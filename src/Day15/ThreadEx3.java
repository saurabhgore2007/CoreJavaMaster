package Day15;

public class ThreadEx3 {

	public static void main(String[] args) {

		Thread t1 = new Thread(){
			@Override
			public void run()
			{
				System.out.println("Hello World");
			}
		};

		Thread t2 = new Thread(){
			@Override
			public void run()
			{
				System.out.println("Welcome");
			}
		};

		Thread t3 = new Thread(){
			@Override
			public void run()
			{
				System.out.println("Awesome");
			}
		};
		
		t1.start();
		t2.start();
		t3.start();
	}

}
