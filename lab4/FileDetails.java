import java.io.File;
/********************
Chelsea Piccirilli
Lab 4
Spring 2019
********************/

public class FileDetails{


	public static void FileDetails(String fileName){
		File userFile = new File(fileName);

		boolean doesExist = userFile.exists();

		if (doesExist) {
		System.out.println("Can " + fileName + " be read? " + userFile.canRead());
		System.out.println("Can " + fileName + " be written? " + userFile.canWrite());
		}
		else{
			System.out.println("The file specified does not exist!");
		}


	}//end constructor

	public static void main(String[] args){
		FileDetails fd = new FileDetails();
		fd.FileDetails("seashells.txt");
	}

}//end class