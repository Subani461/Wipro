/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:08:14 IST 2024
 */

package package5;

import java.util.Scanner;

public class throwsEx {
	static void validate(int X,String N) throws Exception {
		if(X<0) {
			throw new Exception("Age cannot be Negative");
		}
		if(N==null) {
			throw new Exception("Nmae is null");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age : ");
		int Age = sc.nextInt();
		System.out.println("Enter Name : ");
		String Name = sc.nextLine();
		try {
			validate(Age,Name);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		try {
			validate(Age,Name);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
