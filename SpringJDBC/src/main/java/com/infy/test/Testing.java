package com.infy.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infy.config.AppConfig;
import com.infy.service.UserService;

public class Testing {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService ser = ctx.getBean(UserService.class);
		Boolean result = ser.proceedToDataBase();
		System.out.println("result is " + result);
	}

}
