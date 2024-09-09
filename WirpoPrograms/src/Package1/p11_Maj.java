/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:47 IST 2024
 */

package Package1;

import java.util.Scanner;

public class p11_Maj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Age=sc.nextInt();
		if(Age>=18) {
			System.out.println("He is Eligible to Cast His Vote");
		}
		else {
			System.out.println("He is not Eligible to Cast His Vote");
		}
  }
}
