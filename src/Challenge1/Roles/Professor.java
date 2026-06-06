package Challenge1.Roles;

public class Professor extends Person{

	private double salary;
	private int publications;
	
	public Professor() {
		this.salary = 0.0;
		this.publications = 0;
	}
	
	public double getSalary() {
		return this.salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public int getPublications() {
		return this.publications;
	}
	public void setPublications(int publications) {
		this.publications = publications;
	}
	
	@Override
	public void displayRole() {
		System.out.println("Role : Professor");
	}
	
	@Override
	public double calculateIncome() {
		return salary + (publications*5000);
	}
	
	@Override
	public void displayDetails() {

	    displayRole();
	    displayBasicInfo();

	    System.out.println("Salary : " + this.salary);
	    System.out.println("Publications : " + this.publications);
	    System.out.println("Income : " + this.calculateIncome() + "\n\n");
	}
}
