/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:08:25 IST 2024
 */

package package6;

import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String Name = sc.nextLine();
		Name=Name.replaceAll(" ","");
		
		// No of Letters in a given String
		System.out.println(Name.length());
		
		// Converting into LowerCase
		Name=Name.toLowerCase();
		System.out.println(Name);
		
		// Converting into UpperCase
		Name=Name.toUpperCase();
		System.out.println(Name);
		
		//Counting no of Vowels in  a String
		int count=0;
		Name = Name.toLowerCase();
		for(int i=0;i<Name.length();i++) {
			if(Name.charAt(i) == 'a' || Name.charAt(i) == 'e' || Name.charAt(i) == 'i' || Name.charAt(i) == 'o' || Name.charAt(i) == 'u') {
				count++;
			}
		}
		System.out.println("No of Vowels in a given String are : "+count);

	}

}
