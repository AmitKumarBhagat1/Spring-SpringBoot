package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	private int id;
	private String name;
	
//	@Autowired
//	//Qualifier is used to Specify which been object have to send if
//	// many beans of the class is available
//	@Qualifier("subject")
	private  Subject subject;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Subject getSubject() {
		return subject;
	}
	
	@Autowired
	@Qualifier("subject")
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	//Constructor for Class type DI
	//@Autowired
	public Student( Subject subject) {
		super();
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", subject=" + subject + "]";
	}
	
	

}
