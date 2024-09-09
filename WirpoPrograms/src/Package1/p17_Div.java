/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:47 IST 2024
 */

package Package1;

import java.util.Scanner;

public class p17_Div {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Num=sc.nextInt();
		if(Num%7 == 0) {
			System.out.println(Num+" divisible by 7");
		}
		else {
			System.out.println(Num+" not divisible by 7");	
		}
	}

}
