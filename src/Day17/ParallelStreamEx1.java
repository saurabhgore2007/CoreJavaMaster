package Day17;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamEx1 {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();

		for(int i = 1; i <= 10; i++) {
		    list1.add(i);
		}
		
		list1.parallelStream().forEachOrdered(System.out::println);
		
		List<Integer> list2 = List.of(1,2,3,4,5,6,7,8);
		
		list2.parallelStream().forEachOrdered(i -> 
		{
			System.out.println(Thread.currentThread().getName() + " : " + i);
		});
	}

}
