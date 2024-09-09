/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;
import java.util.Scanner;
public class p64_odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Number=sc.nextInt();
		if(Number%2 == 0) {
			System.out.println(Number+" is an Even Number");
		}
		else {
			System.out.println(Number+" is an Odd Number");
		}
	}

}
