/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;
class C6{
	void Meth1() {
		System.out.println("Meth1 is Running....");
	}
	void Meth2() {
		System.out.println("Meth2 is Running....");
	}
	void Meth3() {
		System.out.println("Meth3 is Running....");
		Meth1();
		Meth2();
	}
}
public class P33_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C6 c= new C6();
		c.Meth3();
	}

}
