package models;
import java.sql.*;  

public class AuthModel {

	public AuthModel() {
		
	}
	
	
	public void login(String user, String pwd) {
		
		if(user.equals("Admin") && pwd.equals("123")){
			
			System.out.println("Hola");
			
		}else{
			
			System.out.println("Verifique los datos");
			
		}
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			try {
				Connection con=DriverManager.getConnection(  
						"jdbc:mysql://sql.freedb.tech:3306/freedb_db_test_24","freedb_master_of_data","!&F792dv#?5A7!x");
				
				Statement stmt=con.createStatement();  
				ResultSet rs=stmt.executeQuery("select * from users");  
				
				while(rs.next()) {
					
					System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));  
					
				}
					 
				
				
				con.close();  
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
	}
}
