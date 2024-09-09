/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:08:14 IST 2024
 */

package package5;
import java.util.Scanner;
public class Throw {
	static void validateAge(int X) {
		if(X<18) {
			throw new ArithmeticException("Invalid Age");
		}
		else {
			System.out.println("Valid Age..");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Age = sc.nextInt();
		validateAge(Age);
	}

}
