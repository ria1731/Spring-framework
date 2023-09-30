package com.springjdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.entities.Student;

public class StudentDAOImp implements StudentDAO {

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	private JdbcTemplate jdbcTemplate;
	public int insert(Student student) {
	
		 //insert
	       String query="insert into student(id,name,city) values(?,?,?)";
	       
	       //fire query
	       int result = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
	       return result;
	       
	}

}
