package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.entity.Car;

public class SimpleSpringDemoJToEE {
	public static void main(String[] args) {

		String[] file = new String[] { "com/demo/resources/spring.xml", "com/demo/resources/car.xml",
				"com/demo/resources/engine.xml" };
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(file);
		Car car = (Car) applicationContext.getBean("c");
		car.printData();

	}

}
