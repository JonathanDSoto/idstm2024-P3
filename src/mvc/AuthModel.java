package mvc;


public class AuthModel {

	public AuthModel() {
	}
	
	public boolean login(String username,String password) {
		
		
		if(username.equals("admin") && password.equals("123"))
			return true;
		
		return false;
	}

}
