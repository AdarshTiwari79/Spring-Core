package com.springcore1.auto.wire;

public class Employee {

	private Address address1;

//	public Address getAddress() {
//		return address;
//	}
//
//	public void setAddress(Address address) {
//		this.address = address;
//		System.out.println("setter method is used to set value: Inside setter");
//	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

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
