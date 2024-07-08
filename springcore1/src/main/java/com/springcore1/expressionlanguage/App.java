package com.springcore1.expressionlanguage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore1/expressionlanguage/BaseConfig.xml");
		Base b = context.getBean("base",Base.class);
		System.out.println(b);

	}

}
