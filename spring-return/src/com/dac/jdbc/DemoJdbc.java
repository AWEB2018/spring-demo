package com.dac.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DemoJdbc {
	
	public static void readAll() {
		try {
			String url = "jdbc:mysql://localhost:3306/DAC2018";
			String username = "root";
			String password = "";
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(url, username, password);
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
	
	public static void main(String[] args) {
		readAll();
	}
}
