/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:05:53 IST 2024
 */

package Exercise3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class program3 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileReader file = new FileReader("C:\\Files_Programs\\Emp983.txt");
		int count=0;
		Scanner dataReader = new Scanner(file);
		while(dataReader.hasNextLine()) {
			 String Data = dataReader.nextLine();
			count++;
		 }
		System.out.println("No of Lines in file : "+count);
	}

}
