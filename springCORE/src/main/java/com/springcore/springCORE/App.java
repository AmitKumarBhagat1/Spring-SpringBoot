package com.springcore.springCORE;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("First Spring Maven Project......\n");
       ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
       
       Student std1=(Student) context.getBean("std1");
       System.out.println(std1);
       Student std2=(Student) context.getBean("std2");
       System.out.println(std2);
       Student std3=(Student) context.getBean("std3");
       System.out.println(std3);
    }
}
