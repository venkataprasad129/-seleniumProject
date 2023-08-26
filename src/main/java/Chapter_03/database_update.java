package Chapter_03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class database_update {

	public static void main(String[] args) throws SQLException 
	{
		//step1--create an instance of JDBC Driver
		Driver dbDriver= new Driver();
		//regiser Driver
		DriverManager.registerDriver(dbDriver);
		
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/advancesel","root","root");
		
		Statement statement= connection.createStatement();
		
		int result=statement.executeUpdate("insert into employees(id,name,salary,phone)"+" values(105,'venkat',550000,'5432112345');");
		
		if (result == 1)
			System.out.println("Database updated successfully");
		else
			System.out.println("Database update failed");
		
		connection.close();

	}

}
