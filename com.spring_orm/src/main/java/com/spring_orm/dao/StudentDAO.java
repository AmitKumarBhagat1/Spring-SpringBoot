package com.spring_orm.dao;

import java.util.List;

import com.spring_orm.Student;

public interface StudentDAO {
	
	public int saveStudent(Student student);
	public Student getStudent(int id);
	public List<Student> getStudent();
	public void updateStudent(Student Student);
	public void deleteStudent(int id);

}
