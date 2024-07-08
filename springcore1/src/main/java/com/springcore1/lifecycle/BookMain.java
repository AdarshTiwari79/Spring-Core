package com.springcore1.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookMain {

	public static void main(String[] args) {

		AbstractApplicationContext context;
		context = new ClassPathXmlApplicationContext("com/springcore1/lifecycle/bookconfig.xml");

		Book book1 = (Book) context.getBean("book1");
		System.out.println(book1);
		Cup cup1 = (Cup)context.getBean("cup1");
		System.out.println(cup1);
		Mobile mob1 = (Mobile)context.getBean("mobile");
		System.out.println(mob1);
		
		context.registerShutdownHook();
	}

}
