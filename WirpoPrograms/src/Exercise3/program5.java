/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:05:53 IST 2024
 */

package Exercise3;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int len=sc.nextInt();
		int Ar[] = new int[len]; 
		for(int i=0;i<len;i++) {
			Ar[i] = sc.nextInt();
		}
		Arrays.sort(Ar);
		// Printing in the Ascending Order.
		for(int X:Ar) {
			System.out.print(X+" ");
		}
		// Printing in the descending order.
		System.out.println();
		for(int i=0;i<len;i++) {
			for(int j=0;j<len-1-i;j++) {
				if(Ar[j]<Ar[j+1]) {
					int temp= Ar[j];
					Ar[j]=Ar[j+1];
					Ar[j+1]=temp;
				}
			}
		}
		for(int Y:Ar) {
			System.out.print(Y+" ");
		}
	}

}
