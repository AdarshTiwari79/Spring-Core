package com.springcore1.stereotye;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore1/stereotye/StereoConfig.xml");
		Employee emp1=con.getBean("emp", Employee.class);
		System.out.println(emp1);
	}

}
