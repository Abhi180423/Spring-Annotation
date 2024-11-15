package com.infy.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class ExtractData implements UserDao {

	private JdbcTemplate jdbcTemplate;

	public ExtractData(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
		
	}

	public boolean fetchData() {
		String sql = "SELECT COUNT(*) FROM student"; 
		Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
		System.out.println("Count ..."+count);
		return count != null && count > 0;
	}

}
