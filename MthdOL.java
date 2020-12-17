package Javatut;

public class MthdOL {
	public void display()
	{
		System.out.println("Inside empty method");
	}
	public void display(String username)
	{
		System.out.println("Inside method with single argument");
		System.out.println(username);
	}
	public void display(String username,String password)
	{
		System.out.println("Inside method with two arguments");
		System.out.println("Username is:"+username+"Password is:"+password);
	}

	public static void main(String[] args) {
MthdOL obj=new MthdOL();
obj.display();
obj.display("user1");
obj.display("user1","pass1");
}
}
