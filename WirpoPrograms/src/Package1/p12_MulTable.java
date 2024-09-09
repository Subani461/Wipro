/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:47 IST 2024
 */

package Package1;

import java.util.Scanner;

public class p12_MulTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int res;
		for(int i=1;i<=10;i++) {
			res=N*i;
			System.out.println(N+ "*"+i+" = "+res);
		}
		
	}

}
