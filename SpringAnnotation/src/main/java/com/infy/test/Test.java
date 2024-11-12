package com.infy.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infy.config.AppConfig;
import com.infy.springBean.CreditCard;

public class Test {

	public static void main(String[] args) {
		// here we are using input as a configure class so thats why we are passing class file as a input and we are using 
		//new AnnotationConfigApplicationContext () object 
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		CreditCard crd=ctx.getBean(CreditCard.class);
		crd.payment();

	}

}
