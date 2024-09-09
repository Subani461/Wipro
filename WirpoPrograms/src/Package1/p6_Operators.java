/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;
import java.util.Scanner;
public class p6_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int Add,Sb,Mul,Div,Rem;
		Add=A+B;
		Sb=A-B;
		Mul=A*B;
		Div=A/B;
		Rem=A%B;
		System.out.println("Addition of 2 numbers is : "+Add);
		System.out.println("Subtraction of 2 numbers is : "+Sb);
		System.out.println("Multiplication of 2 numbers is : "+Mul);
		System.out.println("Division of 2 numbers is : "+Div);
		System.out.println("Addition of 2 numbers is : "+Rem);
	}

}
