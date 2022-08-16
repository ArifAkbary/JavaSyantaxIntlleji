package Class12;

public class Taskpassword {

	public static void main(String[] args) {
		//Store username, password and confirm password from a user and check following requirements:
	//Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
		//Password should be minimum 8 characters, if less → message=”Password is too short”.
	//Password cannot contain username if so, → message=”Password cannot contain username”.
	//Password should match confirmed password, if not  → message=“Passwords do not match”.
	//Only after all requirements met → message “Your username and password has been created”
	
		String userName="Arifakbary";
	    String password="12345678";
	    String conformPasword="12345678";
	    
	    if(userName.isEmpty() || password.isEmpty()) {
	    	System.out.println("User name and password can not be empty!");
	    }else if(password.length()<8) {
	    	System.out.println("password is too short!");
	    	
	    }else if(!password.contains(userName)) {
	    	System.out.println("pasword can not contain user name!");
	    }else if(password.equals(conformPasword)) {
	    	System.out.println("password do not match");
	    }else {
	    	System.out.println("Your account has been created ");
	    }
	    
		

	}

}
