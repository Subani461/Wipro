/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;
class C8{
	void Meth1() {
		System.out.println("Meth1 is Running....");
	}
	void Meth2(int X) {
		System.out.println("Meth2 is Running....");
		System.out.println(X*X);
	}
	void Meth3() {
		System.out.println("Meth3 is Running....");
		Meth1();
		Meth2(5);
	}
}
public class p35_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C8 c= new C8();
		c.Meth3();
	}

}
