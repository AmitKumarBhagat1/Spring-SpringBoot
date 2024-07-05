package com.spring.jdcb.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdcb.entity.Student;
@Component("stdDao")
public class Student_Implementation implements StudentDao{
	@Autowired
	private JdbcTemplate jdbcTemp;

	public int insert(Student student) {
		 
        //Insert Query
        String query="insert into student(id,name,city)values(?,?,?)";
        int r= this.jdbcTemp.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}
	
	public int modify(Student student) {
		//Update Query
		String query="update student set name=? , city=? where id=?";
		int r=this.jdbcTemp.update(query, student.getName(),student.getCity(),student.getId());
		return r;
	}
	
	public int delete(int id) {
		//Delete Query
		String query="delete from student where id=?";
		int r=this.jdbcTemp.update(query,id);
		return r;
	}
	public Student getStudent(int id) {
		// Select Query (select 1 row)
		String query="select * from student where id=? ";
		RowMapper<Student> rowMapper =new RowMappre_Imple();
		Student student=this.jdbcTemp.queryForObject(query, rowMapper,id);
		//RowMapper will convert the resultSet into object form so
		// we  are storing in the student object;
		return student;
	}
	
	public List<Student> getMultipleSutdents() {
		//Select Morethen 1 object
		String query="select * from student";
		List<Student> students=this.jdbcTemp.query(query, new RowMappre_Imple());
		return students;
	}



	public JdbcTemplate getJdbcTemp() {
		return jdbcTemp;
	}
	//@Autowired
	public void setJdbcTemp(JdbcTemplate jdbcTemp) {
		this.jdbcTemp = jdbcTemp;
	}



	

	
	


}
