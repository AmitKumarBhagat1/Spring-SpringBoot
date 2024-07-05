package com.springcore.fullyAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.springcore.fullyAnnotation")
public class Config{
@Bean("getB")	
public Bike getBike()
{
	return new Bike();
}

@Bean("getV")
public Vehicle getVehicle() {
	return new Vehicle(getBike());
}
	

}
