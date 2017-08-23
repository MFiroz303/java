package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteOperation {
	public static void main(String args[]) throws Exception {
		Connection connection;  //to connect with database
		Statement statement;  //statement to run query
		
		//load the driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//get the database connection
		//create statement
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sid?user=root&password=root");
		statement = connection.createStatement();
		
		//process the result
		int result = statement.executeUpdate(" delete from student_inf where regno=101 ");
		System.out.println(result + " records affected");
		
		//close the connection
		connection.close();
		statement.close();
	}
}