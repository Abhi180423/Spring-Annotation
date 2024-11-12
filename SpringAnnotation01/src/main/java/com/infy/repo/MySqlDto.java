package com.infy.repo;

import org.springframework.stereotype.Repository;

@Repository("dto")
public class MySqlDto implements Dtointerface {

	@Override
	public int getData() {
		System.out.println("MySql data loading....");
		return 1;

	}

}
