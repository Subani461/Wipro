/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:08:35 IST 2024
 */

package package7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class printStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Files_Programs\\print.txt");
		if(file.createNewFile()) {
			System.out.println("New File Created Succesfully..");
		}
		else {
			System.out.println("Already File exist in the C drive");
		}
		FileOutputStream fout = new FileOutputStream("C:\\Files_Programs\\print.txt");
		PrintStream p;
		p = new PrintStream(fout);
		p.print("Welcome to Java Programming Language"+"\n");
		p.print("Java is Object Oriented Programming Language");
		fout.close();
	}

}
