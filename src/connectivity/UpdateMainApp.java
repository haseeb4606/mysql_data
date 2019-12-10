package connectivity;

import java.sql.Connection;
import java.sql.Statement;

import databasehelper.*;

public class UpdateMainApp  { 

	public static void main(String[] args) throws ClassNotFoundException, Exception {
	
	Connection con = Helper.getConnection();
	Statement stm = (Statement) con.createStatement();
	
	String updateSql = "Update comments set comment_discription = 'Good luck' where comment_discription = 'Good lucj'";
		
	stm.executeUpdate(updateSql);
	
	
	stm.close();
	
	
	con.close();
		

	}

}
