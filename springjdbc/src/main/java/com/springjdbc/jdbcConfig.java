package com.springjdbc;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springjdbc.dao.StudentDAOImp;

@Configurable
public class jdbcConfig {
    @Bean("ds")
	public DataSource getDataSource() {
		
    DriverManagerDataSource ds=new DriverManagerDataSource();
    ds.setDriverClassName("com.mysql.jdbc.Driver");
    ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
    ds.setUsername("riya");
    ds.setPassword("riya");
    return ds;
	}
    
    @Bean("jdbcTemplate")
    public JdbcTemplate getTemplate() {
    
    JdbcTemplate jdbcTemplate = new JdbcTemplate();
	jdbcTemplate.setDataSource(getDataSource());
	return jdbcTemplate;
    }
    
    @Bean("studentDAO")
    public StudentDAOImp getStudentDao() {
    StudentDAOImp studentDAO=new StudentDAOImp();
    studentDAO.setJdbcTemplate(getTemplate());
    return studentDAO;
    }
}
