package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateTable {
	public static void main(String args[]) throws Exception {
		Connection connection;  //to connect with database
		Statement statement;  //statement to run query
		
		//load the driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//get the database connection
		//
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sid?user=root&password=root");
		statement = connection.createStatement();

		//issue the sql query and print the result
		int result = statement.executeUpdate("update student_inf"
				+ " set first_name='Om',middle_name='K',last_name='shah' where regno=201");
		System.out.println(result + " records affected");
		
		//close the connection
		
		connection.close();
		statement.close();
	}
}
