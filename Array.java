package Javatut;

public class Array {
	public void display1()
	{
		String stdname[]=new String[3];
		stdname[0]="user1";
		stdname[1]="user2";
		stdname[2]="user3";
		System.out.println("Student name is:"+stdname[0]);
	}
	public void display2()
	{
		int i=0;
		String stdid[]={"100","101","102"};
		for(i=0;i<3;i++)
		{
			System.out.println("Student id is:"+stdid[i]);
		}
}
	public static void main(String[] args) {

		Array obj=new Array();
		obj.display1();
		obj.display2();
}
}
