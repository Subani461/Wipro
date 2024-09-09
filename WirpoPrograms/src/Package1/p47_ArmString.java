/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;
import java.util.Scanner;
public class p47_ArmString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		str=str.toLowerCase();
		String result="";
		for(int i=str.length()-1;i>=0;i--) {
			result=result+str.charAt(i);
		}
		if(str.equals(result)) {
			System.out.println("Palindrome String");
		}
		else {
			System.out.println("Not an Palindrome String");
		}
	}

}
