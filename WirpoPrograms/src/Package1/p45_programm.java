/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;
class c111{
	void display() {
		System.out.println("Display1..");
	}
}
class c22 extends c111{	
	void display(String str) {
		super.display();
		System.out.println(str);
	}
}
class c33 extends c22 {
	void display(int N) {
		super.display("Asif");
		System.out.println(N);
	}
}
public class p45_programm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c33 c3 = new c33();
		c3.display(100);
	}

}
