/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;

import java.util.Scanner;

public class p80_Exception3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int length=sc.nextInt();
		int Array[] = new int[length];
		for(int i=0;i<length;i++) {
			Array[i]=sc.nextInt();
		}
		try {
			for(int i=0;i<=length;i++) {
				System.out.println(Array[i]+" ");
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

}
