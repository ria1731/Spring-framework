package com.spring.autowire;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.*;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/autowire/config.xml");
      emp e1=context.getBean("emp1",emp.class);	
	  System.out.println(e1);
	}

}
