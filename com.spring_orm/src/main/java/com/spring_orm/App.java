package com.spring_orm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring_orm.dao.StudentDAO;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext con = new ClassPathXmlApplicationContext("com/spring_orm/configORM.xml");
		// HibernateTemplate temp=con.getBean("template",HibernateTemplate.class);
		// System.out.println(temp);
		StudentDAO dao = con.getBean("stDao", StudentDAO.class);
		
		//Insert Data==================
		
		  Student st = new Student(); 
		  st.setId(8);
		  st.setName("Kali8");
		  st.setAddress("Delhi8"); 
		  int i=dao.saveStudent(st);
		  System.out.println(i+"  row effected");
		 
		  
		 //Get Specific Data===============
		System.out.println("==========  Single Data   ==========");
		Student get = dao.getStudent(3);
		System.out.println(get);
		
		  //Update the Data
		  Student up = new Student(); 
		  up.setId(3); 
		  up.setName("+++");
		  up.setAddress("++++");
		  dao.updateStudent(up);
		  System.out.println("Update effected...");
		  
		  //delete the data
		  dao.deleteStudent(1);
		  
		  //Get all the data==================
		  System.out.println("============ List of Data  =========");
		  List<Student> list = dao.getStudent();
		  for (Student st1 : list) {
		  System.out.println(st1);
			}
	}
}
