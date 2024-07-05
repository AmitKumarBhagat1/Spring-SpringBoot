package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Referance type Dependency Injection.....\n ");
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ref/refConfig.xml");
		Student std=(Student) context.getBean("student");
		System.out.println(std.getStdId());
		System.out.println(std.getStdName());
		System.out.println(std.getAdd().getStreet()+" "+std.getAdd().getCity()+" "+std.getAdd().getState()+" "+std.getAdd().getCountry());

	}

}
