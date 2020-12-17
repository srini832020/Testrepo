package Javatut;

public class Super3 extends Super2 {

	String color="Yellow";
	public void printcolor()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Super3 obj1=new Super3();
obj1.printcolor();

	}

}
