/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:05:53 IST 2024
 */

package Exercise3;

import java.util.Scanner;

public class program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double salary = sc.nextInt();
		double DA=(0.30)*salary;
		double HRA=(0.28)*salary;
		double CCA =(0.20)*salary;
		double PF =(0.08)*salary;
		double Gpay=salary+DA+HRA+CCA+PF;
		double Npay=Gpay-PF;
		System.out.println(Npay);
	}

}
