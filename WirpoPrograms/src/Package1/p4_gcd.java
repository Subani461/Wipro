/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;
import java.util.Scanner;
public class p4_gcd {
	static int gcd(int X,int Y) {
		while(X!=Y) {
			if(X>Y) {
				X=X-Y;
			}
			else {
				Y=Y-X;
			}
		}
		return X;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int X=sc.nextInt();
		int Y=sc.nextInt();
		System.out.println(gcd(X,Y));
	}

}
