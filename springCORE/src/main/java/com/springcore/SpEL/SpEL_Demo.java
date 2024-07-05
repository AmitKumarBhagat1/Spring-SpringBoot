package com.springcore.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpEL_Demo {
	@Value("#{5*5+2}")
	private int x;
	@Value("#{T(java.lang.Math).sqrt(144)}")
	private double sqrt;
	@Value("#{T(java.lang.Math).PI}")
	private double pi;
	@Value("#{new java.lang.String('Amit Kumar')}")
	private String name;
	@Value("#{10-6>=4}")
	private boolean isAvailablel;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public double getSqrt() {
		return sqrt;
	}
	public void setSqrt(double sqrt) {
		this.sqrt = sqrt;
	}
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isAvailablel() {
		return isAvailablel;
	}
	public void setAvailablel(boolean isAvailablel) {
		this.isAvailablel = isAvailablel;
	}
	@Override
	public String toString() {
		return "SpEL_Demo [x=" + x + ", sqrt=" + sqrt + ", pi=" + pi + ", name=" + name + ", isAvailablel="
				+ isAvailablel + "]";
	}
	
	
}
