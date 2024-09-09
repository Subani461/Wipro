/*
  Name : Asifkhan
  Description : Finding Whether given Number is Odd or Even.
  Date : 22/07/2024
 */
package Exercise1;
import java.util.Scanner;
public class p87 {
	public static void checkNumber(int X) throws Exception {
		if(X%2!=0) {
			throw new Exception("Odd number");
		}
		else {
			System.out.println("Entered Number is : " +X);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Num=sc.nextInt();
		try {
			checkNumber(Num);
		}
		catch(Exception e) {
			System.out.println("Exception occured due to : "+e.getMessage());
		}
	}

}
