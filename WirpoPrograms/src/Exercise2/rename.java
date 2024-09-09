/*
  Name : Asifkhan
  Description : Renaming the file Name.
  Date : 23/07/2024
 */
package Exercise2;

import java.io.File;
import java.io.IOException;

public class rename {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// File Creation 1
		File file1 = new File("C:\\Files_Programs\\file1.txt");
		if(file1.createNewFile()) {
			 System.out.println("File Created");
		 }
		 else {
			 System.out.println("File Already Exists");
		 }
		// File 2 Name
		File file2 = new File("C:\\Files_Programs\\file_rename.txt");
		// Renaming the files
		 boolean renamed=file1.renameTo(file2);
		 if(renamed) {
			 System.out.println("Renamed Succesfully");
		 }
		 else {
			 System.out.println("Failure at Renaming process");
		 }
	}

}
