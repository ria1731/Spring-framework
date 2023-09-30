package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.springjdbc.dao.StudentDAO;
import com.springjdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new AnnotationConfigApplicationContext(jdbcConfig.class);
     //  JdbcTemplate template=context.getBean("jdbcTemplate", JdbcTemplate.class);
     StudentDAO s=context.getBean("studentDAO",StudentDAO.class);
     Student student=new Student();
     student.setId(4);
     student.setName("Diya");
     student.setCity("Pune");
     
     int result=s.insert(student);
     System.out.println("result: "+result);
     
    }
}
