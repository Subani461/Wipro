/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;
import java.util.Scanner;
public class p66_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i)) == true) {
				count++;
			}
		}
		System.out.println(count);
	}

}
