package Day10;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {

		ArrayList x = new ArrayList();
		
		x.add(18);
		x.add(20);
		
		System.out.println("Array List x = " + x);
		
		System.out.println("Array List values = " + x.get(0)+ "\t" + x.get(1));
		
		int sum = (int)x.get(0) + (int)x.get(1);
		System.out.println("Addition = " + sum);
		
		x.add("Hello World");
		x.add(100.55f);
		x.add(true);
		x.add('E');
		
		System.out.println("\n Array list x = " + x);
		
		//Generic Syntax
		ArrayList<Integer> y = new ArrayList<Integer>();
		
		//y.add(10.45f);
		//y.add(true);
		//y.add("Hello");
		y.add(194);
		y.add(170);
		y.add(15);
		
		System.out.println("ArrayList y = " + y);
		
		y.remove(new Integer(170));
		System.out.println("ArrayList y = " + y);
		
		y.add(1,300);
		System.out.println("ArrayList y = " + y);
		
		y.set(0, 2000);
		System.out.println("ArrayList y = " + y);
		
		System.out.println(y.size());
	}

}
