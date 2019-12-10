package databasehelper;

import java.sql.Connection;
import java.sql.DriverManager;

public class Helper {
	

	public static Connection getConnection() throws ClassNotFoundException, Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root",
				"Root");
		
		return con;

	

}
}