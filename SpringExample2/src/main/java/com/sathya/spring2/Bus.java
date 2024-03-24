package com.sathya.spring2;

public class Bus implements Vechile {
	private String busType;
	private int maxSpeed;

	
	public String getBusType() {
		return busType;
	}


	public void setBusType(String busType) {
		this.busType = busType;
	}


	public int getMaxSpeed() {
		return maxSpeed;
	}


	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}


	@Override
	public void move() {
		System.out.println("Your selected Bus vechile");
		System.out.println("Max Speed...."+maxSpeed);
		System.out.println("Fuel type...."+busType);		
		
	}

	
}

