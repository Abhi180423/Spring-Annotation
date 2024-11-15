package com.infy.dao;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class UserDao implements InitializingBean, DisposableBean {
	public UserDao() {
		System.out.println("user Dao...");
	}

//	public void initiat() {
//		System.out.println("Connection initiated....");
//	}
	public void getConnection() {
		System.out.println("Connection got started...");
	}
//	public void destroy() {
//		System.out.println("connection destryrd....");
//	}

	public void destroy() throws Exception {

		System.out.println("Connection initiated....");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("connection destryrd....");

	}

	// Line number ((13 to 15) and (19 to21) works Declerative Approch in spring
	// bean life cycle
	// not to run above line we need to remove implemented interfaces
	// and line no 23 to 31 works on Programtic approch so for that we need to
	// implement (InitializingBean, DisposableBean) interfaces

}
