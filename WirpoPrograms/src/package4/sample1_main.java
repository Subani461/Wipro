/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:08:05 IST 2024
 */

package package4;
import package5.sample3;
public class sample1_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample1 sp = new sample1();
// A is private Variable cannot be accessed in another class of same package.
		//System.out.println(sp.A);
// B is default Variable can be accessed in another class of same package.
		System.out.println(sp.B);
// C is protected Variable can be accessed in another class of same package.
		System.out.println(sp.C);
// D is public can be accessed in another class of same package.
		System.out.println(sp.D);
		sample2 sp2 = new sample2();
// display method is present in same package in another class(default)
		sp2.display();
// (protected) subclass present in another package 5
		sample3 sp3 = new sample3();
		sp3.print();
// (protected) can be accessible if subclass present in the same package.
		sp2.print1();
	}

}
