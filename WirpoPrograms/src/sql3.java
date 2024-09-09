/*
  Name : Asifkhan
  Description :Updating data in mysql using Java Program.
  Date : 25/07/2024
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class sql3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","rps@123");
		System.out.println("Connection Succesfull...");
		String sql =" Update books set Name =? where NumId=?";
		PreparedStatement pstmt = con.prepareStatement(sql);;		
		pstmt.setString(1,"CheetahBook");
		pstmt.setInt(2, 105);
		pstmt.executeUpdate();
		
		String sql2 = "Update books set Name=\"BirdsBook\" where Numid=104";
		PreparedStatement pstmt1 = con.prepareStatement(sql2);
		pstmt1.executeUpdate();
		
		// Deleting from a database
		
		String sql3 = "Delete from books where NumId=?";
		PreparedStatement pstmt2 = con.prepareStatement(sql3);
		pstmt2.setInt(1, 104);
		pstmt2.executeUpdate();
		
		String sql4 = "Update books set NumId=? where Name=?";
		PreparedStatement pstmt3= con.prepareStatement(sql4);
		pstmt3.setInt(1,104);
		pstmt.setString(2, "CheetahBook");
		pstmt3.executeUpdate();
		
		System.out.println("Updated Successfully");
	}

}
