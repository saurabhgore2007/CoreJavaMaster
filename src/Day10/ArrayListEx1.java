package Day10;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {

		ArrayList x = new ArrayList();
		
		x.add(10);
		x.add(20);

		System.out.println("Array List x = " + x);
		System.out.println("Array List values = " + x.get(0)+ "\t" + x.get(1));

		int sum = (int)x.get(0) + (int)x.get(1);
		System.out.println("Addition = " + sum);

		x.add(true);
		x.add("Java");
		x.add('S');
		x.add(100.50f);
		
		System.out.println("\nArray list x = " + x);

		
		
		//Using Generic
		ArrayList<Integer> arrObj = new ArrayList<Integer>();

		arrObj.add(194);
		arrObj.add(170);
		arrObj.add(15);
				
		System.out.println("ArrayList y = " + arrObj);
				
//		y.remove(new Integer(170));
		arrObj.remove(Integer.valueOf(170));
		System.out.println("ArrayList y = " + arrObj);
				
		arrObj.add(1,300);
		System.out.println("Added 300 at 1 to ArrayList y = " + arrObj);
				
		arrObj.set(0, 2000);
		System.out.println("Changed Value to 0 index ArrayList y = " + arrObj);
				
		arrObj.addFirst(500);
		System.out.println("Added First to ArrayList y = " + arrObj);
		
		arrObj.addLast(600);
		System.out.println("Added Last to ArrayList y = " + arrObj);

		System.out.println("Get First ArrayList y = " + arrObj.getFirst());
		System.out.println("Get Last ArrayList y = " + arrObj.getLast());
		
		arrObj.removeFirst();
		System.out.println("Removed First ArrayList y = " + arrObj);

		System.out.println("Class of ArrayList y = " + arrObj.getClass());
		System.out.println("Last index of ArrayList y = " + arrObj.lastIndexOf(arrObj));
		System.out.println(arrObj.size());

		System.out.println("Elements in array List arrObj");

		for (Integer i : arrObj) {
		      System.out.println(i);
		    }
		
	}
}
