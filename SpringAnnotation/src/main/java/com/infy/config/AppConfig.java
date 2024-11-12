package com.infy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//Configuration annotation is represent java class as configuration

//if we want to proceed with Spring bean classes(@component) from current project then Component scan will identify all the available bean classes 
@Configuration
@ComponentScan(basePackages = "com.infy")
public class AppConfig {

//	 // i have created Engine class and i have not used @component
//	annotation so in this case if we want to work our class as Spring bean class
//	 then we have to create method with the class and then we have to define @Bean
//	 annotaion over the method then that class work on IOC 
//	 //so @bean Annotations
//	 applies on method not a class 
	@Bean
	public Engine eng() {
		Engine eng = new Engine();
		return eng;
	}

}
