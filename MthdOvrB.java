package Javatut;

public class MthdOvrB extends MthdOvrA {
	public void calcarea()
	{
	int l=10;
	int b=30;
	int result=l*b;
	System.out.println("Subclass value is"+result);
	
}
	public static void main(String[] args) {
		MthdOvrA obj1=new MthdOvrA();
		MthdOvrB obj2=new MthdOvrB();
		MthdOvrA obj3=new MthdOvrB();
		obj1.calcarea();
		obj2.calcarea();
		obj3.calcarea();
}
}