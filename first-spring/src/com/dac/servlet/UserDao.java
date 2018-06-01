package com.dac.servlet;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("userDao")
public class UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Map<String, Object>> readAll() {
		String sql = "SELECT * FROM USER";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		return list;
	}
	
	
	public boolean createUser(String uname, String pwd, String fname, String lname, String mobile) {
		String sql = "INSERT INTO USER (USERNAME, PASSWORD, FIRST_NAME, LAST_NAME, MOBILE_NO) VALUES (?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql, uname, pwd, fname, lname, mobile);
		return true;
	}
	
	public boolean loginUser(String uname,String pwd) {
		String sql="SELECT * FROM USER WHERE USERNAME=? AND PASSWORD=?";
		List<Map<String, Object>> list=jdbcTemplate.queryForList(sql,uname,pwd);
		if(list.size()==0) {
			return false;
		}
		else {
			return true;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
