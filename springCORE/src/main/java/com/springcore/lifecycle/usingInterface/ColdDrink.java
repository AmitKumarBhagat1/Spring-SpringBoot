package com.springcore.lifecycle.usingInterface;

import java.util.Map;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ColdDrink implements InitializingBean,DisposableBean
{
	private String name;
	private Map<String, Double> list;
	
	
	public ColdDrink() {
		super();
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, Double> getList() {
		return list;
	}
	public void setList(Map<String, Double> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "ColdDrink [name=" + name + ", list=" + list + "]";
	}
	public void destroy() throws Exception {
		System.out.println("Destroy  method......");
		
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("Init  method..........");
		
	}
	
	

}
