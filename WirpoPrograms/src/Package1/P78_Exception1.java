/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;
import java.util.Scanner;
public class P78_Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter a number : ");
			int Num = sc.nextInt();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
