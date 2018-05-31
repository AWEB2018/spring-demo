package com.dac.servlet;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("sampleDao")
public class SampleDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public  void readAll() {
		try {
			String sql = "SELECT * FROM POST";
			List<Map<String, Object>> list =  jdbcTemplate.queryForList(sql);
			System.out.println(list);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
