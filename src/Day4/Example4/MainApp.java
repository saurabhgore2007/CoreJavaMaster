package Day4.Example4;

import Day4.Example4.Products.Products;

// Task 4

public class MainApp {

	public static void main(String[] args) {

		Products products[] = {
				new Products(1848, "Keyboard", 1800.00),
				new Products(1841, "RAM", 1600.00),
				new Products(2881, "Pen Drive", 400.00),
				new Products(1901, "Monitor", 7000.00),
				new Products(1084, "SMPS", 600.00)		
				};
		
		//Q1. Show all products

		for(Products prod : products) {
			
			System.out.println(prod);
		}
		
		//Q2. Print total cost
		double total = 0;
        for(Products prod : products) {
        	total += prod.getCost();
		}
		System.out.println("\nTotal Cost : "+total);

		//Q3. Find Product with minimum cost
		double min = products[0].getCost();
		
		for(Products prod : products) {
        	if(min>prod.getCost()) {
        		min = prod.getCost();
        	}
		}
		
		System.out.println("\nMinimum Cost : "+ min);
		
		//Q4. Print top 2 products with maximum cost
		
		double max1 = products[0].getCost();
		double max2 = products[0].getCost();

		for(Products prod : products) {
			if(prod.getCost()>max1) {
				max2 = max1;
				max1 = prod.getCost();
			}
			else if(prod.getCost()>max2 && prod.getCost()<max1) {
				max2 = prod.getCost();
			}
		}
		System.out.println("\nMaximum Cost : "+ max1);
		System.out.println("Maximum Cost : "+ max2);



	}
}
