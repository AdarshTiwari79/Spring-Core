package com.springcore1.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CiMain {

	public static void main(String[] args) {
		
		ApplicationContext context;
		context = new ClassPathXmlApplicationContext("com/springcore1/constructorInjection/CiConfig.xml");
		Person person1 = (Person) context.getBean("person1");
		System.out.println(person1);
		
		Ambiguity confusion1 = (Ambiguity)context.getBean("confusion");
		System.out.println(confusion1);
		confusion1.doSum();
	}

}
