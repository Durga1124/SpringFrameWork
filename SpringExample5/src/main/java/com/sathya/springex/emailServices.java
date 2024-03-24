package com.sathya.springex;

import org.springframework.stereotype.Component;

@Component
public class emailServices implements messegeServices {

	public void message() {
		System.out.println("your message is correct to check the email");
		System.out.println("email is correctand check updates");
		
	}

}
