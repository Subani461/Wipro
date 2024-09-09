/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:47 IST 2024
 */

package Package1;

import java.util.Scanner;

public class p18_ASBS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		str=str.toLowerCase();
		int countA=0,countB=0;
		for(int i=0;i<str.length();i++) {
			switch(str.charAt(i)) {
			case 'a':
				countA++;
				break;
			case 'b':
				countB++;
				break;
			}	
		}
		System.out.println("No of A's in a given String : "+countA);
		System.out.println("No of B's in a given String : "+countB);
	}

}
