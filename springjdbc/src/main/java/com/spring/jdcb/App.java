package com.spring.jdcb;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdcb.dao.Student_Implementation;
import com.spring.jdcb.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Spring JDBC Programs........." );
        //Spring JDBC => jdbc Templet
        ApplicationContext context=
        		
        		new AnnotationConfigApplicationContext(Jdbc_Config.class);
        		
        	  //new ClassPathXmlApplicationContext("com/spring/jdcb/config.xml");
     Student_Implementation stdImp =(Student_Implementation) context.getBean("stdDao");
     
     Student student=new Student();
  //=======================================INSERT==================================================   
  //   student.setId(101);
  // student.setName("Satya");
  // student.setCity("Hyderabad"); 
  // int result=stdImp.insert(student);
  //System.out.println(result+" recore added......");
   
     //=========================================UPDATE==============================================
    // student.setId(101);
    //student.setName("Satish");
    // student.setCity("Ahmedabad"); 
    //int result=stdImp.modify(student);
    //System.out.println(result+" recore updated......");
    //==============================================DELETE=========================================== 
     
     //int result=stdImp.delete(101);
     //System.out.println(result+"Record Deleted..........");
     
     //==================================================SELECT 1 ROW=====================
     
     //Student std=stdImp.getStudent(1002);
     //System.out.println(std	);
     
     //============================================SELECT MULTIPLE ROWS================
     
     List<Student> students=stdImp.getMultipleSutdents();
     for(Student s:students)
     {
    	 System.out.println(s);
     }
     
    }
}
