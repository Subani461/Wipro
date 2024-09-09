/*
  Name : Asifkhan
  Description : Writing the Contents into the file
  Date : 23/07/2024
 */
package Exercise2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileP {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String S1 = sc.nextLine();
		String S2 = sc.nextLine();
		String S3 = sc.nextLine();
		String S4 = sc.nextLine();
		String S5 = sc.nextLine();
		FileWriter file = new FileWriter("C:\\Files_Programs\\Emp3.txt");
		file.write(S1+"\n");
		file.write(S2+"\n");
		file.write(S3+"\n");
		file.write(S4+"\n");
		file.write(S5+"\n");
		file.close();
	}

}
