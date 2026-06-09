package Day9;

public class WrapperClassEx1 {

	public static void main(String[] args) {

		  Integer i1 = new Integer(25); 
		  Integer i2 = new Integer("25"); 
		  Float f1 = new Float("2.50"); 
		 
		  System.out.println("\n\t Value of i1 = " + i1); 
		  System.out.println("\n\t Value of i2 = " + i2); 
		 
		  int sum = i1.intValue() + i2.intValue(); 
		 
		  float sum1 = i1.floatValue() + f1.floatValue(); 
		 
		  System.out.println("\n\t VAlue of sum = " + sum); 
		  System.out.println("\n\t VAlue of sum1 = " + sum1); 
		 
		  System.out.println("\n\t Compare = " + i2.compareTo(i1)); 
	}

}
