package Day11.example;

import java.io.Serializable;
import java.util.Scanner;

public class Product implements Serializable{

	public int id;
	public String prodName;
	public double cost;
	static Scanner scan = new Scanner(System.in);
	
	public Product() {}
	
	public Product(int id, String prodName, double cost) {
		super();
		this.id = id;
		this.prodName = prodName;
		this.cost = cost;
	}
	
	public void add()
	{
		System.out.print("\n Enter product id = ");
		this.id = scan.nextInt();
		
		System.out.print("\n Enter product name = ");
		this.prodName = scan.next();
		
		System.out.print("\n Enter price = ");
		this.cost = scan.nextDouble();
	}

	@Override
	public String toString() {
		return String.format("%10d %20s %10.2f",this.id, this.prodName, this.cost );
	}
}
