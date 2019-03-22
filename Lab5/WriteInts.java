import java.io.*;

/****************
Chelsea Piccirilli
Lab 5 #1
Spring 2019
****************/



public class WriteInts{
	
	public static void WriteInts(String outFile, int[] int_array)
	{
		File f1 = new File(outFile);
		

		try{
			FileOutputStream fOut = new FileOutputStream(f1);
			DataOutputStream dOut = new DataOutputStream(fOut);

			for( int i=0; i < int_array.length; i++){
				dOut.write(int_array[i]);
			}
		}
		catch(Exception ex){
			System.out.println(ex.toString());
		}

			
	}

	public static void main(String[] args)
	{
		
		int myArr[] = {16, 31, 90, 45, 89};
		WriteInts wi = new WriteInts();
		wi.WriteInts("mydata.dat", myArr);

		
	}//end main
}	