package com.springcore1.lifecycle;

public class Book {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Setting the name of the book.");
	}

	@Override
	public String toString() {
		return "Book [name=" + name + "]";
	}
	
	public void init() {
		System.out.println("book initialization method call");
	}
	
	public void destroy() {
		System.out.println("book destroy method call");
	}
	
}
