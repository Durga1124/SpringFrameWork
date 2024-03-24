package com.sathya.springex;

public class Pharmcy {

	private String name;
	private String location;
	public Pharmcy(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	public void pharInfo() {
		
		System.out.println("Hey"+name+" Welcome to Apollo pharmcy....");
		System.out.println("Check your Location..."+location+" to get updates");
		
		
	}
	
	
	
	
	
}
