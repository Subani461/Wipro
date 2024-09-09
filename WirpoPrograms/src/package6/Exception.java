/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:08:25 IST 2024
 */

package package6;
import java.util.Scanner;
public class Exception {
	static void validateAge(int X) {
		if(X<21) {
			throw new ArithmeticException("Please enter between 21 and 60");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Age = sc.nextInt();
		try {
			validateAge(Age);
		}
		catch(ArithmeticException e) {
			System.out.println("The exception occured due to : "+e);
		}
	}

}
