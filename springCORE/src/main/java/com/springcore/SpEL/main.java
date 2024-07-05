package com.springcore.SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		ApplicationContext context=
				new ClassPathXmlApplicationContext("com/springcore/SpEL/spelconfig.xml");
		SpEL_Demo  demo=context.getBean("spEL_Demo",SpEL_Demo.class);
		System.out.println(demo);

	}

}
