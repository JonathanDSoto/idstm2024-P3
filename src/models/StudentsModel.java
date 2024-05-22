package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import controllers.HomeController;

public class StudentsModel {

	public StudentsModel() {
		
	}
	
	public List<List> get() {
		
		List<List> data = new ArrayList();
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://sql.freedb.tech:3306/freedb_db_test_24","freedb_master_of_data","!&F792dv#?5A7!x");
			
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("SELECT * FROM `students`");    
			
			while(rs.next()) {
				
				//System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));  
				
				String [] student = { rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)};
				List<String> info = Arrays.asList(student);
				
				data.add(info);
				
			}
			
			//data = (List<List>) rs;
			
			con.close(); 
			
			return data;
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		return null;
	}

	public boolean add(String name,String noControl,String dato) {
		
		//insert
		
		return false;
		
	}
}
