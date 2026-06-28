package Day16;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Consumer;

public class CallableEx1 {

	public static void main(String[] args) {

		ExecutorService service = Executors.newSingleThreadExecutor();
		
		Callable<Integer> task = () ->{
			System.out.print("Calculating");
			for(int i = 0;i<3;i++) {
				Thread.sleep(400);
				System.out.print(".");			
			}
			return 10 + 20;
		};
		
		Future<Integer> future = service.submit(task);

		try {
			Integer result = future.get();
			System.out.println("\nResult is " + result);
		}
		catch(ExecutionException | InterruptedException ex) {
			ex.printStackTrace();
		}
        service.shutdown();

	}

}
