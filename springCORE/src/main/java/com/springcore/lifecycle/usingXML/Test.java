package com.springcore.lifecycle.usingXML;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	AbstractApplicationContext context=	new ClassPathXmlApplicationContext("com/springcore/lifecycle/usingXML/fastfood.xml");
	FastFood fd=(FastFood) context.getBean("s1");
	System.out.println(fd);
	context.registerShutdownHook();
	}

}
