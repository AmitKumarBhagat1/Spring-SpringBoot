package com.springcore.autowire.annotation;

import java.util.Map;

public class Subject {
	private Map<String,Double> subMarks;
	
	public Map<String, Double> getSubMarks() {
		return subMarks;
	}

	public void setSubMarks(Map<String, Double> subMarks) {
		this.subMarks = subMarks;
	}

	@Override
	public String toString() {
		return "[subMarks=" + subMarks + "]";
	}


	
	

}
