package com.springcore1.constructorInjection;

import java.util.List;

public class Person {

	private String name;
	private int pId;
	private Certificate certi;
	private List<String> list;
	
	public Person(String name, int pId, Certificate certi, List<String> list) {
		super();
		this.name = name;
		this.pId = pId;
		this.certi = certi;
		this.list = list;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", pId=" + pId + ", certi=" + certi + ", list=" + list + "]";
	}
}
