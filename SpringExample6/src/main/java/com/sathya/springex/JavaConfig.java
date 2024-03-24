package com.sathya.springex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	
	@Bean
	public Doctor doctor()
	
	
	{
		Doctor doctor=new Doctor(10,"sai");
		return doctor;
	}
	
	
	@Bean
	public Pharmcy pharmcy()
	
	
	{
		Pharmcy pharmcy=new Pharmcy("Durga","hyderbad");
		return pharmcy;
	}
	
	@Bean
	public Patient patient()
	
	
	{
		Patient patient=new Patient("Durga",39,doctor(),pharmcy());
		return patient;
	}
	
	
}


