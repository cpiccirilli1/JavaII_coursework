import java.io.File;
import java.util.Scanner;
/********************
Chelsea Piccirilli
Lab 4
Spring 2019
********************/

public class FileRead{
	public static void FileRead(String fileName){
		File readMe = new File(fileName);

		if (readMe.exists()){
			try{
			
				Scanner readOut = new Scanner(readMe);
				while(readOut.hasNext()){
					String line1 = readOut.nextLine();
					System.out.print(line1);
				}//end while
			}//end try
			catch(Exception ex){
				System.out.print(ex.toString());
			}//end catch
		}//end if
		else{
			System.out.print("File does not exist!");
		}
	}//end constr

	public static void main(String[] args){
		FileRead fr = new FileRead();
		fr.FileRead("seashells.txt");
	}

}//end class