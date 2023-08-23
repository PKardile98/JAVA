package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TESTDB1 {

	public static void main(String[] args) throws SQLException {

		Connection collection1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql_data", "root",
				"PRASHANT123");
		//jdbc: mysql: // localhost:3306/order_table
		if (collection1.isClosed()) {

			System.out.println("we have not connected to the db");
		} else {
			System.out.println("we have sucessfully connected to db");
		}

	}

}
