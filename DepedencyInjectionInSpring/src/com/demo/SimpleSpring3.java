package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.entity.Car;

public class SimpleSpring3 {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/demo/resources/car-engine.xml");
		Car car = (Car) ac.getBean("car_engine");
		car.printData();
	}

}
