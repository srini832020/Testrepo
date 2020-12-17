package Javatut;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.annotation.processing.FilerException;


public class Exception {

	FileReader file=null;
	public void case1() 
	{
		
		
		try
		{
			FileReader file=new FileReader("D:/testing/check/srini.txt");
			System.out.println("inside try");
			
		}
		
		catch(FileNotFoundException e1)
		{
			System.out.println(e1);
			System.out.println("Inside catch1");
		}
		catch(IOException e2)
		{
			System.out.println(e2);
			System.out.println("Inside catch2");
			
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
