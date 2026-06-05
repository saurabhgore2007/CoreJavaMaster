package Day4.Example4.Products;

public class Products {

	private int id;
	private String title;
	private double cost;
	
	public Products() {
		this.id = 0;
		this.title = "";
		this.cost = 0.00;
	}
	
	public Products(int id, String title, double cost)
	{
		this.id = id;
		this.title = title;
		this.cost = cost;
	}
	
	public int getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public double getCost() {
		return cost;
	}
	
	@Override
	public String toString() {
		
		return this.id + "\t" + this.title + "\t" + this.cost;
	}
	 
}
