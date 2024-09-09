/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:47 IST 2024
 */

package Package1;

import java.util.Scanner;

public class p16_SubjectMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Subjects : ");
		int N=sc.nextInt();
		System.out.println("Enter Maths Marks : ");
		int Maths = sc.nextInt();
		System.out.println("Enter Hindi Marks : ");
		int Hindi = sc.nextInt();
		System.out.println("Enter Telugu Marks : ");
		int Telugu= sc.nextInt();
		System.out.println("Enter Social Marks : ");
		int social = sc.nextInt();
		System.out.println("Enter Urdu Marks : ");
		int urdu = sc.nextInt();
		int sum,Avg;
		sum=Maths+Hindi+Telugu+social+urdu;
		Avg=sum/N;
		System.out.println("Total Marks : "+sum);
		System.out.println("Average of Marks : "+Avg);
	}

}
