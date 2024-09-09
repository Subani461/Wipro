/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:05:53 IST 2024
 */

package Exercise3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class program11 {
	static void createFile() throws IOException {
		 File file = new File("C:\\Files_Programs\\Emp982.txt");
		 if(file.createNewFile()) {
			 System.out.println("File Created");
		 }
		 else {
			 System.out.println("File Already Exists");
		 }
	}
	static void readFile() throws FileNotFoundException {
		 FileReader File = new FileReader("C:\\Files_Programs\\Emp982.txt");
		 Scanner dataReader = new Scanner(File);
		 while(dataReader.hasNextLine()) {
			 String Data = dataReader.nextLine();
			 System.out.println(Data);
		 }
	}
	static void writeFile() throws IOException {
		FileWriter file = new FileWriter("C:\\Files_Programs\\Emp983.txt");
		file.write("empid        empName"+"\n");
		file.write(" 1           Asif"+"\n");
		file.write(" 2           Imran"+"\n");
		file.write(" 3           Aashish"+"\n");
		file.close();
	}
	static void appendFile() throws IOException {
		String path = "C:\\Files_Programs\\Emp983.txt";
		String text = " 4           Ezaz";
		FileWriter writer = new FileWriter(path,true);
		writer.write(text);
		writer.close();
	}
	static void displayMenu() {
		System.out.println("1. Create a new File ");
		System.out.println("2. Read the contents of the File");
		System.out.println("3. Write content to the file");
		System.out.println("4. Append content to the file");
		System.out.println("5. Exit");
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        displayMenu();
        int choice;
        do {
        	choice = sc.nextInt();
        	 switch(choice) {
             case 1:
             	createFile();
             	break;
             case 2:
             	readFile();
             	break;
             case 3:
             	writeFile();
             	break;
             case 4:
             	appendFile();
             	break;
             case 5:
             	System.out.println("exiting from the program..");
             	return;
             default:
             	System.out.println("Invalid Choice");
             
             }
        }while(choice!=0);
	}

}
