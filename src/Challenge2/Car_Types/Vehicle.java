package Challenge2.Car_Types;

public abstract class Vehicle {

	private String vehicleNumber;
	private String brand;
	private float speed;
	
	public Vehicle() {
		this.vehicleNumber = null;
		this.brand = null;
		this.speed = 0.0f;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		if(!vehicleNumber.isEmpty()){
		  this.vehicleNumber = vehicleNumber;
		}
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		if(!brand.isEmpty()) {
		   this.brand = brand;
		}
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		if(speed >= 0) {
		   this.speed = speed;
		}
	}
	
	abstract public void startEngine();
	abstract public float calculateRunningCost(float km);
	abstract public void displayInfo();
	
	public void displayVehicleInfo() {
		System.out.println("Vehicle No : " + this.vehicleNumber);
		System.out.println("Brand : " + this.brand);
		System.out.println("Top Speed No : " + this.speed);

	}
	
}
