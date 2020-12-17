package Javatut;

import java.util.Scanner;

public class Basicp {

public static void main(String[] args) {
	int a;
	String b;
	boolean c;
	double d;
	//-------------------------------------------------------
	System.out.println("please enter integer input"+"\n");
    Scanner input1 = new Scanner(System.in);
  	a=input1.nextInt();
  	System.out.println(a);
	//-------------------------------------------------------
	b=input1.nextLine();
	System.out.println(b);
	//-------------------------------------------------------
	c=input1.nextBoolean();
	System.out.println(c);
	//-------------------------------------------------------
	d=input1.nextDouble();
	System.out.println(d);
	//-------------------------------------------------------
    input1.close();
	}

	}



