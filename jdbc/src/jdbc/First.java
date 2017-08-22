package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class First {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// load the driver
			Driver driverRef = new Driver();
			DriverManager.registerDriver(driverRef);
			
			// Class.forName("com.mysql.jdbc.Driver");
			// get the db connection
			String url = "jdbc:mysql://localhost:3306/sid?user=root&password=root";
			con = DriverManager.getConnection(url);

			// issue sql queries
			String query = "select * from student_inf";

			stmt = con.createStatement();
			rs = stmt.executeQuery(query);

			// process the result
			while (rs.next()) {

				int regno = rs.getInt("regno");
				String fname = rs.getString("First_name");
				String mname = rs.getString("middle_name");
				String lname = rs.getString("last_name");

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
				if (con != null)
					con.close();
				if (stmt != null)
					stmt.close();
				if (rs != null)
					rs.close();
			} catch (Exception e) {

				e.printStackTrace();

			}
		}
	}

}
