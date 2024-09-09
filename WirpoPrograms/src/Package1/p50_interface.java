/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;
interface A{
	void display();
}
class B implements A{
	public void display() {
		System.out.println("SafeMode");
	}
}
class C implements A{
	public void display() {
		System.out.println("Danger Mode");
	}
}
public class p50_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B a = new B();
		a.display();
		a.display();
		C c = new C();
		c.display();
	}

}
