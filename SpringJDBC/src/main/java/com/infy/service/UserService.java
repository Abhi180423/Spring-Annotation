package com.infy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.infy.dao.UserDao;

@Service
public class UserService {
	public UserService() {
		System.out.println("UserService constructor...");
	}

	@Autowired
	@Qualifier("dao")
	private UserDao dao;

	public Boolean proceedToDataBase() {
		return dao.fetchData(); 
	}
}
