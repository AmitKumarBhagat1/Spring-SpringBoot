
package com.springcore.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		System.out.println("Collection based Dependency Injection.....\n");
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/Collection/collection.xml");
		
		Employee emp1=(Employee) context.getBean("Emp1");
		System.out.println(emp1.getName());
		System.out.println(emp1.getPhones());
		System.out.println(emp1.getAddresses());
		System.out.println(emp1.getCources());
		
	}

}
