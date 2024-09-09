/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:08:35 IST 2024
 */

package package7;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.StreamCorruptedException;

public class inputStream {

	public static void main(String[] args) throws IOException, ClassNotFoundException,StreamCorruptedException {
		// TODO Auto-generated method stub
		FileInputStream fin = new FileInputStream("C:\\Files_Programs\\serial.txt");
		ObjectInputStream Oin = new ObjectInputStream(fin);
		object obj1 =(object)Oin.readObject();
		System.out.println("Getting content from the fileobject to Console");
		System.out.println("Name : "+obj1.Name);
		System.out.println("Mail Id :  : "+obj1.Mail);
		System.out.println("Number :  : "+obj1.Num);
	}
}
