package Chapter_03;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

;

public class sql_data_1 {

	public static void main(String[] args) throws SQLException 
	{
		
           Driver dbDriver=new Driver();
           

		DriverManager.registerDriver(dbDriver);
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/advancesel","root","root");
		
		Statement statement=connection.createStatement();
		
		ResultSet result=statement.executeQuery("select * from employees");
		
		while(result.next())
		{
			System.out.println(result.getInt("id")+"\t"+result.getString("name")+"\t"+result.getInt("salary")+"\t"+(result.getString("phone")));
			
			
		}
		connection.close();

	}

}
