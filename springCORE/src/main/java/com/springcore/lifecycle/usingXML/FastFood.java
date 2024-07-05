package com.springcore.lifecycle.usingXML;

public class FastFood {
	private String name;
	private double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		System.out.println("price......");
		this.price = price;
	}
	
	
	public FastFood() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "FastFood [name=" + name + ", price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Initilizing the life-cycle method.....");
	}
	public void destroy() {
		System.out.println("Destroing the life-cycle method.....");

	}

}
