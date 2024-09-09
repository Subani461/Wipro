/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:08:35 IST 2024
 */

package package7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serialization {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Files_Programs\\serial.txt");
		if(file.createNewFile()) {
			System.out.println("New File Created Succesfully..");
		}
		else {
			System.out.println("Already File exist in the C drive");
		}
		object obj = new object("Asif","Pathanasifkhan461@gmail.com",6305438229l);
		FileOutputStream fout = new FileOutputStream("C:\\Files_Programs\\serial.txt");
		ObjectOutputStream oout = new ObjectOutputStream(fout);
		oout.writeObject(obj);
		oout.flush();
		fout.close();
		System.out.println("Executed Succesfully...");
	}

}
