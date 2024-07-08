package com.springcore1.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore1/standalone/collection/AloneConfig.xml");
		Person person1=(Person)con.getBean("person1");
		System.out.println(person1);
	}

}
