package Challenge1.Roles;

abstract public class Person {

	private int id;
	private String name;
	private int age;
	static public  int citizenCount = 0;
	
	public Person() {
		this.setId(0);
		this.setName(null);
		this.setAge(0);
		citizenCount++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	abstract void displayRole();
	abstract double calculateIncome();
	abstract public void displayDetails();
	
	public void displayBasicInfo() {
		
		System.out.println("ID : " + this.id);
		System.out.println("Name : " + this.name);
		System.out.println("Age : " + this.age);
	}
	
	public int getCount() {
		return this.citizenCount;
	}
	
}
