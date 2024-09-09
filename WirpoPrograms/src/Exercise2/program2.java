/*
  Name : Asifkhan
  Description : Writing the sum of Array,Avg of Array into File.
  Date : 23/07/2024
 */
package Exercise2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class program2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int X1 = sc.nextInt();
		int X2 = sc.nextInt();
		int X3 = sc.nextInt();
		int X4 = sc.nextInt();
		int X5 = sc.nextInt();
		int sum=0,Avg;
		sum=X1+X2+X3+X4+X5;
		Avg=sum/5;
		FileWriter file = new FileWriter("C:\\Files_Programs\\Array.txt");
		BufferedWriter bw = new BufferedWriter(file);
		bw.write(String.valueOf(sum));
		bw.write(String.valueOf(Avg));
	}

}
