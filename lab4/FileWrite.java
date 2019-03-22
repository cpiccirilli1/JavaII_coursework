import java.io.*;
/********************
Chelsea Piccirilli
Lab 4
Spring 2019
********************/

public class FileWrite{
	public static void FileWrite(String fileName, String textToAdd){
		File userFile = new File(fileName);

		boolean doesExist = userFile.exists();

		if (doesExist) {
			try{
				PrintWriter writeFile = new PrintWriter(fileName);
				writeFile.print(textToAdd);
				writeFile.close();
			}
			catch(Exception ex){
				System.out.println(ex.toString());
			}

		}// end if
	}//constructor end

	public static void main(String[] args){
		FileWrite fw = new FileWrite(); 
		fw.FileWrite("seashells.txt", "Go Braves!"); 
	}//main end
}//end class