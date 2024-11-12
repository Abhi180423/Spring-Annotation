package com.infy.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infy.config.AppConfig;
import com.infy.service.ServicesRepoProcess;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		ServicesRepoProcess repo = ctx.getBean(ServicesRepoProcess.class);
		repo.proceedData();

	}

}
