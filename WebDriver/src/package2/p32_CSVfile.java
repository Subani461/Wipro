/*
 * Name : Asifkhan
 * Description : Reading data from csv file into console
 * Date : 06/08/2024
 */
package package2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class p32_CSVfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String datafile = "C:\\SeleniumDownloads\\txtdoc.csv";
		BufferedReader br = null;
		String Line ="";
		String cvsSplitBy = ",";
		br = new BufferedReader(new FileReader(datafile));
		while((Line = br.readLine()) != null){
			String [] data = Line.split(cvsSplitBy);
			System.out.println("First Name : "+data[0]);
			System.out.println("Last  Name : "+data[1]);
			System.out.println("Email : "+data[2]);
			System.out.println("Password : "+data[3]);
			System.out.println("Confirm Password : "+data[4]);
			System.out.println("------------------");
		}
	}

}
