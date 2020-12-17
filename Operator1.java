package Javatut;

public class Operator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=10;
System.out.println(a++);
System.out.println(++a);
System.out.println(a--);
System.out.println(--a);
System.out.println("End excs1");

//
System.out.println(a++ + ++a);//
System.out.println(b++ + b++);//

System.out.println("End excs2");
//

int i=10;  
int j=-10;  
boolean k=true;  
boolean l=false;  
System.out.println(~i);
System.out.println(~j);
System.out.println(!k);
System.out.println(!l);
//
System.out.println("End excs3");
int x=10;  
int y=5;  
System.out.println(x+y);
System.out.println(x-y);
System.out.println(x*y); 
System.out.println(x/y);
System.out.println(x%y);
System.out.println("End excs4");
//
System.out.println(10*10/5+3-1*4/2);  
System.out.println("End excs5");
//
System.out.println(10<<2); 
System.out.println(10<<3);
System.out.println(20<<2);
System.out.println(15<<4);  
System.out.println("End excs6");
//

System.out.println(10>>2); 
System.out.println(20>>2);
System.out.println(20>>3);
System.out.println("End excs7");

//
int a1=10;  
int b1=5;  
int c1=20;  
System.out.println(a1<b1&&a1<c1); 
System.out.println(a1<b1&a1<c1);
System.out.println("End excs8");

int a2=10;  
int b2=5;  
int c2=20;  
System.out.println(a2>b2||a2<c2);
System.out.println(a2>b2|a2<c2);
System.out.println("End excs9");

int f=10;  
f+=3;
System.out.println(f);  
f-=4;
System.out.println(f);  
f*=2;
System.out.println(f);  
f/=2;
System.out.println(f);  
System.out.println("End excs10");



}
}
