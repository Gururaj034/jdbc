package Script;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DataBase_Connection 
{
	@Test
	public void script() throws SQLException
	{
		String user ="root";
		String pass="root";
		String url="jdbc:mysql://localhost:3306/king";
		
		Connection conn = DriverManager.getConnection(url, user, pass);
		Statement statement = conn.createStatement();
		ResultSet out = statement.executeQuery("select * from tiger where kaadu='amazon'");
		out.next();
		String username = out.getString(1);
		String password = out.getString("soppu");
		System.out.println("the user name is  "+username);
		System.out.println("the password is   "+password);
		
		System.out.println("ningidu bekittaaa magane");
		
	
	}

}
