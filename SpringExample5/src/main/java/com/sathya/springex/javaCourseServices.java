package com.sathya.springex;

import org.springframework.stereotype.Component;

@Component
public class javaCourseServices  implements courseServices {

	public void courseinfo() {
		System.out.println("Java full Stack");
		System.out.println("corejava,Advajava,springboot...");
		
	}

}
