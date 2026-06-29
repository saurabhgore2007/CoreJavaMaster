package Day16;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableEx2 {

	public static void main(String[] args) throws Exception{

		ExecutorService service = Executors.newFixedThreadPool(3);
		
		//invokeAll()
		Callable<Integer> task1 = () -> {
		    Thread.sleep(1000);
		    return 10;
		};

		Callable<Integer> task2 = () -> {
		    Thread.sleep(2000);
		    return 20;
		};

		Callable<Integer> task3 = () -> {
		    Thread.sleep(3000);
		    return 30;
		};
		
//		Future<Integer> f1 = service.submit(task1);
//		Future<Integer> f2 = service.submit(task2);
//		Future<Integer> f3 = service.submit(task3);
		
		List<Callable<Integer>> tasks = List.of(task1, task2, task3);
		List<Future<Integer>> futures = service.invokeAll(tasks);
		
		for(Future<Integer> f : futures) {
		    System.out.println(f.get());
		}
		
		//invokeAny()
		Callable<String> google = () -> {

		    Thread.sleep(3000);

		    return "Google";

		};

		Callable<String> bing = () -> {

		    Thread.sleep(2000);

		    return "Bing";

		};

		Callable<String> duck = () -> {

		    Thread.sleep(1000);

		    return "DuckDuckGo";

		};

		String result = service.invokeAny(List.of(google,bing,duck));

		System.out.println(result);
		
		List<Callable<Integer>> _tasks = List.of(
			    () -> { Thread.sleep(1000); return 20; },
			    () -> { Thread.sleep(2000); return 30; },
			    () -> { Thread.sleep(3000); return 10;}
			);
		System.out.println("Start");
		Integer results = service.invokeAny(_tasks);
		System.out.println(results);
		System.out.println("End");

		service.shutdown();
	}

}
