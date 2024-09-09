/*
  	Name : Asifkhan
    Description :Inserting Data into Mysql  using Java Program.
    Date : 25/07/2024

 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class sql2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","rps@123");
		System.out.println("Connection Succesfull...");
		//Creating Table
		Statement stmt = con.createStatement();
		String Table ="Create table Books(NumId int,Name varchar(20),Price int);";
		stmt.executeUpdate(Table);
		//Adding values into the table;
		String Insert = "insert into Books values(101,\"JungleBook\",180)";
		stmt.executeUpdate(Insert);
	}

}
