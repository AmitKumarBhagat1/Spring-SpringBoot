package com.spring.jdcb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdcb.entity.Student;

public class RowMappre_Imple implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student std=new Student();
		std.setId(rs.getInt(1));		//To select 1st column from the DB integer type
		std.setName(rs.getString(2));	//To select 2nd column from the DB String type
		std.setCity(rs.getString(3));	//To select 3rd column from the DB String type
		return std;
	}

}
