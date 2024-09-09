/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:08:14 IST 2024
 */

package package5;
import java.util.Scanner;
public class ArrayException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int A[] = new int[len];
		for(int i=0;i<len;i++) {
			A[i] = sc.nextInt();
		}
		int sum=0,Avg;
		try {
			for(int i=0;i<=A.length;i++) {
				sum=sum+A[i];
			}
			Avg = sum/len;
			System.out.println("The sum of Elements is : "+sum);
			System.out.println("The Average of Elements is : "+Avg);
		}
		catch(Exception e) {
			System.out.println("Exception occured due to : "+e.getMessage());
		}
	}

}
