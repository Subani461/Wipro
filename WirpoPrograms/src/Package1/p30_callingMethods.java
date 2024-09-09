/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;
class c3{
	void Meth1() {
		System.out.println("method 1 is running...");
		Meth2();
	}
	 void Meth2() {
		System.out.println("method 2 is running...");
	}
}
public class p30_callingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c3 c = new c3();
		c.Meth1();
	}

}
