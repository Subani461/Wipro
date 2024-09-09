/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;

import java.util.Scanner;

public class p8_Loperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		System.out.println(A>B && A>C);
		System.out.println(A>B && B>C);
		System.out.println(A>B || A>C);
		System.out.println(A>B || B>C);
	}

}
