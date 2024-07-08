package com.springcore1.reference;

public class Laptop {

	private String name;
	private String model;
	private String brand;
	private Keyboard key1;
	
	public String getBrand() {
		return brand;
	}
	public Keyboard getKey1() {
		return key1;
	}
	public String getModel() {
		return model;
	}
	public String getName() {
		return name;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setKey1(Keyboard key1) {
		this.key1 = key1;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Laptop [name=" + name + ", model=" + model + ", brand=" + brand + ", key1=" + key1 + "]";
	}
	
	
	
}
