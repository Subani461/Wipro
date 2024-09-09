/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;

import java.util.Scanner;

class c1{
	int Add(int X,int Y) {
		return X+Y;
	}
}
public class p27_AddNumbersMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b=sc.nextInt();
		c1 c = new c1();
		System.out.println(c.Add(a, b));
	}

}
