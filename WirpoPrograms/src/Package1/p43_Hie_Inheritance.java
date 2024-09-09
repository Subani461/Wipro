/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;
class Apple{
	void print0() {
		System.out.println("Apple");
	}
}
class pineApple extends Apple{
	void print1() {
		System.out.println("PineApple");
	}
}
class custurdApple extends Apple{
	void print2() {
		System.out.println("CusturdApple");
	}

}
public class p43_Hie_Inheritance { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pineApple Ap = new pineApple();
		Ap.print0();
		Ap.print1();
		custurdApple Ac = new custurdApple();
		Ac.print2();
	}

}
