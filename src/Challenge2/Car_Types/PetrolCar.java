package Challenge2.Car_Types;

public class PetrolCar extends Vehicle{

	private float fuelTankCapacity;
	private float mileage;
	
	public float getFuelTankCapacity() {
		return fuelTankCapacity;
	}
	
	public void setFuelTankCapacity(float fuelTankCapacity) {
		this.fuelTankCapacity = fuelTankCapacity;
	}
	
	public float getMileage() {
		return mileage;
	}
	
	public void setMileage(float mileage) {
		this.mileage = mileage;
	}

	@Override
	public void startEngine() {

		System.out.println("Petrol Engine Started...");
	}

	@Override
	public float calculateRunningCost(float km) {
		return 5*km;
	}
	
	public void displayInfo() {
		displayVehicleInfo();
		startEngine();

		System.out.println("Fuel Capacity : " + this.fuelTankCapacity);
		System.out.println("Mileage : " + this.mileage);

	}
}
