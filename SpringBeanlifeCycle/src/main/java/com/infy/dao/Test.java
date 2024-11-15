package com.infy.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		// with line no (9)line we will get init and destroyed method with the help of
		// (init-method="initiat" and destroy-method="destroy")which we define in
		// Bean.xml file
		ApplicationContext context=new AnnotationConfigApplicationContext(UserDao.class);
		UserDao dao = context.getBean(UserDao.class);
		dao.getConnection();

	}

}
