package connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insertDatabase {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");

		Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Instagram_db", "root",
				"Root");

		Statement stmt = (Statement) con.createStatement();
		
		  String insertsql =
		  "insert into clients (first_name, last_name,address,city,state,email,phone) values"
		  +
		  " ('Safi','Haidary','2531 pink park rd','Arlington','VA','sf@gmail.com',301-222-8585)"
		  ;
		  
		  
		  stmt.executeUpdate(insertsql);
		 

		
		  String insertsql1 =
		  "insert into clients (first_name,last_name,company_id,company_name,email,phone,address,State) values"
		  +
		  "('mike','tamara',5231,'nestle','mt@yahoo.com',804-222-3636,'Charlottesville','VA')";
		  
		  stmt.executeUpdate(insertsql1);
		 

		String insertsql3 = "insert into posts (post_discription, user_id) values ('Enjoying the games!!', 4),('I am sick today', 6)";

		stmt.executeUpdate(insertsql3);

		stmt.close();

		con.close();
	}

}
