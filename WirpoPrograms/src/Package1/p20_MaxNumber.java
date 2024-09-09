/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;

import java.util.Scanner;

public class p20_MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();
		int arr[] = new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		int Max=arr[0];
		for(int i=1;i<N;i++) {
			if(arr[i]>Max);{
				Max=arr[i];
			}
		}
		System.out.println("The Maximum Number in an Array is : "+Max);
	}

}
