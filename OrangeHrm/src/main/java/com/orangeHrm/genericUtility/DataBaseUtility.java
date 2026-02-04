package com.orangeHrm.genericUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DataBaseUtility {
Connection con;
ResultSet result;
	
	public void getDatabaseConnection(String url,String username,String password) {
		Driver driver;
		try {
			driver = new Driver();
			DriverManager.registerDriver(driver);
			con=DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void closeDbConnection() {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	
	public ResultSet executeConSelectQuery(String query) {
		try {
			Statement st = con.createStatement();
			result= st.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  result;
	}
	
	
	public int executeNonSelectQuery(String query) {
		int result =0;
		try {
			Statement st = con.createStatement();
			result=st.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	
}
