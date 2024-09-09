/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:08:14 IST 2024
 */

package package5;

import package4.sample1;

public class sample3 extends sample1 {
	/*
	 * (cannot be accessed becase it is default)
	void display() {
		// Cannot be accessed in other package
		System.out.println(B);
	}*/
	public void print() {
		System.out.println(C);
	}
}
