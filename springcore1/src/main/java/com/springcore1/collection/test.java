package com.springcore1.collection;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore1/collection/EmployeeConfig.xml");
		Employee emp1 = (Employee) context.getBean("emp1");
		System.out.println(emp1);
		System.out.println(emp1.getPhones());
		System.out.println(emp1.getProps());
		
	}

}
