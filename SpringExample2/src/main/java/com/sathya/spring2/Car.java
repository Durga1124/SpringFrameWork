package com.sathya.spring2;

public class Car implements Vechile {
	private String fuelType;
	private int maxSpeed;
	
	
	//generate Setters & getters
	
	public String getFuelType() {
		return fuelType;
	}


	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}


	public int getMaxSpeed() {
		return maxSpeed;
	}


	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}


	@Override
	public void move() {
		
		System.out.println("Your selected car vechile");
		System.out.println("Max Speed...."+maxSpeed);
		System.out.println("Fuel type...."+fuelType);		
	}
}
