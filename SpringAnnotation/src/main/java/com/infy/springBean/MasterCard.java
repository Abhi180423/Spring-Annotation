package com.infy.springBean;

import org.springframework.stereotype.Component;

@Component("MCard")
//@Component This Annotation represent java class a a Spring bean 
public class MasterCard {
	public MasterCard() {
		System.out.println("MasterCard Constructor....");
	}

	public int cardDetail() {
		return 90;
		
	}
}
