package com.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.demo.entity.Test;

@SuppressWarnings("deprecation")
public class SimpleSpringDemo {
	public static void main(String args[]) {

		// find xml
		Resource resource = new ClassPathResource("com/demo/resources/spring.xml");

		// load xml into container
		BeanFactory factory = new XmlBeanFactory(resource);

		/*
		 * Note : BeanFactory (core container) will not create any object during load
		 * xml file But ApplicationContext (J2EE container) create object
		 */

		// create object of Test class
		Object object1 = factory.getBean("test1");

		Test test1 = (Test) object1;
		test1.printSomething("Pawan");
	}
}
