package Javatut;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.annotation.processing.FilerException;


public class Exception2 {

	
	public static void case1() throws IOException 
	{
		int x=10;
		int y=0;
		
		try
		{
			int num=x/y;
			return;
			
		}
		
		finally
		{
		
			System.out.println("Inside finally Statement");
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Exception ob1=new Exception();
		ob1.case1();

	}

}
