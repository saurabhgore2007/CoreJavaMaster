package Challenge2.Car_Types;

public class ElectricCar extends Vehicle{

	private String batteryCapacity;
	private String chargingTime;
	
	
	public String getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(String batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	
	public String getChargingTime() {
		return chargingTime;
	}
	public void setChargingTime(String chargingTime) {
		this.chargingTime = chargingTime;
	}
	
	@Override
	public void startEngine() {

		System.out.println("Electric Motor Started Silently...");
		
	}
	@Override
	public float calculateRunningCost(float km) {
		return 1*km;
	}
	
	public void displayInfo() {
		displayVehicleInfo();
		startEngine();

		System.out.println("Battery Capacity : " + this.batteryCapacity);
		System.out.println("Battery Capacity : " + this.chargingTime);

	}
}
