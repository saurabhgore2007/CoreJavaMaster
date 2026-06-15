package Day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Product
{
	public int id;
	public String prodName;
	public float cost;

	public Product(){}

	public Product(int id, String prodName, float cost)
	{
		this.id = id;
		this.prodName = prodName;
		this.cost = cost;
	}

	@Override
	public String toString()
	{
		return String.format("%10d %20s %10.2f",this.id, this.prodName, this.cost);
	}
}


public class LinkedListEx1 {

	public static void main(String[] args) {
		
		LinkedList<Product> products = new LinkedList<Product>();


		products.add(new Product(148, "Mouse", 800.00f));
		products.add(new Product(201, "Keyboard", 1600.00f));
		products.add(new Product(481, "Speaker", 1500.00f));
		products.add(new Product(248, "SMPS", 500.00f));
		products.add(new Product(184, "Mouse", 800.00f));

		for(Product item:products)
		{
			System.out.println(item);
		}

		
		//Use this when elements are known but we cant add or remove it
		//Arrays.asList() converts to Unknown List
		List<Product> favoriteProducts = Arrays.asList(
				new Product(9889, "Bluetooth", 7000.00f),
				new Product(3985, "Smart Watch", 19000.00f),
				new Product(1092, "Alexa", 15000.00f)
			);

//		favoriteProducts.add(new Product(9889, "Bluetooth", 7000.00f));  Not Work throws  java.lang.UnsupportedOperationException
		ArrayList x = new ArrayList(favoriteProducts);// instead we copy elements to new ArrayList

		//Method-3 Here problem is Solved we can add elements 
		//Use this when we know elements and also add or remove other elements
		ArrayList<Product> favoriteproducts = new ArrayList(Arrays.asList(
						new Product(9889, "Bluetooth", 7000.00f),
						new Product(3985, "Smart Watch", 19000.00f),
						new Product(1092, "Alexa", 15000.00f)
			));

	}
}
