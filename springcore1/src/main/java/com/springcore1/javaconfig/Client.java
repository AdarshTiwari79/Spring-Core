package com.springcore1.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext con = new AnnotationConfigApplicationContext(com.springcore1.javaconfig.Config.class);
		Student stud1 = con.getBean("temp",Student.class);
		System.out.println(stud1);

	}

}
