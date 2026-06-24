package Day15;

public class ThreadEx1 {

	public static void main(String[] args) {

		Thread t = Thread.currentThread();
		System.out.println(t);
		
		System.out.println("Id :- " + t.getId());
		System.out.println("Name :- " + t.getName());
		System.out.println("Priority :- " + t.getPriority());

		t.setName("Thread1");
		System.out.println("Name :- " + t.getName());
		System.out.println(t);

	}

}
