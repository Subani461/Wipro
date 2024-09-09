/*
  Name : Asifkhan
  Description : Checking Whether Numbers present in a File or Not.
  Date : 23/07/2024
 */
package Exercise2;

import java.util.Scanner;

public class program1 {
	static boolean checkNumber(char X) {
		if(Character.isDigit(X)) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		boolean result=false;
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			result=checkNumber(ch);
		}
		if(result) {
			System.out.println("Numbers are present in given String");
		}
		else {
			System.out.println("It's a String without numbers");
		}
	}

}
