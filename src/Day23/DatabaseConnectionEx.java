package Day23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionEx {

	public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/test";
        String username = "root";
        String password = "shreyas";
 
		try
		{

			Connection conn = DriverManager.getConnection(url,username,password);

			if(conn==null)
			{
				System.out.println("Connection failed");
			}
			else
			{
				System.out.println("Connection Succeed");
			}
		}
		catch(SQLException ex)
		{
			System.out.println(ex);
		}
	}

}
