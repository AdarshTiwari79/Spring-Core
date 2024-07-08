package com.springcore1.auto.wire.annotation.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context;
		context = new ClassPathXmlApplicationContext("com/springcore1/auto/wire/annotation/qualifier/EmployeeConfig.xml");
		Employee emp1 = context.getBean("emp1",Employee.class);
		System.out.println(emp1);
	}

}