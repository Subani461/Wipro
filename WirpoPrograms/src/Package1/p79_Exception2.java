/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;

import java.util.Scanner;

public class p79_Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Num1 = sc.nextInt();
		int Num2 = sc.nextInt();
		int Num3;
		try {
			Num3=Num1/Num2;
			System.out.println(Num3);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
	}

}
