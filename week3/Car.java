package com.xenosis.week3;

public class Car  extends Vehicle{
	
	private int numDoors;
	 
	public Car(String brand, String model, int numDoors) {
        super(brand, model);
        this.numDoors = numDoors;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of doors: " + numDoors);
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started");
    }

    public void openTrunk() {
        System.out.println("Trunk opened");
    }
}
