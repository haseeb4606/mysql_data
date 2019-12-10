package connectivity;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


import databasehelper.Helper;

public class SelectMain {
	
	
	public static void main(String[] args) throws ClassNotFoundException, Exception {
		
		Connection con = Helper.getConnection();
		Statement stm = (Statement) con.createStatement();
	
	
		String sql = " select * from users where user_id = user_id";
		
		ResultSet rs = stm.executeQuery(sql);
		
		while (rs.next()) {
			Thread.sleep(1000);
			int user_id = rs.getInt("user_id");
			
			String first_name = rs.getString("first_name");
			String last_name = rs.getString("last_name");
			long phone = rs.getLong("phone");
			String address = rs.getString("address");
			
			System.out.print("user Id: "+user_id+" "+"First Name: "+first_name+" "+"Last Name:"+last_name+" "+"phone number"+phone+" "+"Address:"+address);
			
			
			
			
			
		}
		
		

	}
	

}
