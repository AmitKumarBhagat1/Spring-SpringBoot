package com.jpa.test.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jpa.test.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>
{
	//Supported keywords inside methods name     ->link of keywords
	//https://docs.spring.io/spring-data/jpa/docs/current-SNAPSHOT/reference/html/#repository-query-keywords
	//Customized method to find the data from DB
	public List<User> findByCity(String city);
	public List<User> findByNameAndCity(String name,String city);
	public List<User> findByNameStartingWith(String prefix);
	
	//JPQL
	@Query("select u From User u")
	public List<User> getAllUser();
	//JPQL
	@Query("select u From User u WHERE u.name =:n and u.city =:c")
	public  List<User> getUserByName(@Param("n") String name, @Param("c") String city);
	//NativeQuery
	@Query(value = "select * from User",nativeQuery = true)
	public List<User> getUser();
		
	
}
