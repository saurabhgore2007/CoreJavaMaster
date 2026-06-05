package Day4.Example2.ProductEmp;

public class Product {

	public int id;
	public String title;
	public double cost;
	
	public void addProduct(int id,String title,double cost) {
		
		this.id = id;
		this.title = title;
		this.cost = cost;
	}
	
	public void show()
	{
		System.out.println(String.format("%10d %20s %10.2f",this.id,this.title, this.cost));
	}
}
