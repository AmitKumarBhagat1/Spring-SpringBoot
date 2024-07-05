package com.springcore.lifecycle.usingInterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
	AbstractApplicationContext context=	new ClassPathXmlApplicationContext("com/springcore/lifecycle/usingInterface/coldDrink.xml");
	ColdDrink cd=(ColdDrink) context.getBean("c1");
	System.out.println(cd);
	context.registerShutdownHook();
	}

}
