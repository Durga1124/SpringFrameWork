package com.sathya.spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App 
{
    public static void main( String[] args )
    { //Start the Spring IOC container
    	
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
  
    	
    	//Get the bean
    	Traveller traveller=context.getBean("traveller",Traveller.class);
    	traveller.startJourny();
    }
 }
