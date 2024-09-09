/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:47 IST 2024
 */

package Package1;

import java.util.Scanner;

public class longestPlindrome {
	static boolean lonPalindrome(int X) {
		int temp,rem,sum=0;
		temp=X;
		while(temp!=0) {
			rem=temp%10;
			sum=(sum*10)+rem;
			temp=temp/10;
		}
		if(X==sum) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int Ar[] = new int[len];
		int i=0,count1=0,result=0;
		while(Ar[0]!=0) {
			count1++;
		}
		int lonP=count1;
		for(int j=0;i<len;j++) {
			Ar[j] = sc.nextInt();
		}
		while(i<len) {
			if(lonPalindrome(Ar[i])) {
				int count=0;
				while(Ar[i]!=0) {
					count++;
				}
				if(count>count1) {
					lonP=count1;
					result=Ar[i];
				}
			}
			i++;
		}
		System.out.println(lonP);
		System.out.println(result);
	}

}
