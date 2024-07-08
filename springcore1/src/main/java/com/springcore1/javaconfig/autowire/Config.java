package com.springcore1.javaconfig.autowire;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean
	public Teacher getTeacher() {
		Teacher teacher = new Teacher();
		teacher.teach();
		return teacher;
		
	}
	
	@Bean({"student","stud","temp"})
	public Student getStudent() {
		Student student = new Student();
		student.setName("Adarsh Tiwari");
		return student;
	}
	
	
}
