package com.springcore.fullyAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext con=
				new AnnotationConfigApplicationContext(Config.class);
		
		Vehicle v=con.getBean("veh",Vehicle.class);
		System.out.println(v.getBike());
		v.myBike();
	}

}
