package com.springcore1.constructorInjection;

public class Ambiguity {
	
	private int num1;
	private int num2;
	
	public Ambiguity(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		System.out.println("Constructor containing both int called.");
	}
	
	public Ambiguity(double num1, double num2) {
		this.num1 = (int)num1;
		this.num2 = (int)num2;
		System.out.println("Constructor containing both double called.");
	}
	
	public Ambiguity(String num1, String num2) {
		this.num1 = Integer.parseInt(num1);
		this.num2 = Integer.parseInt(num2);
		System.out.println("Constructor containing both string called.");
	}
	
	public void doSum() {
		int sum = num1 + num2;
		System.out.println("sum of numbers = "+sum);
	}

	@Override
	public String toString() {
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
		return "Ambiguity [num1=" + num1 + ", num2=" + num2 + "]";
	}
	

}
