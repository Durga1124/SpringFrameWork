package com.sathya.springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       

    	//Start the container
    	ApplicationContext context=new AnnotationConfigApplicationContext(javaConfig.class);
    	
    	System.out.println("************");
    	
    	//Get the object  from container call your methods
    	GreetingImpl greetingImpl=context.getBean("greet",GreetingImpl.class);
    	greetingImpl.greet();
    	
    }
}
