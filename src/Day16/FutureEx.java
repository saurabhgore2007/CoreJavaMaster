package Day16;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class FutureEx {

	public static void main(String[] args) throws Exception{

		ExecutorService service = Executors.newSingleThreadExecutor();

		Callable<Integer> task = () -> {

		    Thread.sleep(3000);

		    return 50;

		};
		
			Future<Integer> future = service.submit(task);
			
			while(!future.isDone()) {
			System.out.println("Still Working...");
			Thread.sleep(500);
			}
			
			future.cancel(true);

			System.out.println(future.get(4, TimeUnit.SECONDS));
			System.out.println(future.isCancelled());
			service.shutdown();
		
	}

}
