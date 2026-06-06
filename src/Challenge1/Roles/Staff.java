package Challenge1.Roles;

public class Staff extends Person{

	private double salary;
	private String department;
	
	public Staff() {
		this.salary = 0.0;
		this.department = null;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public void displayRole() {
		System.out.println("Role : Staff");
	}
	
	@Override
	public double calculateIncome() {
		return salary;
	}
	
	@Override
	public void displayDetails() {

	    displayRole();
	    displayBasicInfo();

	    System.out.println("Salary : " + this.salary);
	    System.out.println("Department : " + this.department);
	    System.out.println("Income : " + this.calculateIncome() + "\n\n");
	}
}
