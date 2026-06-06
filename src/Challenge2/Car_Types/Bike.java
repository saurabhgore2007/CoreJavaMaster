package Challenge2.Car_Types;

public class Bike extends Vehicle{

	private float cost;
	private float engineCC;
	
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	public float getEngineCC() {
		return engineCC;
	}
	public void setEngineCC(float engineCC) {
		this.engineCC = engineCC;
	}
	
	@Override
	public void startEngine() {

		System.out.println("Bike Engine Started...");
	}
	@Override
	public float calculateRunningCost(float km) {
		return 2*km;
	}
	
	public void displayInfo() {
		displayVehicleInfo();
		startEngine();

		System.out.println("Cost : " + this.cost);
		System.out.println("Engine CC : " + this.engineCC);

	}
}
