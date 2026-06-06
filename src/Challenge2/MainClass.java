package Challenge2;

import Challenge2.Car_Types.Bike;
import Challenge2.Car_Types.ElectricCar;
import Challenge2.Car_Types.PetrolCar;
import Challenge2.Car_Types.Vehicle;

public class MainClass {

	public static void main(String[] args) {

		Vehicle[] vehicles = new Vehicle[3];
		
		ElectricCar ev = new ElectricCar();
		PetrolCar petrolCar = new PetrolCar();
		Bike bike = new Bike();
		
		ev.setVehicleNumber("MH 01 0001");
		ev.setBrand("Tata");
		ev.setSpeed(150);
		ev.setBatteryCapacity("3.5kw/h");
		ev.setChargingTime("5 Hours");
		
		
		petrolCar.setVehicleNumber("MH 01 0002");
		petrolCar.setBrand("Tata");
		petrolCar.setSpeed(200);
		petrolCar.setFuelTankCapacity(50);
		petrolCar.setMileage(20);
		
		bike.setVehicleNumber("MH 01 0003");
		bike.setBrand("Bajaj");
		bike.setSpeed(100);
		bike.setCost(50);
		bike.setEngineCC(150);
		
		vehicles[0] = ev;
		vehicles[1] = petrolCar;
		vehicles[2] = bike;
		
		float km = 100;
		float totalCost = 0.0f;
		
		Vehicle cheapestVehicle = vehicles[0];
		Vehicle expensiveVehicle = vehicles[0];

		float minCost = vehicles[0].calculateRunningCost(km);
		float maxCost = vehicles[0].calculateRunningCost(km);
		for(Vehicle v : vehicles) {
			
			float cost = v.calculateRunningCost(km);
			
			if(cost<minCost) {
				minCost = cost;
				cheapestVehicle = v;
			}
			if(cost>maxCost) {
				maxCost = cost;
				expensiveVehicle = v;
			}
			totalCost += cost;
			v.displayInfo();
			System.out.println("Running Cost for 100 KM : ₹" + v.calculateRunningCost(km));

		    System.out.println("------------------------"+"\n\n");
		    
		}
		
		float averageCost = totalCost / vehicles.length;
		
		System.out.println("Cheapest Vehicle");
		System.out.println("Vehicle No : " + cheapestVehicle.getVehicleNumber());
		System.out.println("Cost : ₹" + minCost);

		System.out.println();

		System.out.println("Most Expensive Vehicle");
		System.out.println("Vehicle No : " + expensiveVehicle.getVehicleNumber());
		System.out.println("Cost : ₹" + maxCost);

		System.out.println();

		System.out.println("Average Running Cost : ₹" + averageCost);

	}

}
