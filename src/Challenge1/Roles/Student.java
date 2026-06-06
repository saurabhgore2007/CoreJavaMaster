package Challenge1.Roles;

public class Student extends Person{

	private int semister;
	private double feesPaid;
	
	public Student() {
		super();
		this.semister = 0;
		this.feesPaid = 0.0;
	}
	
	@Override
	public void displayRole() {
		System.out.println("Role : Student");
	}
	
	@Override
	public double calculateIncome() {

		return -feesPaid;
	}
	
	@Override
	public void displayDetails() {

	    displayRole();
	    displayBasicInfo();

	    System.out.println("Semester : " + this.semister);
	    System.out.println("Fees Paid : " + this.feesPaid);
	    System.out.println("Income : " + this.calculateIncome() + "\n\n");
	}
	
	public int getSemister() {
		return semister;
	}
	public void setSemister(int semister) {
		this.semister = semister;
	}
	
	public double getFeesPaid() {
		return feesPaid;
	}
	public void setFeesPaid(double feesPaid) {
		this.feesPaid = feesPaid;
	}
}
