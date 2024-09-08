package com.xenosis.week3;

public class Mainclass {

	public static void main(String[] args) {
		
		Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Vehicle("Generic", "Model");
        vehicles[1] = new Car("Auddi", "BMW", 4);
        vehicles[2] = new Bike("Honda", "Duke", 500);

        for (Vehicle vehicle : vehicles) {
            System.out.println("\n" + vehicle.getClass().getSimpleName() + ":");
            vehicle.displayDetails();
            vehicle.startEngine();
        }
        
        
        
        Car car = new Car("Toyota", "Corolla", 4);
        Bike bike = new Bike("Honda", "CBR500R", 500);

        System.out.println("\n  specific car method:");
        car.openTrunk();

        System.out.println("\n  specific bike method:");
        bike.kickStart();
	}

}
