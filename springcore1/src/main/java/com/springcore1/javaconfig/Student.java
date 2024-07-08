package com.springcore1.javaconfig;


public class Student {
	
	
	private String name;
	private Teacher teach;

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Teacher getTeach() {
		return teach;
	}

	public void setTeach(Teacher teach) {
		this.teach = teach;
	}

	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Teacher teach) {
		super();
		this.teach = teach;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", teach=" + teach + "]";
	}
	
}
