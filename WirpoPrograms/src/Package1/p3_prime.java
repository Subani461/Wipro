/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;
import java.util.Scanner;
public class p3_prime {
	static boolean isPrime(int N) {
		for(int i=2;i<N/2;i++) {
			if(N%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int X=sc.nextInt();
		System.out.println((isPrime(X)));		
	}

}
