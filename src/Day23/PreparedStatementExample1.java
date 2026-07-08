package Day23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatementExample1 {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/test";
		String username = "root";
		String pass = "shreyas";
		
		String selectSql = "SELECT * FROM employee";

		String createTable = """
  				CREATE TABLE IF NOT EXISTS employee(
  					id INT PRIMARY KEY,
  					name VARCHAR(30),
  					age INT
  				)
  		""";
		String sql = "INSERT INTO employee(id,name,age) VALUES(?,?,?)";
		
		try(
				
				Connection conn = DriverManager.getConnection(url,username,pass);
                Statement stmt = conn.createStatement();
				PreparedStatement ps = conn.prepareStatement(sql);
		){
			stmt.executeUpdate(createTable);
			ps.setInt(1, 6);
		    ps.setString(2, "Rohan");
		    ps.setInt(3, 24);
		    
		    int rows = ps.executeUpdate();

		    System.out.println(rows + " Record Inserted");
		    
		    ResultSet rs = stmt.executeQuery(selectSql);
		    
    	  	while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                System.out.println(id + " " + name + " " + age);
            }
    	  	stmt.executeUpdate("DROP TABLE employee");

		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
	}

}
