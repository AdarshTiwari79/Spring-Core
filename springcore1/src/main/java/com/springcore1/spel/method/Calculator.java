package com.springcore1.spel.method;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("calci")
public class Calculator {

	@Value("#{T(java.lang.Math).sqrt(144)}")
	private String squareRootValue;
	@Value("#{T(java.lang.Math).E}")
	private double e;
	@Value("#{new java.lang.String('Adarsh Tiwari')}")
	private String name;
	
	public String getSquareRootValue() {
		return squareRootValue;
	}
	public void setSquareRootValue(String squareRootValue) {
		this.squareRootValue = squareRootValue;
	}
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Calculator [squareRootValue=" + squareRootValue + ", e=" + e + ", name=" + name + "]";
	}
}
