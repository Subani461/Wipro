/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;

import java.util.Scanner;

public class p23_LongestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();
		String arr[] = new String[N];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextLine();
		}
		int Lon=0;
		int Lword=arr[0].length();
		for(int i=1;i<N;i++) {
			int size;
			size=arr[i].length();
			if(size>Lword) {
				Lword=size;
				Lon=i;
			}
		}
		System.out.println("The Longest Word in a given String Array is : "+arr[Lon]);
	}

}
