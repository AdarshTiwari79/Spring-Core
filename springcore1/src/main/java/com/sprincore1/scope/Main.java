package com.sprincore1.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/sprincore1/scope/StudentConfig.xml");
		Teacher teacher1 = con.getBean("teacher",Teacher.class);
		System.out.println(teacher1.hashCode());
		Teacher teacher2 = con.getBean("teacher",Teacher.class);
		System.out.println(teacher2.hashCode());
		
		Student stud1 = con.getBean("stud",Student.class);
		System.out.println(stud1.hashCode());
		Student stud2 = con.getBean("stud",Student.class);
		System.out.println(stud2.hashCode());
	}

}
