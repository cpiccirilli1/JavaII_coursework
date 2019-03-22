/*
*@author Chelsea Piccirilli
*Lab 2
*Spring 2019
*/

public class TestExceptions{
	public static void main(String[] args){
		int[] myArr = new int[10];
		int x,y,z;
		x=0;
		y=10;
		try{
			z=y/x;
		}
		catch(ArithmeticException ex){
			System.out.println("Cannot divide by zero.");
		}
	
		try{
		myArr[10] = 0;
		}
		catch(ArrayIndexOutOfBoundsException a){
			System.out.println("Cannot assign number to an undeclared array spot.");
		}	

	}
}