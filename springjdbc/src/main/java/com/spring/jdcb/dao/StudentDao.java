package com.spring.jdcb.dao;

import java.util.List;

import com.spring.jdcb.entity.Student;

public interface StudentDao {
	public int insert(Student student);
	
	public int modify(Student student);
	
	public int delete(int id);
	
	public Student getStudent(int id);
	
	public List<Student> getMultipleSutdents();
}
