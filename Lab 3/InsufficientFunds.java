/***************************
@author Chelsea Piccirilli
Lab 3
Spring 2019
****************************/
package lab 3;


public class InsufficientFunds extends Exception
{
	private String msg = "Stop trying to overdraft!";
	
	public String toString(){
		return msg;
	}
	
	public void display(){
		System.out.println(msg);
	}
}