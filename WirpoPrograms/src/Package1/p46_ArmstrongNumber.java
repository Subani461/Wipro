/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;
import java.util.Scanner;
public class p46_ArmstrongNumber {
	int count=0;
	int noOfDigits(int X) {
		while(X!=0) {
			X=X/10;
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Number=sc.nextInt();
		p46_ArmstrongNumber A = new p46_ArmstrongNumber();
		int power=A.noOfDigits(Number);
		System.out.println("No of digits : "+power);
		int temp,rem;
		int sum=0;
		temp=Number;
		while(temp!=0) {
			rem=temp%10;
			sum=sum+(int)Math.pow(rem, power);
		    temp=temp/10;
		}
		System.out.println(sum);
		if(Number==sum) {
			System.out.println("Given Number is an Armstrong Number");
		}
		else {
			System.out.println("Given Number is not an Armstrong Number");
		}
	}

}
