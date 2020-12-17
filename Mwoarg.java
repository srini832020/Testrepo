package Javatut;

import javax.swing.JOptionPane;

public class Mwoarg {

	String input;
	public void display()
	{
		input=JOptionPane.showInputDialog("Please enter the input:");
		System.out.println(input);
	}
	public static void main(String[] args) {
		Mwoarg ob=new Mwoarg();
		ob.display();

	}

}
