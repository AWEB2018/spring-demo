package com.dac.jdbc;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class DemoJdbc2 {
	
	private  DataSource datasource; 
	private JdbcTemplate jdbcTemplate;
	
	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
		this.jdbcTemplate = new JdbcTemplate(datasource);
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
}
