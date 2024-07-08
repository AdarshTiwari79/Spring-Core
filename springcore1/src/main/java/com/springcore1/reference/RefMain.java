package com.springcore1.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefMain {

	public static void main(String[] args) {


		ApplicationContext context;
		context = new ClassPathXmlApplicationContext("com/springcore1/reference/LaptopConfig.xml");
		
		Laptop lap1 = (Laptop) context.getBean("lap1");
		Laptop lap2 = (Laptop) context.getBean("lap2");
		System.out.println(lap1);
		System.out.println(lap2);

	}

}
