package com.springcore1.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Cup implements InitializingBean,DisposableBean{

	private int Price;

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
		System.out.println("Setting the price of the cup");
	}

	@Override
	public String toString() {
		return "Cup [Price=" + Price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("cup initializing method call");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("cup destroy method call");
	}
}
