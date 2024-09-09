/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:08:35 IST 2024
 */

package package7;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filewriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter file = new FileWriter("C:\\Files_Programs\\Emp2.txt");
		file.write("empid        empName"+"\n");
		file.write(" 1           Asif"+"\n");
		file.write(" 2           Imran"+"\n");
		file.write(" 3           Aashish"+"\n");
		BufferedWriter bw = new BufferedWriter(file);
		String data =" 4           Irfan";
		bw.write(data);
		bw.close();
		// Displaying the File Content in the Console. 
		FileReader File = new FileReader("C:\\Files_Programs\\Emp1.txt");
		 Scanner dataReader = new Scanner(File);
		 while(dataReader.hasNextLine()) {
			 String Data = dataReader.nextLine();
			 System.out.println(Data);
		 }
		file.close();
	}

}
