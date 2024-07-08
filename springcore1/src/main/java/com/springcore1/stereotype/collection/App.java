package com.springcore1.stereotype.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore1/stereotype/collection/StudentConfig.xml");
		Student std1=con.getBean("student1",Student.class);
		System.out.println(std1);
		System.out.println(std1.getAddress().getClass().getName());
	}

}
