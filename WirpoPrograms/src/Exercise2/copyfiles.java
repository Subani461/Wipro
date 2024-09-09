/*
  Name : Asifkhan
  Description : Copying content from one file to another file.
  Date : 23/07/2024
 */
package Exercise2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class copyfiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader file1 = new FileReader("C:\\Files_Programs\\source.txt");
		FileWriter file2 = new FileWriter("C:\\Files_Programs\\destination");
		int ch;
		while((ch=file1.read()) != -1) {
			file2.write(ch);
		}
		file1.close();
		file2.close();
	}

}
