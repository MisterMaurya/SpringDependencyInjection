package com.demo.entity;

public class Car {

	private Engine e;
	private String carName;

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public void setE(Engine e) {
		this.e = e;
	}

	public void printData() {
		System.out.println("carname = " + carName);
		System.out.println("Model Year = " + e.getModelYear());
	}

}
