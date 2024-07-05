package com.springcore.standalone.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Vehicle {
	private List<String> car;
	private Set<String> truck;
	private Map<String, String> bike;
	
	
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<String> getCar() {
		return car;
	}
	public void setCar(List<String> car) {
		this.car = car;
	}
	public Set<String> getTruck() {
		return truck;
	}
	public void setTruck(Set<String> truck) {
		this.truck = truck;
	}
	public Map<String, String> getBike() {
		return bike;
	}
	public void setBike(Map<String, String> bike) {
		this.bike = bike;
	}
	public Vehicle(List<String> car, Set<String> truck, Map<String, String> bike) {
		super();
		this.car = car;
		this.truck = truck;
		this.bike = bike;
	}
	@Override
	public String toString() {
		return "Vehicle [car=" + car + ", truck=" + truck + ", bike=" + bike + "]";
	}
	
	

}
