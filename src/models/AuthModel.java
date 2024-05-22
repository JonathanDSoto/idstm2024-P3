package models;
import java.sql.*;

import controllers.HomeController;  

public class AuthModel {

	public HomeController home;
	
	public AuthModel() {
		
	}
	
	
	public boolean login(String user, String pwd) {
		
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://sql.freedb.tech:3306/freedb_db_test_24","freedb_master_of_data","!&F792dv#?5A7!x");
			
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("SELECT * FROM `users` WHERE username = '"+user+"' and password = '"+pwd+"';");  
			
			while(rs.next()) {
				
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));  
				
				home = new HomeController();
				
				home.dashboard();
				
				return true;
				
			}  
			
			con.close(); 
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
		
		return false;
	}
}
