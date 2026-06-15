package Day10;

import java.util.Stack;

class Customer{
	public int id;
	public String name;
	
	public Customer() {
		
	}
	
	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return String.format("%10d %20s",this.id, this.name);
	}
}

public class StackEx1 {

	public static void main(String[] args) {

		Stack<Customer> customers = new Stack<Customer>();
		
		customers.push(new Customer(28, "Amit"));
		customers.push(new Customer(34, "Shubham"));
		customers.push(new Customer(23, "Peter"));
		customers.push(new Customer(19, "Eliz"));
		
		System.out.println("Customer Details");
		for(Customer item:customers)
		{
			System.out.println(item);
		}

		System.out.println("Pop Deleting last element");
		customers.pop();
		for(Customer item:customers)
		{
			System.out.println(item);
		}

		System.out.println("Top of Customers");
		System.out.println(customers.peek());
		
		System.out.println("Is empty " + customers.isEmpty());

	}
}