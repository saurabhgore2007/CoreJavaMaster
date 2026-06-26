package Day15;

class MyTask implements Runnable {

    @Override
    public void run() {
        System.out.println("Task is Running...");
    }
}

public class RunnableEx1 {

	public static void main(String[] args) {

		MyTask task = new MyTask();
		
		Thread t = new Thread(task);
		
		t.start();
	}

}
