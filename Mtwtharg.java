package Javatut;

public class Mtwtharg {

	public void login(String username,String password)
	{
		System.out.println("Username:"+username);
		System.out.println("Password:"+password);
	}
	
	public static void main(String[] args) {
		Mtwtharg ob=new Mtwtharg();
		ob.login("user1","pass1");
		ob.login("user2","pass2");
	
	}

}
