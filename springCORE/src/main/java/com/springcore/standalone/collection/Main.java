package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/standalone/collection/standalone.xml");
	Vehicle v=(Vehicle) context.getBean("vehicle");
	System.out.println("VEHICLE  LIST.......");
	System.out.println("Bikes :"+v.getBike());
	System.out.println(v.getBike().getClass().getName());
	System.out.println("---------------------------------------------------");
	System.out.println("Cars :"+v.getCar()+"\n"+v.getCar().getClass().getName());
	System.out.println("---------------------------------------------------");
	System.out.println("trucks :"+v.getTruck()+"\n"+v.getTruck().getClass().getName());
	}

}
