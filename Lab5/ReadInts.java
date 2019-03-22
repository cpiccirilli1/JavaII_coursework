import java.io.*;

/****************
Chelsea Piccirilli
Lab 5 #2
Spring 2019
****************/

public class ReadInts{
	public static void ReadInts(String inFile){
		File f1 = new File(inFile);

		try
		{
			FileInputStream fInput = new FileInputStream(f1);
			DataInputStream dInput = new DataInputStream(fInput);
			int data = dInput.read();
			System.out.println(data);

		}//try
		catch(Exception ex){
			System.out.println(ex.toString());
		}//catch
	}// end constr

	public static void main(String[] args){
		ReadInts ri = new ReadInts();
		ri.ReadInts("mydata.dat"); 
	}//end main
}//end class