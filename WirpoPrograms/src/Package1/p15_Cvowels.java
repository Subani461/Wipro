/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:47 IST 2024
 */

package Package1;

import java.util.Scanner;

class p15_Cvowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		str=str.toLowerCase();
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				count++;
			}
		}
		System.out.println("No of Vowels in a given String are : "+count);
	}

}
