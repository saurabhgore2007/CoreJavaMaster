package Day18;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierEx1 {

	public static void main(String[] args) {

		CyclicBarrier barrier = new CyclicBarrier(3);
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		for(int i = 1;i<=3;i++) {
			int id = i;
			
			service.submit(() -> {
				
				try {
					System.out.println("Task " + id + " Phase 1");
					Thread.sleep((long)(Math.random()*2000));
					
					System.out.println("Task " + id + " waiting");
					barrier.await();
					System.out.println("Task " + id + " Phase 2");
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
			});
		}
		
		service.shutdown();
	}

}
