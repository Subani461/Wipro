/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:08:35 IST 2024
 */

package package7;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class file {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 File file = new File("C:\\Files_Programs\\Emp1.txt");
		 if(file.createNewFile()) {
			 System.out.println("File Created");
		 }
		 else {
			 System.out.println("File Already Exists");
		 }
		 // Reading Contents From the File
		 FileReader File = new FileReader("C:\\Files_Programs\\Emp1.txt");
		 Scanner dataReader = new Scanner(File);
		 while(dataReader.hasNextLine()) {
			 String Data = dataReader.nextLine();
			 System.out.println(Data);
		 }
		 // Information about File Emp1.txt.
		 System.out.println("File exist or not : "+file.exists());
		 System.out.println("The path of the File is : "+file.getAbsolutePath());
		 System.out.println("The size of the File is : "+file.length());
		 System.out.println("Readable or not : "+file.canRead());
		 System.out.println("Writable or not : "+file.canWrite());
		 // file deletion
		// file.delete();

	}

}
