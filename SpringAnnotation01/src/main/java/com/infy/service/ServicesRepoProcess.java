package com.infy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.infy.repo.Dtointerface;
@Service
public class ServicesRepoProcess {
	@Autowired
	@Qualifier("dto")
	private Dtointerface dto;
	
	public void proceedData() {
		int data =dto.getData();
		if(data >0) {
			System.out.println("proceed..");
		}
	}
	
	
}
