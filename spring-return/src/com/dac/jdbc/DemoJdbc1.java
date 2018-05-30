package com.dac.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.DataSource;

public class DemoJdbc1 {
	
	private  DataSource datasource; 
	
	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}

	public  void readAll() {
		try {
			Connection conn = datasource.getConnection();
			Statement st = conn.createStatement();
			
			String sql = "SELECT * FROM POST";
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				String post = rs.getString("POST");
				System.out.println(post);
			}
			
			conn.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
