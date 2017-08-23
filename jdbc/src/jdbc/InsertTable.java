package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertTable {
	public static void main(String args[]) throws Exception {

		Connection connection; //to connect with database
		PreparedStatement preparedStatement; //statement to run query

		// Take command line input
		int regno = Integer.parseInt(args[0]);
		String first_name = (args[1]);
		String middle_name = (args[2]);
		String last_name = (args[3]);

		// load the driver
		Class.forName("com.mysql.jdbc.Driver");

		// get the database connection
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sid?user=root&password=root");

		// issue sql query
		// create statement
		String sql = "insert into student_inf values(?,?,?,?)";
		preparedStatement = connection.prepareStatement(sql);

		// process the result
		preparedStatement.setInt(1, regno);
		preparedStatement.setString(2, first_name);
		preparedStatement.setString(3, middle_name);
		preparedStatement.setString(4, last_name);

		int rs = preparedStatement.executeUpdate();
		System.out.println(rs + "records affected");

		// close the connection
		connection.close();
		preparedStatement.close();

	}
}
