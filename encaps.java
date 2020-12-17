package Javatut;

public class encaps{
	private String username;
	public String getname()
	{
		return username;
	}
	public void setname(String username)
	{
		this.username=username;
	}
	
	public static void main(String[] args) {

		encaps obj1=new encaps();
		obj1.setname("Srini");
		System.out.println(obj1.getname());
		
}
}

