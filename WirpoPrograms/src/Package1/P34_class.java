/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;
import java.util.Scanner;
class C7{
	int addNumbers(int X,int Y) {
		return X+Y;
	}
	int subNumbers(int X,int Y) {
		return X-Y;
	}
	int mulNumbers(int X,int Y) {
		return X*Y;
	}
	int divNumbers(int X,int Y) {
		return X/Y;
	}
	int maxOfNumbers(int X,int Y) {
		int max=0;
		if(X>Y) {
			max=X;
		}
		else {
			max=Y;
		}
		return max;
	}
	int minOfNumbers(int X,int Y) {
		int min=0;
		if(X<Y) {
			min=X;
		}
		else {
			min=Y;
		}
		return min;
	}
}
public class P34_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A =sc.nextInt();
		int B=sc.nextInt();
		C7 c = new C7();
		System.out.println(c.addNumbers(A, B));
		System.out.println(c.subNumbers(A, B));
		System.out.println(c.mulNumbers(A, B));
		System.out.println(c.divNumbers(A, B));
		System.out.println(c.maxOfNumbers(A, B));
		System.out.println(c.minOfNumbers(A, B));

	}

}
