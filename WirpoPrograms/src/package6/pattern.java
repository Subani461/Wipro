/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:08:25 IST 2024
 */

package package6;
import java.util.*;
public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Num = sc.nextInt();
		for(int i=1;i<=Num ;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
