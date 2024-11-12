package com.infy.springBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


//@Component This Annotation represent java class a a Spring bean 
@Component
public class CreditCard {
	
	//if we want to fetch dependent object in target object then we are using @AutoWired Annotations 
	// in this project we are using variable level Autowired there are 3 types out of that we are using Variable one 
	//variable , Constructor , Setter method this 3 are the types
	@Autowired
	@Qualifier("MCard")
	private MasterCard Mcard;
	@Autowired
	private VisaCard Vcard;
	
	public void payment() {
		int amount=Mcard.cardDetail();
		if(amount>25) {
			System.out.println("payment done successfully");
		}else {
			System.out.println("check amount");
		}
	}
	
	
	
}
