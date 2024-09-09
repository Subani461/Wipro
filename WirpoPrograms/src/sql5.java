/*
  Name : Asifkhan
  Description :Calling Procedures from MySql  using Java Program.
  Date : 25/07/2024
 */
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class sql5 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","rps@123");
		System.out.println("Connection Succesfull...");
		CallableStatement stmt = con.prepareCall("{call P300}");
		stmt.setInt(1,105);
		stmt.setString(2, "Book");
		stmt.setInt(3, 2000);
		stmt.executeUpdate();
		System.out.println("Procedure Called..");
	}

}
