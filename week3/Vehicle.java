package com.xenosis.week3;

public class Vehicle {
	private String brand;
    private String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }

    public void startEngine() {
        System.out.println("Vehicle engine started");
    }

}
