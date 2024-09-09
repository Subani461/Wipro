/*
  Name : Asifkhan
  Description :inserting data in  mysql with prepare Statement using Java Program.
  Date : 25/07/2024
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class sql4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","rps@123");
		System.out.println("Connection Succesfull...");
		PreparedStatement stmt = con.prepareStatement("insert into books values(?,?,?);");
		stmt.setInt(1, 102);
		stmt.setString(2,"AdventureBook");
		stmt.setInt(3,300);
		stmt.setInt(1, 103);
		stmt.setString(2,"HungryCheetah");
		stmt.setInt(3,500);
		stmt.executeUpdate();
		System.out.println("Insertion done...");
	}

}
