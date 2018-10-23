package com.demo.entity;

public class Test {
	private String gender;
	private String emailId;
	private String pincode;

	public Test(String email, String pincode) {
		super();
		this.emailId = email;
		this.pincode = pincode;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void printSomething(String name) {
		System.out.println("Hello " + gender + " " + name);
		System.out.println(emailId + "   " + pincode);

	}

}
