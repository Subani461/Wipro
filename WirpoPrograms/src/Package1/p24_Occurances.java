/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;

import java.util.HashMap;
import java.util.Scanner;

public class p24_Occurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<Character,Integer> map = new HashMap<>();
		String str=sc.nextLine();
		str=str.replace(" ","");
		str=str.toLowerCase();
		int count=0;
		for(int i=0;i<str.length();i++) {
			count=0;
			for(int j=0;j<str.length();j++) {
				if(str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			map.put(str.charAt(i), count);
		}
		System.out.println(map);
	}

}
