package Day16;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceEx {

	public static void main(String[] args) throws Exception {

		ScheduledExecutorService service = Executors.newScheduledThreadPool(2);
		
		service.schedule(() -> 
			{
				System.out.println("Hello");	
			}, 5, TimeUnit.SECONDS);
		
		service.scheduleAtFixedRate(() -> {

		    System.out.println("Running");

		},0,2,TimeUnit.SECONDS);
		
		service.shutdown();
		
		if(service.awaitTermination(6, TimeUnit.SECONDS)){

		    System.out.println("Finished");

		}
		else{

		    System.out.println("Timeout");

		}
	}
}
