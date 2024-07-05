package com.springcore.fullyAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("veh")
public class Vehicle {
		
	private Bike bike;
	
	
	
	public Vehicle(Bike bike) {
		super();
		this.bike = bike;
	}


	public Bike getBike() {
		return bike;
	}
	public void setBike(Bike bike) {
		this.bike = bike;
	}



	public void myBike() {
		System.out.println("My Favourite Bike is "+ bike);
		
	}
	

}
