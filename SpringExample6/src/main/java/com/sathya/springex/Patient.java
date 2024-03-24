package com.sathya.springex;

public class Patient {

	private String name;
	private int age;
	private Doctor doctor;
	private Pharmcy  pharmcy;
	
	
	
	public Patient(String name, int age, Doctor doctor, Pharmcy pharmcy) {
		super();
		this.name = name;
		this.age = age;
		this.doctor = doctor;
		this.pharmcy = pharmcy;
	}



	public void details() {
		
		System.out.println("Hey"+name+" Welcome to Appolo Hosptal....");
		System.out.println("Check your AGE..."+age+" to get updates");
		doctor.doctorInfo();
		pharmcy.pharInfo();
		
		
		
	}
	
	
	
	}
	
	

