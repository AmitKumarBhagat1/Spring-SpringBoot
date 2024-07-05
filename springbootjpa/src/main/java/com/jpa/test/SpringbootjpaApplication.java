package com.jpa.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entity.User;

@SpringBootApplication
public class SpringbootjpaApplication {

	public static void main(String[] args) {
		ApplicationContext con=SpringApplication.run(SpringbootjpaApplication.class, args);
		UserRepository repo=con.getBean(UserRepository.class);
	
	/*		User user=new User();
			user.setName("rahul");
			user.setCity("jodhpur");
			user.setStatus("clurk");
			User user2=new User();
			user2.setName("rohit2");
			user2.setCity("johnpur2");
			user2.setStatus("PA2");*/
			
			  // To save single entity
			 // User us=repo.save(user); 
			 //System.out.println(us);
			 
			
				/*
				 * //To save multiple entities List<User> users=List.of(user,user2);
				 * Iterable<User> result=repo.saveAll(users);
				 * 
				 * result.forEach(user1 -> { System.out.println(user1); });
				 */
			
			
			//Update the User details
			/*
			 * Optional<User> op=repo.findById(102); User user=op.get();
			 * user.setName("Ramlal"); User res=repo.save(user); System.out.println(res);
			 */
		//Deleting the element
		repo.deleteById(152);
		
		//Get all the data from database
		//Iterable<User> itr=repo.findAll();
		/*
		 * Iterator<User> iterator=itr.iterator(); while (iterator.hasNext()) { User
		 * user =iterator.next(); System.out.println(user);
		 * 
		 * }
		 */
		
		//itr.forEach(user ->System.out.println(user) );
		
		//=====     find the data by city name(Customized way)    ==========
		System.out.println("======== Element by City========");
		List<User> byCity = repo.findByCity("johnpur");
		byCity.forEach(city->System.out.println(city));
		
		//======    find the data by name and city(customized way)	  ============
		System.out.println("==========Element by name and city========");
		List<User> byNameAndCity = repo.findByNameAndCity("Amit", "Darbhanga");
		byNameAndCity.forEach(nAndc ->System.out.println(nAndc));
		
		//======    find the data by prefix name(customized way)	  ============
		System.out.println("==========Prefix =========");
		List<User> byNameStartingWith = repo.findByNameStartingWith("a");
		 byNameStartingWith.forEach(preName ->System.out.println(preName));
		 
		 
		 //============   Customized Method without Supported key words   ============
		 System.out.println("Find all user Customized method using Query annotation");
		 List<User> allUser = repo.getAllUser();
		 allUser.forEach(allU->{
			 System.out.println(allU);
		 });
		 System.out.println("=================rahul data=======================");
		 List<User> userByName = repo.getUserByName("rahul","jodhpur");
		 userByName.forEach(byName1->System.out.println(byName1));
		 
		 System.out.println("==================All data=========================");
		 repo.getUser().forEach(us->System.out.println(us));
		 
		 
	}

}
