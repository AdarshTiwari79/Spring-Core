package com.springcore1.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Mobile {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Setting Mobile name");
	}

	@Override
	public String toString() {
		return "Mobile [name=" + name + "]";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("mobile initialization method call");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("mobile destroy method call");
	}

}
