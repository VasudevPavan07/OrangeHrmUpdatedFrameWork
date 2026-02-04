package jdbcExecutions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ExecuteQueryJdbc {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		//load and register driver 
		Driver driverref = new Driver();
		DriverManager.registerDriver(driverref);
		
		//establisth the connection btw ts and db
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/orangehrm","root","root");
		
		//create platform
		Statement st = con.createStatement();
		
		//execute query and process the data
//		ResultSet result = st.executeQuery("select *  from employeedata");
		
		
		int res = st.executeUpdate("insert into employeedata values('orange3','hrm','678','7897');");
		
		if(res==1) {
			System.out.println("data added");
		}
		else {
			System.out.println("data not added");
		}
		
		
//		while(result.next()) {
//		 System.out.println(result.getString(1) +" " +result.getString(2)+ " "+ result.getString(3) +" " +result.getString(4) );
//		}
		
		//close all the costly resources
		con.close();
		

	}

}
