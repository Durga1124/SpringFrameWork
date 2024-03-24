package com.sathya.springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	// Start the ioc container
       ApplicationContext context=new AnnotationConfigApplicationContext(javaConfig.class);
    	
    	System.out.println("************");
    	
    	//get the bean
    	GreetingImpl greetingImpl=context.getBean("greet",GreetingImpl.class);
    	greetingImpl.personInfo();

    	
    	Person person1=context.getBean("person1",Person.class);
    	person1.personInfo();
    	
    	System.out.println("************");
    	
    	Person person2=context.getBean("person2",Person.class);
    	person2.personInfo();
    	
    }
}
