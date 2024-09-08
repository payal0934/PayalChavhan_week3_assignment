package com.xenosis.week3;

public class Bike extends Vehicle{

	
	 private int engineCapacity;

	    public Bike(String brand, String model, int engineCapacity) {
	        super(brand, model);
	        this.engineCapacity = engineCapacity;
	    }

	    @Override
	    public void displayDetails() {
	        super.displayDetails();
	        System.out.println("Engine capacity: " + engineCapacity + "cc");
	    }

	    @Override
	    public void startEngine() {
	        System.out.println("Bike engine started");
	    }

	    public void kickStart() {
	        System.out.println("Bike kicked started");
	    }
}
