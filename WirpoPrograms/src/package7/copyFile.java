/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:08:35 IST 2024
 */

package package7;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class copyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader file1 = new FileReader("C:\\Files_Programs\\source.txt");
		FileWriter file2 = new FileWriter("C:\\Files_Programs\\Destination1.txt");
		int ch;
		int count=0;
		// Copying the Contents from one file to other file.
		while((ch=file1.read()) !=-1){
			// Counting no of vowels present in a given file. 
			if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='u' || ch=='U' || ch=='i' || ch=='I' || ch=='o' || ch=='O' ) {
				count++;
			}
			file2.write(ch);
		}
		System.out.println(count);
		file2.close();
		file1.close();
	}

}
