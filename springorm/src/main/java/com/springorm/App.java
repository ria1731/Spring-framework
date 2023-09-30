package com.springorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.dao.StudentDao;
import com.springorm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springorm/config.xml");
        StudentDao sd=context.getBean("studentDao",StudentDao.class);
        
        Student student=new Student(5,"Eiya","Eia");
        
        int r=sd.insert(student);
        System.out.println("result: "+r);
     
    }
}
