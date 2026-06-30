package Day17;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamEx2 {

	public static void main(String[] args) {

		//boxed
		List<Integer> list = IntStream.rangeClosed(1, 20).boxed().toList();

		list.parallelStream().map(n -> {
				System.out.println("Processing: " + n +
							" by " + Thread.currentThread().getName());

			try {
				Thread.sleep(200);
			}
			catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}

			return n;
		}).forEachOrdered(n ->
		System.out.println("Printing: " + n +" by " + Thread.currentThread().getName()));
		
		//IntStream
		IntStream.of(10, 20, 30).forEach(System.out::println);
		
		//range()
		IntStream.range(1, 10).forEach(System.out::println);

		//rangeClosed()
		IntStream.rangeClosed(1, 10).forEach(System.out::println);

	}

}
