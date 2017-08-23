package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class CreateTable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection=null; //to connect with database
		Statement statement=null; //statement to run query
		ResultSet resultSet=null; 

		try {
			// load the driver
			Driver driverRef = new Driver();
			DriverManager.registerDriver(driverRef);

			// Class.forName("com.mysql.jdbc.Driver");
			// get the db connection
			String url = "jdbc:mysql://localhost:3306/sid?user=root&password=root";
			connection = DriverManager.getConnection(url);

			// issue sql queries
			// create statement
			String query = "select * from student_inf";

			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);

			// process the result
			while (resultSet.next()) {

				int regno = resultSet.getInt("regno");
				String fname = resultSet.getString("First_name");
				String mname = resultSet.getString("middle_name");
				String lname = resultSet.getString("last_name");

				System.out.println("regno is" + regno);
				System.out.println("First Name is :" + fname);
				System.out.println("Middle Name is :" + mname);
				System.out.println("Last Name is :" + lname);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		// close all the jdbc connection
		finally {

			try {
				if (connection != null)
					connection.close();
				if (statement != null)
					statement.close();
				if (resultSet != null)
					resultSet.close();
			} catch (Exception e) {

				e.printStackTrace();

			}
		}
	}

}
