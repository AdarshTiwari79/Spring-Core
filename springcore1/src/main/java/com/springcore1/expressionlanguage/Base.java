package com.springcore1.expressionlanguage;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("base")
public class Base {
	
	@Value("#{time}")
	private Map<String, Integer> time_table;

	public Map<String, Integer> getTime_table() {
		return time_table;
	}

	public void setTime_table(Map<String, Integer> time_table) {
		this.time_table = time_table;
	}

	@Override
	public String toString() {
		return "Base [time_table=" + time_table + "]";
	}

}
