package com.springcore1.spel.method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore1/spel/method/MainConfig.xml");
		Calculator cal1 = con.getBean("calci",Calculator.class);
		System.out.println(cal1);
	}

}
