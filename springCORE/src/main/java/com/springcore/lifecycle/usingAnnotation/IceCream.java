package com.springcore.lifecycle.usingAnnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class IceCream {	
	private String name;
	private String flavour;
	private double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFlavour() {
		return flavour;
	}
	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "IceCream [name=" + name + ", flavour=" + flavour + ", price=" + price + "]";
	}
	@PostConstruct
	public void start() {
		System.out.println("Initializing Method....");
		
	}
	@PreDestroy
	public void end() {
		System.out.println("Destroying method......");
		
	}
	
	
}
