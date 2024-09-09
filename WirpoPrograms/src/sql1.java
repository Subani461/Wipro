/* 
  Name : Asifkhan
  Description :Retrieving data from Mysql using Java Program.
  Date : 25/07/2024
  
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class sql1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =null;
		try {
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","rps@123");
			if(con!=null) {
				System.out.println("Connection Successful");	
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from EnpDetails");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+"  "+rs.getString(4));
		}
		con.close();
	}

}
