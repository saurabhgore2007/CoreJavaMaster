package Day4.Example2;

import java.util.Scanner;

import Day4.Example2.ProductEmp.Product;

/*  Task1
 * Find the word exist in title of product or not? return Product Object if exist
*/

public class MainApp {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		String value;
		
		Product p1 = new Product();
		p1.addProduct(1845, "Wirless Mouse", 800.00);
		
		Product p2 = new Product();
		p2.addProduct(1866, "Bluetooth Mouse", 1400.00);
		
		Product p3 = new Product();
		p3.addProduct(1851, "Wirless Keyboard", 1450.00);
		
		
		p1.show();
		p2.show();
		p3.show();
		
		
		System.out.print("Enter Product Title to search :");
		value = s1.next();
		
		Product r = find(p1,value);
		System.out.println(r.title);

	}
	
	
	public static Product find(Product P,String prefix)
	{		
		if(P.title != null && P.title.contains(prefix)) {
			return P;
		}
		return null;
	}

}
