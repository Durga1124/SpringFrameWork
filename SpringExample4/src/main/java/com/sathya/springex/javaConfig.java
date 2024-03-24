package com.sathya.springex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class javaConfig {
	
	@Bean
	public GreetingImpl greet()
	{
		GreetingImpl greetingImpl=new GreetingImpl();
		return greetingImpl;
	}

	
	@Bean
	public Person person1()
	{
		Person person=new Person();
		person.setName("Prasad");
		person.setEmail("prasad@gmail.com");
		return person;		
	}

	@Bean
	
	public Person person2()
	{
		Person person=new Person();
		person.setName("Durga");
		person.setEmail("Durga@gmail.com");
		return person;		
	}
	
}
