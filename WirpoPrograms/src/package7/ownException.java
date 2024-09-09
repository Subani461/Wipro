/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:08:35 IST 2024
 */

package package7;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ownException {
	static void copyFile(String source1,String destination2) throws FileNameMissingException, IOException {
		if(source1==null || source1.isEmpty()) {
			throw new FileNameMissingException("Source File name is missing");
		}
		if(destination2==null || destination2.isEmpty()) {
			throw new FileNameMissingException("Destination File name is missing");
		}
		FileReader file1 = new FileReader("C:\\Files_Programs\\source1.txt");
		FileWriter file2 = new FileWriter("C:\\Files_Programs\\destination2");
		int ch;
		while((ch=file1.read()) != -1) {
			file2.write(ch);
		}
		file1.close();
		file2.close();
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			copyFile("source1","");
		}
		catch(FileNameMissingException e) {
			System.out.println(e.getMessage());
		}
	}

}
