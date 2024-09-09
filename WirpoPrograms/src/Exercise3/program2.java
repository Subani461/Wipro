/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:05:53 IST 2024
 */

package Exercise3;

import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum=0,count=0;
		int number;
		while(true) {
			number=sc.nextInt();
			if(number == -999) {
				break;
			}
			sum=sum+number;
			count++;
		}
		int Avg=sum/count;
		System.out.println("Sum of N Numbers is : "+sum);
		System.out.println("Average of N numbers is : "+Avg);
	}

}
