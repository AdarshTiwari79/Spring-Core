package com.springcore1.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	
	
	private Address address1;

	public Address getAddress() {
		return address1;
	}

	
	public void setAddress(Address address1) {
		this.address1 = address1;
		System.out.println("setter method is used to set value: Inside setter");
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public Employee(Address address1) {
		super();
		this.address1 = address1;
		System.out.println("constructor of employee");
	}

	@Override
	public String toString() {
		return "Employee [address=" + address1 + "]";
	}
	
}
