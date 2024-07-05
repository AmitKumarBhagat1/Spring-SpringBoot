package com.springcore.stereotypeAnnotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("std")
public class Mobile {
	
	@Value("Samsung")
	private String brand;
	@Value("S20")
	private String model;
	@Value("8")
	private int ram;
	@Value("128")
	private int rom;
	@Value("#{sellingSite}")
	private List<String> sellingSite;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getRom() {
		return rom;
	}
	public void setRom(int rom) {
		this.rom = rom;
	}
	
	public List<String> getSellingSite() {
		return sellingSite;
	}
	public void setSellingSite(List<String> sellingSite) {
		this.sellingSite = sellingSite;
	}
	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", model=" + model + ", ram=" + ram + ", rom=" + rom + "]";
	}
	
	
}
