/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;
import java.util.Arrays;
import java.util.Scanner;
public class sort1 {
	static void  countFreq(int Ar[]) {
		 int CountD=0;
		boolean visited[] = new boolean[Ar.length];
		Arrays.fill(visited, false);
		for(int i=0;i<Ar.length;i++) {
			if(visited[i]==true) {
				continue;
			}			
			for(int j=i+1;j<Ar.length;j++) {
				if(Ar[i]==Ar[j]) {
					visited[j] = true;
				}
			}
			CountD++;
		}
		System.out.println("The Distinct Elements in given array are : "+CountD);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Len = sc.nextInt();
		int A[] = new int[Len];
		for(int i=0;i<Len;i++) {
			A[i]=sc.nextInt();
		}
		// Printing Elements of an Array.
		for(int E:A) {
			System.out.print(E+" ");
		}
		System.out.println();
		countFreq(A);
	}
}

