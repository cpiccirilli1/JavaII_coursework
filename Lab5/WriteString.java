import java.io.*;

/****************
Chelsea Piccirilli
Lab 5 #2
Spring 2019
****************/

public class WriteString{
	public static void WriteString(String fileName, String textToAdd){
		File userFile = new File(fileName);

		try{
			PrintWriter writeFile = new PrintWriter(fileName);
			writeFile.print(textToAdd);
			writeFile.close();
		}
		catch(Exception ex){
			System.out.println(ex.toString());
		}

	}//constructor end

	public static void main(String[] args){
		WriteString ws = new WriteString();
		ws.WriteString("f1.txt","Hello world");
	}

}	