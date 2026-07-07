package Day22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionFactoryMethods {

	public static void main(String[] args) {

		//List.of
		
		//Without List.of
		String[] arr1 = {"Java", "Spring"};

		List<String> list1 = Arrays.asList(arr1);
		
		System.out.println("Array : " + Arrays.toString(arr1));
		System.out.println("List :- " + list1);
		
		//Allowed
		list1.set(0, "Python");

		System.out.println("Array : " + Arrays.toString(arr1));
		System.out.println("List :- " + list1);

		//With List.of
		List<String> list2 = List.of(arr1);
				
		//NotAllowed
//		list2.set(0, "Python");

		System.out.println("Array : " + Arrays.toString(arr1));
		System.out.println("List :- " + list2);

//		-----------------------------------------------------
		//Set.of
		Set<String> set = Set.of("A","B","C");
		
//		set.add("D"); Cause UnsupportedOperationException
		System.out.println("Set :- " + set);   
//		set.remove("A"); Cause UnsupportedOperationException

//		-----------------------------------------------------

		//Map.of
		Map<Integer,String> map = Map.of(1,"Java", 2,"Spring",3,"Hibernate");

//		map.remove(1);	UnsupportedOperationException
		System.out.println(map);
//		map.put(4,"React");  UnsupportedOperationException

	}

}
