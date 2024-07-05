package com.springcore.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		System.out.println("DI using Constructor........\n");
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/constructor/constructorConfig.xml");
		Store st=(Store) context.getBean("store");
		System.out.println(st);

	}

}
