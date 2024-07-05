package com.springcore.lifecycle.usingAnnotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	AbstractApplicationContext context=	new ClassPathXmlApplicationContext("com/springcore/lifecycle/usingAnnotation/iceCream.xml");
	IceCream ice=(IceCream) context.getBean("ice");
	System.out.println(ice);
	context.registerShutdownHook();
	}

}
