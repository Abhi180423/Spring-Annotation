package com.infy.springBean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component()
//@Component This Annotation represent java class a a Spring bean 
public class VisaCard {
	public VisaCard() {
		System.out.println("VisaCard Constructor....");
	}
	public int cardDetail() {
		return 5;

	}
}
