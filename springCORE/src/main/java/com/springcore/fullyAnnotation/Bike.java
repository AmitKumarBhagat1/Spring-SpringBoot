package com.springcore.fullyAnnotation;

import org.springframework.beans.factory.annotation.Value;

public class Bike {
	@Value("RoyalEnfield")
	private String name;
	@Value("Bullet")
	private String model;
	@Value("350")
	private double cc;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getCc() {
		return cc;
	}
	public void setCc(double cc) {
		this.cc = cc;
	}
	@Override
	public String toString() {
		return "Bike [name=" + name + ", model=" + model + ", cc=" + cc + "]";
	}
	
	

}
