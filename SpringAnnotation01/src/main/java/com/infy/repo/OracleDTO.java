package com.infy.repo;

import org.springframework.stereotype.Repository;

@Repository
public class OracleDTO implements Dtointerface {
	@Override
	public int getData() {
		System.out.println("Oracle data loading....");
		return 1;

	}
}
