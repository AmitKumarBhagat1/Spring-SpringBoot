package com.spring_orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring_orm.Student;

public class StudentImplement implements StudentDAO
{
	private HibernateTemplate htemp;
	
	
	public HibernateTemplate getHtemp() {
		return htemp;
	}

	public void setHtemp(HibernateTemplate htemp) {
		this.htemp = htemp;
	}

	@Transactional
	public int saveStudent(Student student) {
		int i=(Integer) htemp.save(student);
		return i;
	}

	public Student getStudent(int id) {
		Student st=htemp.get(Student.class, id);
		return st;
	}

	public List<Student> getStudent() {
		List<Student> list=htemp.loadAll(Student.class);
		return list;
	}
	@Transactional
	public void updateStudent(Student student) {
		htemp.update(student);
		
	}
	@Transactional
	public void deleteStudent(int id) {
		Student st=htemp.get(Student.class, id);
		htemp.delete(st);
		
	}

}
