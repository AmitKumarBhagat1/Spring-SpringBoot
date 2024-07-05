package com.springcore.stereotypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args)
	{
	ApplicationContext context=	new ClassPathXmlApplicationContext("com/springcore/stereotypeAnnotation/stereoConfig.xml");
	
	//Mobile mo=context.getBean("mobile",Mobile.class);
	//Mobile mo=(Mobile) context.getBean("mobile");  //Default bean reference
	Mobile mo=(Mobile) context.getBean("std");       //Customized bean reference
	System.out.println(mo);
	System.out.println("sellingSites :"+mo.getSellingSite());
	}

}
