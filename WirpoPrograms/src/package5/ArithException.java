/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:08:14 IST 2024
 */

package package5;

import java.util.Scanner;

public class ArithException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int X=sc.nextInt();
		int Y= sc.nextInt();
		try {
			int result = X/Y;
			System.out.println(result);
		}
		catch(ArithmeticException e) {
			System.out.println("The exception occured due to :"+e.getMessage());
		}
	}

}
