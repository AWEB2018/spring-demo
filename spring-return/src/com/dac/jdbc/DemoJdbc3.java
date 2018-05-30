package com.dac.jdbc;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class DemoJdbc3 {
	
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	public  void readAll() {
		try {
			String sql = "SELECT * FROM POST";
			List<Map<String, Object>> list =  jdbcTemplate.queryForList(sql);
			System.out.println(list);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void readByid() {
		try {
			String sql = "SELECT * FROM POST WHERE ID=?";
			List<Map<String, Object>> list =  jdbcTemplate.queryForList(sql, 1);
			System.out.println(list);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
	public void insertPost() {
		try {
			String sql = "INSERT INTO POST (POST, LIKE_COUNT, DISLIKE_COUNT) VALUES (?, ?, ?)";
			jdbcTemplate.update(sql, "HELLOOOOO!!", 10, 100);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
}
