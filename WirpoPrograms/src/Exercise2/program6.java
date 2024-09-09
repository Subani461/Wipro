/*
  Name : Asifkhan
  Description : Checking Whether the file is present in Directory or not.
  Date : 23/07/2024
 */
package Exercise2;

import java.io.File;
import java.io.IOException;

public class program6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file1 = new File("C:\\Files_Programs//deletion.txt");
		if(file1.createNewFile()) {
			 System.out.println("File Created");
		 }
		 else {
			 System.out.println("File Already Exists");
		 }
		String Path = file1.getAbsolutePath();
		System.out.println(Path);
		if(file1.exists()) {
			boolean delete = file1.delete();
			if(delete) {
				System.out.println("File does not Exist in file directory");
			}
			else {
				System.out.println("Failure at Deleting the file");
			}
		}
		else {
			System.out.println("File doesn't Exist");
		}
	}

}
