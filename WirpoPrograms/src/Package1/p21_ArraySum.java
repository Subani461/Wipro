/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;

import java.util.Arrays;
import java.util.Scanner;

public class p21_ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();
		int arr[] = new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int sum=0,Avg,Max,Min;
		for(int i=0;i<N;i++) {
			sum=sum+arr[i];
		}
		Avg=sum/N;
		Min=arr[0];
		Max=arr[N-1];
		System.out.println("The Sum of Array Elements is : "+sum);
		System.out.println("The Average of Array Elements is : "+Avg);
		System.out.println("The Maximum number in Array Elements is : "+Max);
		System.out.println("The Minimum number in Array Elements is : "+Min);
	}

}
