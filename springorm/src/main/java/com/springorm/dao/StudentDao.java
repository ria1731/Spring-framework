package com.springorm.dao;

import org.springframework.orm.hibernate5.*;
import org.springframework.transaction.annotation.Transactional;

import com.springorm.entities.Student;

public class StudentDao {

private HibernateTemplate hibernateTemplate;
@Transactional
public int insert(Student student) {
	
	// insert
	Integer i=(Integer)this.hibernateTemplate.save(student);
	return i;
}
public HibernateTemplate getHibernateTemplate() {
	return hibernateTemplate;
}
public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
	this.hibernateTemplate = hibernateTemplate;
}
	
}
