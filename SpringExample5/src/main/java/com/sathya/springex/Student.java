package com.sathya.springex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	
	
	//top of the fields
	/*@Autowired
	private emailServices emailServices;
	@Autowired
	private javaCourseServices javaCourseServices;*/
	
	/*private emailServices emailServices;
	private javaCourseServices javaCourseServices;
	

	public emailServices getEmailServices() {
		return emailServices;
	}
    //Top of the setters
    @Autowired
	public void setEmailServices(emailServices emailServices) {
		this.emailServices = emailServices;
	}


	public javaCourseServices getJavaCourseServices() {
		return javaCourseServices;
	}

	//Top of the setters
    @Autowired
	public void setJavaCourseServices(javaCourseServices javaCourseServices) {
		this.javaCourseServices = javaCourseServices;
	}
*/
	
	private emailServices emailServices;
	private javaCourseServices javaCourseServices;
	
	//top of the constructor
   @Autowired
	public Student(com.sathya.springex.emailServices emailServices,
			com.sathya.springex.javaCourseServices javaCourseServices) {
		super();
		this.emailServices = emailServices;
		this.javaCourseServices = javaCourseServices;
	}


	public void details()
	{
		emailServices.message();
		javaCourseServices.courseinfo();
	}
}









