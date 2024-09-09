/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;

import java.util.Scanner;

class c10{
	int rollNumber;
	String Name;
	int Age;
	//Para Constructor
	c10(int X,String Namee,int A){
		rollNumber=X;
		Name=Namee;
		Age=A;
	}
	void print() {
		System.out.println("My Roll Number is : "+rollNumber);
		System.out.println("My Name is : "+Name);
		System.out.println("My Age is : "+Age);

	}
}

public class p37_paraConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt();
		String Name =sc.next();
		int Age = sc.nextInt();
		c10 c = new c10(A,Name,Age);
		c.print();
	}

}
