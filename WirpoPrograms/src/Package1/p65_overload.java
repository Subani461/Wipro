/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;
import java.util.*;
class Overload{
	String print(String str) {
		return str;
	}
	void print() {
		Date d = new Date();
		System.out.println("Current date is : "+d);
	}
	int print(int X,int Y) {
		return X*Y;
	}
}
public class p65_overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overload Od = new Overload();
		String Name=Od.print("Asif");
		System.out.println("My Name is : "+Name);
		Od.print();
		int Mul=Od.print(10,10);
		System.out.println("Multiplication of 2 Numbers is : "+Mul);
	}

}
