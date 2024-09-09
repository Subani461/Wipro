/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:47 IST 2024
 */

package Package1;

import java.util.Scanner;

public class p13_Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
