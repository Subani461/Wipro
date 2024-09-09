/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;
import java.util.Scanner;
public class p81_MulExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			String str=null;
			System.out.println(str.length());
			System.out.println("Enter a number : ");
			int Num1 = sc.nextInt();
			int Num2 = sc.nextInt();
			//Exception 1
			int Num3 = Num1/Num2;
			System.out.println(Num3);
			//Exception 2
			int length=sc.nextInt();
			int Array[] = new int[length];
			for(int i=0;i<length;i++) {
				Array[i]=sc.nextInt();
			}
			
			for(int i=0;i<length;i++) {
				System.out.println(Array[i]+" ");
			}
	   }
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
