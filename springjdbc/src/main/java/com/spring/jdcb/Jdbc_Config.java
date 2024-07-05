package com.spring.jdcb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdcb.dao.StudentDao;
import com.spring.jdcb.dao.Student_Implementation;

@Configuration
@ComponentScan("com.spring.jdcb.dao")
public class Jdbc_Config {
	@Bean("ds")
	public DriverManagerDataSource getDataSource()
	{
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/spring_jdbc");
		ds.setUsername("root");
		ds.setPassword("root@1234");
		return ds;
	}
	@Bean("jdbctemplate")
	public JdbcTemplate getTemplate()
	{
		JdbcTemplate temp=new JdbcTemplate();
		temp.setDataSource(getDataSource());
		return temp;
	}
	//@Bean("stdDao")
	public StudentDao getStudentDao()
	{
		Student_Implementation std=new Student_Implementation();
		std.setJdbcTemp(getTemplate());
		return std;
	}
	
	
}
