/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

//Greatest of 2 numbers implementing by using Methods.
package Package1;
import java.util.Scanner;
class c2{
	int findGreatest(int X,int Y) {
		return X>Y?X:Y;
	}
}
public class p28_FindGreatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b=sc.nextInt();
		c2 c = new c2();
		int max=c.findGreatest(a, b);
		System.out.println(max);
	}

}
