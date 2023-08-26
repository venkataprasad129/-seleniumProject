package Generic_libraries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Driver;

public class Database_utility {
	private Connection connection;
	private Statement statement;
	
	public void databaseInitialization(String url, String user, String pwd)
	{
		Driver dbDriver=null;
		try
		{
			dbDriver=new Driver();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		try
		{
			DriverManager.registerDriver(dbDriver);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			
		}
		try 
		{
			connection=DriverManager.getConnection(url, user, pwd);
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		try
		{
			statement=connection.createStatement();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}
	
	public List<Object>readFormatDatabase(String query, String ColumnName) throws SQLException 
	{
     ResultSet result =statement.executeQuery(query);

      List<Object> list =new ArrayList<Object>();
      while(result.next())
       {
	     list.add(result.getString(ColumnName));
        }
      return list;
}

public int modifyDatabase(String query)
{
	int result =0;
	try
	{
		result =statement.executeUpdate(query);
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	return result;
	
}
 public void closeDatabase() throws SQLException
 {
	 connection.close();
 }
 }
 



