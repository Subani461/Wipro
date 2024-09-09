/*
  Name : Asifkhan
  Description : Checking Whether Strings are Anagram or not.
  Date : 22/07/2024
 */
package Exercise1;

import java.util.Arrays;
import java.util.Scanner;

public class p88_Anagram {
	static boolean checkAnagram(String S1,String S2) {
		// Remove spaces from String
		S1=S1.replaceAll(" ", "");	
		S2=S2.replaceAll(" ", "");	
		// Converting into Lower Cases.
		S1=S1.toLowerCase();
		S2=S2.toLowerCase();
		char ch1[] = new char[S1.length()];
		char ch2[] = new char[S2.length()];
		//Converting Strings to Arrays.
		ch1=S1.toCharArray();
		ch2=S2.toCharArray();
		//Sorting Arrays.
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		//Check whether arrays are equal or not.
		return Arrays.equals(ch1,ch2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1=sc.nextLine();
		String str2= sc.nextLine();
		if(checkAnagram(str1,str2)) {
			System.out.println("Given Strings are Anagrms to each other");
		}
		else {
			System.out.println("Given Strings are not Anagrms to each other");
		}
	}

}
